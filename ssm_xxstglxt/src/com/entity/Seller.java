package com.entity;

import com.util.VeDate;

public class Seller {
	private String sellerid = "S" + VeDate.getStringId();// 生成主键编号
	private String username;// 用户名
	private String password;// 密码
	private String shopname;// 商铺名称
	private String idcard;// 身份证
	private String contact;// 联系方式
	private String address;// 商铺地点
	private String workdate;// 开业日期
	private String status;// 状态
	private String regdate;// 注册日期

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWorkdate() {
		return this.workdate;
	}

	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegdate() {
		return this.regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Seller [sellerid=" + this.sellerid + ", username=" + this.username + ", password=" + this.password
				+ ", shopname=" + this.shopname + ", idcard=" + this.idcard + ", contact=" + this.contact + ", address="
				+ this.address + ", workdate=" + this.workdate + ", status=" + this.status + ", regdate=" + this.regdate
				+ "]";
	}

}

/**
 * 此程序作者 QQ:709664889 如有修改请联系本QQ 可以付费修改
 */
