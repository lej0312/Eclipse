package org.addr.model;

public class Address {
	private int num;
	private String name;
	private String addr;
	private String zipcode;
	private String tel;
	
	//getter, setter

	public int getNum() {
		return num;
	}
	public String getAddr() {
		return addr;
	}
	public String getZipcode() {
		return zipcode;
	}
	public String getTel() {
		return tel;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
