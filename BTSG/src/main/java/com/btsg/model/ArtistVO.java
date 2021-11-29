package com.btsg.model;

public class ArtistVO {
	private int artist_no;
	private String artist_name;
	public ArtistVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistVO(int artist_no, String artist_name) {
		super();
		this.artist_no = artist_no;
		this.artist_name = artist_name;
	}
	public int getArtist_no() {
		return artist_no;
	}
	public void setArtist_no(int artist_no) {
		this.artist_no = artist_no;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	@Override
	public String toString() {
		return "Artist [artist_no=" + artist_no + ", artist_name=" + artist_name + "]";
	}
	
	
}
//testtest
