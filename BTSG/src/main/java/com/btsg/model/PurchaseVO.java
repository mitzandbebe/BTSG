package com.btsg.model;

import java.sql.Timestamp;

public class PurchaseVO {
	private int purchase_no;
	private int user_no;
	private int goods_no;
	private int concert_no;
	private String paymentOption;
	private int price;
	private Timestamp paymentDate;
	private String delFlag;
	public PurchaseVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseVO(int purchase_no, int user_no, int goods_no, int concert_no, String paymentOption, int price,
			Timestamp paymentDate, String delFlag) {
		super();
		this.purchase_no = purchase_no;
		this.user_no = user_no;
		this.goods_no = goods_no;
		this.concert_no = concert_no;
		this.paymentOption = paymentOption;
		this.price = price;
		this.paymentDate = paymentDate;
		this.delFlag = delFlag;
	}
	public int getPurchase_no() {
		return purchase_no;
	}
	public void setPurchase_no(int purchase_no) {
		this.purchase_no = purchase_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(int goods_no) {
		this.goods_no = goods_no;
	}
	public int getConcert_no() {
		return concert_no;
	}
	public void setConcert_no(int concert_no) {
		this.concert_no = concert_no;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Timestamp getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "PurchaseVO [purchase_no=" + purchase_no + ", user_no=" + user_no + ", goods_no=" + goods_no
				+ ", concert_no=" + concert_no + ", paymentOption=" + paymentOption + ", price=" + price
				+ ", paymentDate=" + paymentDate + ", delFlag=" + delFlag + "]";
	}
	
	
}
