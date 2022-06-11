package com.entity;

import com.util.VeDate;

public class Complains {
	private String complainsid = "C" + VeDate.getStringId();// 生成主键编号
	private String usersid;// 用户
	private String ordersid;// 订单
	private String sellerid;// 商户
	private String goodsid;// 食品
	private String title;// 标题
	private String contents;// 内容
	private String addtime;// 日期
	private String status;// 状态
	private String reps;// 回复内容
	private String username;// 映射数据
	private String ordercode;// 映射数据
	private String shopname;// 映射数据
	private String goodsname;// 映射数据

	public String getComplainsid() {
		return complainsid;
	}

	public void setComplainsid(String complainsid) {
		this.complainsid = complainsid;
	}

	public String getUsersid() {
		return this.usersid;
	}

	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}

	public String getOrdersid() {
		return this.ordersid;
	}

	public void setOrdersid(String ordersid) {
		this.ordersid = ordersid;
	}

	public String getSellerid() {
		return this.sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
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

	public String getReps() {
		return this.reps;
	}

	public void setReps(String reps) {
		this.reps = reps;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrdercode() {
		return this.ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Complains [complainsid=" + this.complainsid + ", usersid=" + this.usersid + ", ordersid="
				+ this.ordersid + ", sellerid=" + this.sellerid + ", goodsid=" + this.goodsid + ", title=" + this.title
				+ ", contents=" + this.contents + ", addtime=" + this.addtime + ", status=" + this.status + ", reps="
				+ this.reps + ", username=" + this.username + ", ordercode=" + this.ordercode + ", shopname="
				+ this.shopname + ", goodsname=" + this.goodsname + "]";
	}

}

/**
 * 此程序作者 QQ:709664889 如有修改请联系本QQ 可以付费修改
 */
