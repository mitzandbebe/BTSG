package com.btsg.model;

public class ReservationVO {
	private int reser_no;
	private int user_no;
	private int concert_no;
	public ReservationVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationVO(int reser_no, int user_no, int concert_no) {
		super();
		this.reser_no = reser_no;
		this.user_no = user_no;
		this.concert_no = concert_no;
	}
	public int getReser_no() {
		return reser_no;
	}
	public void setReser_no(int reser_no) {
		this.reser_no = reser_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getConcert_no() {
		return concert_no;
	}
	public void setConcert_no(int concert_no) {
		this.concert_no = concert_no;
	}
	@Override
	public String toString() {
		return "ReservationVO [reser_no=" + reser_no + ", user_no=" + user_no + ", concert_no=" + concert_no + "]";
	}
	
	
	
}
