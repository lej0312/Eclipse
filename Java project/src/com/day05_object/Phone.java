package com.day05_object;

public class Phone {
	private String name;
	private String tel;
	public Phone() {
		
	}
	//»ý¼ºÀÚ
	public Phone(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
}
