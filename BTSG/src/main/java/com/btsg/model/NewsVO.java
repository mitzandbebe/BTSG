package com.btsg.model;

import java.sql.Timestamp;

public class NewsVO {
	private int news_no;
	private int artist_no;
	private String news_content;
	private Timestamp regdate;
	private int view;
	public NewsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsVO(int news_no, int artist_no, String news_content, Timestamp regdate, int view) {
		super();
		this.news_no = news_no;
		this.artist_no = artist_no;
		this.news_content = news_content;
		this.regdate = regdate;
		this.view = view;
	}
	public int getNews_no() {
		return news_no;
	}
	public void setNews_no(int news_no) {
		this.news_no = news_no;
	}
	public int getArtist_no() {
		return artist_no;
	}
	public void setArtist_no(int artist_no) {
		this.artist_no = artist_no;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	@Override
	public String toString() {
		return "NewsVO [news_no=" + news_no + ", artist_no=" + artist_no + ", news_content=" + news_content
				+ ", regdate=" + regdate + ", view=" + view + "]";
	}
	
	
	
}
