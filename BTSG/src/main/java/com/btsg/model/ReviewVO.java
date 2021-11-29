package com.btsg.model;

import java.sql.Timestamp;

public class ReviewVO {
	private int review_no;
	private int goods_no;
	private int user_no;
	private int concert_no;
	private String content;
	private String original_name;
	private long file_size;
	private String upload_name;
	private Timestamp date;
	private float rate;
	private String delFlag;
	public ReviewVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewVO(int review_no, int goods_no, int user_no, int concert_no, String content, String original_name,
			long file_size, String upload_name, Timestamp date, float rate, String delFlag) {
		super();
		this.review_no = review_no;
		this.goods_no = goods_no;
		this.user_no = user_no;
		this.concert_no = concert_no;
		this.content = content;
		this.original_name = original_name;
		this.file_size = file_size;
		this.upload_name = upload_name;
		this.date = date;
		this.rate = rate;
		this.delFlag = delFlag;
	}
	public int getReview_no() {
		return review_no;
	}
	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	public int getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(int goods_no) {
		this.goods_no = goods_no;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "Review [review_no=" + review_no + ", goods_no=" + goods_no + ", user_no=" + user_no + ", concert_no="
				+ concert_no + ", content=" + content + ", original_name=" + original_name + ", file_size=" + file_size
				+ ", upload_name=" + upload_name + ", date=" + date + ", rate=" + rate + ", delFlag=" + delFlag + "]";
	}
	
}
