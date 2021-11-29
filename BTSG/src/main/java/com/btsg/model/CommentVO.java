package com.btsg.model;

import java.sql.Timestamp;

public class CommentVO {
	private int comment_no;
	private int news_no;
	private int user_no;
	private String content;
	private Timestamp regdate;
	private String delFlag;
	public CommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentVO(int comment_no, int news_no, int user_no, String content, Timestamp regdate, String delFlag) {
		super();
		this.comment_no = comment_no;
		this.news_no = news_no;
		this.user_no = user_no;
		this.content = content;
		this.regdate = regdate;
		this.delFlag = delFlag;
	}
	public int getComment_no() {
		return comment_no;
	}
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}
	public int getNews_no() {
		return news_no;
	}
	public void setNews_no(int news_no) {
		this.news_no = news_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "CommentVO [comment_no=" + comment_no + ", news_no=" + news_no + ", user_no=" + user_no + ", content="
				+ content + ", regdate=" + regdate + ", delFlag=" + delFlag + "]";
	}
	
	
}
