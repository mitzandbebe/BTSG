package com.btsg.model;

public class MycartVO {
	private int cart_no;
	private int user_no;
	private int goods_no;
	private int concert_no;
	private int qty;
	private String c_g;
	private String delFalg;
	public MycartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MycartVO(int cart_no, int user_no, int goods_no, int concert_no, int qty, String c_g, String delFalg) {
		super();
		this.cart_no = cart_no;
		this.user_no = user_no;
		this.goods_no = goods_no;
		this.concert_no = concert_no;
		this.qty = qty;
		this.c_g = c_g;
		this.delFalg = delFalg;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getC_g() {
		return c_g;
	}
	public void setC_g(String c_g) {
		this.c_g = c_g;
	}
	public String getDelFalg() {
		return delFalg;
	}
	public void setDelFalg(String delFalg) {
		this.delFalg = delFalg;
	}
	@Override
	public String toString() {
		return "MycartVO [cart_no=" + cart_no + ", user_no=" + user_no + ", goods_no=" + goods_no + ", concert_no="
				+ concert_no + ", qty=" + qty + ", c_g=" + c_g + ", delFalg=" + delFalg + "]";
	}
	
}
