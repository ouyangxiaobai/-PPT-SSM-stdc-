package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Orders;
import com.service.OrdersService;
import com.entity.Users;
import com.entity.Goods;
import com.entity.Seller;
import com.service.UsersService;
import com.service.GoodsService;
import com.service.SellerService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/orders", produces = "text/plain;charset=utf-8")
public class OrdersController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private OrdersService ordersService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private SellerService sellerService;

	// 准备添加数据
	@RequestMapping("createOrders.action")
	public String createOrders() {
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		List<Goods> goodsList = this.goodsService.getAllGoods();
		this.getRequest().setAttribute("goodsList", goodsList);
		List<Seller> sellerList = this.sellerService.getAllSeller();
		this.getRequest().setAttribute("sellerList", sellerList);
		return "admin/addorders";
	}

	// 添加数据
	@RequestMapping("addOrders.action")
	public String addOrders(Orders orders) {
		this.ordersService.insertOrders(orders);
		return "redirect:/orders/createOrders.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteOrders.action")
	public String deleteOrders(String id) {
		this.ordersService.deleteOrders(id);
		return "redirect:/orders/getAllOrders.action";
	}

	// 批量删除数据
	@RequestMapping("deleteOrdersByIds.action")
	public String deleteOrdersByIds() {
		String[] ids = this.getRequest().getParameterValues("ordersid");
		for (String ordersid : ids) {
			this.ordersService.deleteOrders(ordersid);
		}
		return "redirect:/orders/getAllOrders.action";
	}

	// 更新数据
	@RequestMapping("updateOrders.action")
	public String updateOrders(Orders orders) {
		this.ordersService.updateOrders(orders);
		return "redirect:/orders/getAllOrders.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "已发货";
		Orders orders = this.ordersService.getOrdersById(id);
		orders.setStatus(status);
		this.ordersService.updateOrders(orders);
		return "redirect:/orders/getSellerOrders.action";
	}

	// 显示全部数据
	@RequestMapping("getAllOrders.action")
	public String getAllOrders(String number) {
		List<Orders> ordersList = this.ordersService.getAllOrders();
		PageHelper.getPage(ordersList, "orders", null, null, 10, number, this.getRequest(), null);
		return "admin/listorders";
	}

	@RequestMapping("getSellerOrders.action")
	public String getSellerOrders(String number) {
		String sellerid = (String) this.getSession().getAttribute("sellerid");
		Orders orders = new Orders();
		orders.setSellerid(sellerid);
		List<Orders> ordersList = this.ordersService.getOrdersByCond(orders);
		PageHelper.getUserPage(ordersList, "orders", "getSellerOrders", 10, number, this.getRequest());
		return "seller/listorders";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryOrdersByCond.action")
	public String queryOrdersByCond(String cond, String name, String number) {
		Orders orders = new Orders();
		if (cond != null) {
			if ("ordercode".equals(cond)) {
				orders.setOrdercode(name);
			}
			if ("usersid".equals(cond)) {
				orders.setUsersid(name);
			}
			if ("goodsid".equals(cond)) {
				orders.setGoodsid(name);
			}
			if ("sellerid".equals(cond)) {
				orders.setSellerid(name);
			}
			if ("price".equals(cond)) {
				orders.setPrice(name);
			}
			if ("num".equals(cond)) {
				orders.setNum(name);
			}
			if ("total".equals(cond)) {
				orders.setTotal(name);
			}
			if ("addtime".equals(cond)) {
				orders.setAddtime(name);
			}
			if ("status".equals(cond)) {
				orders.setStatus(name);
			}
			if ("receiver".equals(cond)) {
				orders.setReceiver(name);
			}
			if ("address".equals(cond)) {
				orders.setAddress(name);
			}
			if ("contact".equals(cond)) {
				orders.setContact(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.ordersService.getOrdersByLike(orders), "orders", nameList, valueList, 10, number,
				this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryorders";
	}

	// 按主键查询数据
	@RequestMapping("getOrdersById.action")
	public String getOrdersById(String id) {
		Orders orders = this.ordersService.getOrdersById(id);
		this.getRequest().setAttribute("orders", orders);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		List<Goods> goodsList = this.goodsService.getAllGoods();
		this.getRequest().setAttribute("goodsList", goodsList);
		List<Seller> sellerList = this.sellerService.getAllSeller();
		this.getRequest().setAttribute("sellerList", sellerList);
		return "admin/editorders";
	}

	public OrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

}
// 程序开发 QQ 709664889 可以付费修改
