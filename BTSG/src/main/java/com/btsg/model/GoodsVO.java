package com.btsg.model;

public class GoodsVO {
	private int goods_no;
	private int artist_no;
	private int category_no;
	private String goods_name;
	private int price;
	private String desciption;
	private String upload_name;
	private long file_size;
	private String original_name;
	
	public GoodsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsVO(int goods_no, int artist_no, int category_no, String goods_name, int price, String desciption,
			String upload_name, long file_size, String original_name) {
		super();
		this.goods_no = goods_no;
		this.artist_no = artist_no;
		this.category_no = category_no;
		this.goods_name = goods_name;
		this.price = price;
		this.desciption = desciption;
		this.upload_name = upload_name;
		this.file_size = file_size;
		this.original_name = original_name;
	}
	public int getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(int goods_no) {
		this.goods_no = goods_no;
	}
	public int getArtist_no() {
		return artist_no;
	}
	public void setArtist_no(int artist_no) {
		this.artist_no = artist_no;
	}
	public int getCategory_no() {
		return category_no;
	}
	public void setCategory_no(int category_no) {
		this.category_no = category_no;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getUpload_name() {
		return upload_name;
	}
	public void setUpload_name(String upload_name) {
		this.upload_name = upload_name;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public String getOriginal_name() {
		return original_name;
	}
	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
	}
	@Override
	public String toString() {
		return "goods [goods_no=" + goods_no + ", artist_no=" + artist_no + ", category_no=" + category_no
				+ ", goods_name=" + goods_name + ", price=" + price + ", desciption=" + desciption + ", upload_name="
				+ upload_name + ", file_size=" + file_size + ", original_name=" + original_name + "]";
	}
	
	
	
}
