package com.btsg.model;

import java.sql.Timestamp;

public class UserVO {
	private int user_no;
	private String user_name;
	private String user_id;
	private String user_password;
	private String nickname;
	private String email;
	private String birth;
	private String hp;
	private String user_address;
	private String basic_payment;
	private String card_num;
	private Timestamp user_regdate;
	private Timestamp delFalg;
	private String original_name;
	private long file_size;
	private String upload_name;
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(int user_no, String user_name, String user_id, String user_password, String nickname, String email,
			String birth, String hp, String user_address, String basic_payment, String card_num, Timestamp user_regdate,
			Timestamp delFalg, String original_name, long file_size, String upload_name) {
		super();
		this.user_no = user_no;
		this.user_name = user_name;
		this.user_id = user_id;
		this.user_password = user_password;
		this.nickname = nickname;
		this.email = email;
		this.birth = birth;
		this.hp = hp;
		this.user_address = user_address;
		this.basic_payment = basic_payment;
		this.card_num = card_num;
		this.user_regdate = user_regdate;
		this.delFalg = delFalg;
		this.original_name = original_name;
		this.file_size = file_size;
		this.upload_name = upload_name;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getBasic_payment() {
		return basic_payment;
	}
	public void setBasic_payment(String basic_payment) {
		this.basic_payment = basic_payment;
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	public Timestamp getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(Timestamp user_regdate) {
		this.user_regdate = user_regdate;
	}
	public Timestamp getDelFalg() {
		return delFalg;
	}
	public void setDelFalg(Timestamp delFalg) {
		this.delFalg = delFalg;
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
	@Override
	public String toString() {
		return "UserVO [user_no=" + user_no + ", user_name=" + user_name + ", user_id=" + user_id + ", user_password="
				+ user_password + ", nickname=" + nickname + ", email=" + email + ", birth=" + birth + ", hp=" + hp
				+ ", user_address=" + user_address + ", basic_payment=" + basic_payment + ", card_num=" + card_num
				+ ", user_regdate=" + user_regdate + ", delFalg=" + delFalg + ", original_name=" + original_name
				+ ", file_size=" + file_size + ", upload_name=" + upload_name + "]";
	}
	
	
}
