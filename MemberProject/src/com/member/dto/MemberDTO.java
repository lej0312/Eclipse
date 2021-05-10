package com.member.dto;

public class MemberDTO {
	private String name;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int admin;
	
	//getter, setter
	public String getName() {
		return name;
	}
	public String getUserid() {
		return userid;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public int getAdmin() {
		return admin;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	
	
}
