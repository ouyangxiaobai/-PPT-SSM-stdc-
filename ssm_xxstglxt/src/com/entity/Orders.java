package com.entity;

import com.util.VeDate;

public class Orders {
	private String ordersid = "O" + VeDate.getStringId();// 生成主键编号
	private String ordercode;// 订单
	private String usersid;// 用户
	private String goodsid;// 食品
	private String sellerid;// 商户
	private String price;// 单价
	private String num;// 数量
	private String total;// 总计
	private String addtime;// 下单日期
	private String status;// 状态
	private String receiver;// 收货人
	private String address;// 送餐地址
	private String contact;// 联系方式
	private String username;// 映射数据
	private String goodsname;// 映射数据
	private String shopname;// 映射数据

	public String getOrdersid() {
		return ordersid;
	}

	public void setOrdersid(String ordersid) {
		this.ordersid = ordersid;
	}

	public String getOrdercode() {
		return this.ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getUsersid() {
		return this.usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getSellerid() {
		return this.sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Orders [ordersid=" + this.ordersid + ", ordercode=" + this.ordercode + ", usersid=" + this.usersid
				+ ", goodsid=" + this.goodsid + ", sellerid=" + this.sellerid + ", price=" + this.price + ", num="
				+ this.num + ", total=" + this.total + ", addtime=" + this.addtime + ", status=" + this.status
				+ ", receiver=" + this.receiver + ", address=" + this.address + ", contact=" + this.contact
				+ ", username=" + this.username + ", goodsname=" + this.goodsname + ", shopname=" + this.shopname + "]";
	}

}

/**
 * 此程序作者 QQ:709664889 如有修改请联系本QQ 可以付费修改
 */
