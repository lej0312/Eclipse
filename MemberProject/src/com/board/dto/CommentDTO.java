package com.board.dto;

public class CommentDTO {
	private int cnum;
	private String msg;
	private int bnum;
	private String userid;
	private String regdate;
	
	//getter, setter
	public int getCnum() {
		return cnum;
	}
	public String getMsg() {
		return msg;
	}
	public int getBnum() {
		return bnum;
	}
	public String getUserid() {
		return userid;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	

}
