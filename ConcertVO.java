package com.btsg.model;

import java.sql.Timestamp;

public class ConcertVO {
	private int concert_no;
	private String concert_name;
	private int hall_no;
	private Timestamp concert_date;
	private String original_name;
	private long file_size;
	private String upload_name;
	private int price;
	private float rate;
	private String soldout;
	private String seat_no;
	private String reserved;
	private int seat_price;
	public ConcertVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConcertVO(int concert_no, String concert_name, int hall_no, Timestamp concert_date, String original_name,
			long file_size, String upload_name, int price, float rate, String soldout, String seat_no, String reserved,
			int seat_price) {
		super();
		this.concert_no = concert_no;
		this.concert_name = concert_name;
		this.hall_no = hall_no;
		this.concert_date = concert_date;
		this.original_name = original_name;
		this.file_size = file_size;
		this.upload_name = upload_name;
		this.price = price;
		this.rate = rate;
		this.soldout = soldout;
		this.seat_no = seat_no;
		this.reserved = reserved;
		this.seat_price = seat_price;
	}
	public int getConcert_no() {
		return concert_no;
	}
	public void setConcert_no(int concert_no) {
		this.concert_no = concert_no;
	}
	public String getConcert_name() {
		return concert_name;
	}
	public void setConcert_name(String concert_name) {
		this.concert_name = concert_name;
	}
	public int getHall_no() {
		return hall_no;
	}
	public void setHall_no(int hall_no) {
		this.hall_no = hall_no;
	}
	public Timestamp getConcert_date() {
		return concert_date;
	}
	public void setConcert_date(Timestamp concert_date) {
		this.concert_date = concert_date;
	}
	public String getOriginal_name() {
		return original_name;
	}
	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public String getUpload_name() {
		return upload_name;
	}
	public void setUpload_name(String upload_name) {
		this.upload_name = upload_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getSoldout() {
		return soldout;
	}
	public void setSoldout(String soldout) {
		this.soldout = soldout;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	public int getSeat_price() {
		return seat_price;
	}
	public void setSeat_price(int seat_price) {
		this.seat_price = seat_price;
	}
	@Override
	public String toString() {
		return "ConcertVO [concert_no=" + concert_no + ", concert_name=" + concert_name + ", hall_no=" + hall_no
				+ ", concert_date=" + concert_date + ", original_name=" + original_name + ", file_size=" + file_size
				+ ", upload_name=" + upload_name + ", price=" + price + ", rate=" + rate + ", soldout=" + soldout
				+ ", seat_no=" + seat_no + ", reserved=" + reserved + ", seat_price=" + seat_price + "]";
	}
	
	
	
}
