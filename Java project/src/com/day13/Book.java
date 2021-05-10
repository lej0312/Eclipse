package com.day13;

public class Book {
	private int num;
	private String title;
	private String writer;
	private String indate;
	private String outdate;
	private int price;
	private String gubun;
		
	//»ý¼ºÀÚ
	public Book() {	
		
	}
	public Book(String title, String writer, String indate, String outdate, int price,String gubun) {
		this.title = title;
		this.writer = writer;
		this.indate = indate;
		this.outdate = outdate;
		this.price = price;
		this.gubun = gubun;
	}
	
  // getter, setter
	public int getNum() {
		return num;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getIndate() {
		return indate;
	}
	public String getOutdate() {
		return outdate;
	}
	public int getPrice() {
		return price;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	
	

}
