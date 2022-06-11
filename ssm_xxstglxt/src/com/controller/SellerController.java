package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Seller;
import com.service.SellerService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/seller", produces = "text/plain;charset=utf-8")
public class SellerController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private SellerService sellerService;

	@RequestMapping("index.action")
	public String index() {
		return "seller/index";
	}

	// 管理员登录 1 验证用户名是否存在 2 验证密码是否正确
	@RequestMapping("login.action")
	public String login() {
		String username = this.getRequest().getParameter("username");
		String password = this.getRequest().getParameter("password");
		Seller sellerEntity = new Seller();
		sellerEntity.setUsername(username);
		List<Seller> sellerlist = this.sellerService.getSellerByCond(sellerEntity);
		if (sellerlist.size() == 0) {
			this.getRequest().setAttribute("message", "用户名不存在");
			return "seller/index";
		} else {
			Seller seller = sellerlist.get(0);
			if ("锁定".equals(seller.getStatus())) {
				this.getSession().setAttribute("message", "账户被锁定");
				return "redirect:/seller/index.action";
			}
			if (password.equals(seller.getPassword())) {
				this.getSession().setAttribute("sellerid", seller.getSellerid());
				this.getSession().setAttribute("sellername", seller.getUsername());
				this.getSession().setAttribute("realname", seller.getShopname());
				this.getSession().setAttribute("role", "商家用户");
			} else {
				this.getRequest().setAttribute("message", "密码错误");
				return "seller/index";
			}
		}
		return "seller/main";
	}

	// 管理员准备修改密码
	@RequestMapping("prePwd.action")
	public String prePwd() {
		return "seller/editpwd";
	}

	// 修改密码
	@RequestMapping("editpwd.action")
	public String editpwd() {
		String sellerid = (String) this.getSession().getAttribute("sellerid");
		String password = this.getRequest().getParameter("password");
		String repassword = this.getRequest().getParameter("repassword");
		Seller seller = this.sellerService.getSellerById(sellerid);
		if (password.equals(seller.getPassword())) {
			seller.setPassword(repassword);
			this.sellerService.updateSeller(seller);
		} else {
			this.getRequest().setAttribute("message", "旧密码错误");
		}
		return "redirect:/seller/prePwd.action";
	}

	@RequestMapping("userinfo.action")
	public String userinfo() {
		String sellerid = (String) this.getSession().getAttribute("sellerid");
		Seller seller = this.sellerService.getSellerById(sellerid);
		this.getRequest().setAttribute("seller", seller);
		return "seller/userinfo";
	}

	@RequestMapping("personal.action")
	public String personal(Seller seller) {
		this.sellerService.updateSeller(seller);
		return "redirect:/seller/userinfo.action";
	}

	// 准备添加数据
	@RequestMapping("createSeller.action")
	public String createSeller() {
		return "admin/addseller";
	}

	// 添加数据
	@RequestMapping("addSeller.action")
	public String addSeller(Seller seller) {
		seller.setStatus("");
		seller.setRegdate(VeDate.getStringDateShort());
		this.sellerService.insertSeller(seller);
		return "redirect:/seller/createSeller.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteSeller.action")
	public String deleteSeller(String id) {
		this.sellerService.deleteSeller(id);
		return "redirect:/seller/getAllSeller.action";
	}

	// 批量删除数据
	@RequestMapping("deleteSellerByIds.action")
	public String deleteSellerByIds() {
		String[] ids = this.getRequest().getParameterValues("sellerid");
		for (String sellerid : ids) {
			this.sellerService.deleteSeller(sellerid);
		}
		return "redirect:/seller/getAllSeller.action";
	}

	// 更新数据
	@RequestMapping("updateSeller.action")
	public String updateSeller(Seller seller) {
		this.sellerService.updateSeller(seller);
		return "redirect:/seller/getAllSeller.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "正常";
		Seller seller = this.sellerService.getSellerById(id);
		if (status.equals(seller.getStatus())) {
			status = "锁定";
		}
		seller.setStatus(status);
		this.sellerService.updateSeller(seller);
		return "redirect:/seller/getAllSeller.action";
	}

	// 显示全部数据
	@RequestMapping("getAllSeller.action")
	public String getAllSeller(String number) {
		List<Seller> sellerList = this.sellerService.getAllSeller();
		PageHelper.getPage(sellerList, "seller", null, null, 10, number, this.getRequest(), null);
		return "admin/listseller";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("querySellerByCond.action")
	public String querySellerByCond(String cond, String name, String number) {
		Seller seller = new Seller();
		if (cond != null) {
			if ("username".equals(cond)) {
				seller.setUsername(name);
			}
			if ("password".equals(cond)) {
				seller.setPassword(name);
			}
			if ("shopname".equals(cond)) {
				seller.setShopname(name);
			}
			if ("idcard".equals(cond)) {
				seller.setIdcard(name);
			}
			if ("contact".equals(cond)) {
				seller.setContact(name);
			}
			if ("address".equals(cond)) {
				seller.setAddress(name);
			}
			if ("workdate".equals(cond)) {
				seller.setWorkdate(name);
			}
			if ("status".equals(cond)) {
				seller.setStatus(name);
			}
			if ("regdate".equals(cond)) {
				seller.setRegdate(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.sellerService.getSellerByLike(seller), "seller", nameList, valueList, 10, number,
				this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryseller";
	}

	// 按主键查询数据
	@RequestMapping("getSellerById.action")
	public String getSellerById(String id) {
		Seller seller = this.sellerService.getSellerById(id);
		this.getRequest().setAttribute("seller", seller);
		return "admin/editseller";
	}

	public SellerService getSellerService() {
		return sellerService;
	}

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}

}
// 程序开发 QQ 709664889 可以付费修改
