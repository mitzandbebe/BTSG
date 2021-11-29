package com.btsg.model;

public class HallVO {
	private int hall_no;
	private String hall_name;
	private String hall_address;
	private int max_capacity;
	public HallVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HallVO(int hall_no, String hall_name, String hall_address, int max_capacity) {
		super();
		this.hall_no = hall_no;
		this.hall_name = hall_name;
		this.hall_address = hall_address;
		this.max_capacity = max_capacity;
	}
	public int getHall_no() {
		return hall_no;
	}
	public void setHall_no(int hall_no) {
		this.hall_no = hall_no;
	}
	public String getHall_name() {
		return hall_name;
	}
	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}
	public String getHall_address() {
		return hall_address;
	}
	public void setHall_address(String hall_address) {
		this.hall_address = hall_address;
	}
	public int getMax_capacity() {
		return max_capacity;
	}
	public void setMax_capacity(int max_capacity) {
		this.max_capacity = max_capacity;
	}
	@Override
	public String toString() {
		return "HallVO [hall_no=" + hall_no + ", hall_name=" + hall_name + ", hall_address=" + hall_address
				+ ", max_capacity=" + max_capacity + "]";
	}
	
	
}
