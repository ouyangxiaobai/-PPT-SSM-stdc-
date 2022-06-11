package com.entity;

import com.util.VeDate;

public class Goods {
	private String goodsid = "G" + VeDate.getStringId();// 生成主键编号
	private String sellerid;// 店铺
	private String goodsname;// 名称
	private String cateid;// 类型
	private String image;// 图片
	private String price;// 销售价
	private String addtime;// 上架日期
	private String sellnum;// 销售数量
	private String hits;// 点击数
	private String status;// 状态
	private String contents;// 详情
	private String shopname;// 映射数据
	private String catename;// 映射数据

	public String getGoodsid() {
		return goodsid;
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

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getCateid() {
		return this.cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddtime() {
		return this.addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getSellnum() {
		return this.sellnum;
	}

	public void setSellnum(String sellnum) {
		this.sellnum = sellnum;
	}

	public String getHits() {
		return this.hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getCatename() {
		return this.catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	// 重载方法 生成JSON类型字符串
	@Override
	public String toString() {
		return "Goods [goodsid=" + this.goodsid + ", sellerid=" + this.sellerid + ", goodsname=" + this.goodsname
				+ ", cateid=" + this.cateid + ", image=" + this.image + ", price=" + this.price + ", addtime="
				+ this.addtime + ", sellnum=" + this.sellnum + ", hits=" + this.hits + ", status=" + this.status
				+ ", contents=" + this.contents + ", shopname=" + this.shopname + ", catename=" + this.catename + "]";
	}

}

/**
 * 此程序作者 QQ:709664889 如有修改请联系本QQ 可以付费修改
 */
