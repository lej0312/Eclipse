package com.address;

public class ZipCodeBean {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;
	private int seq;
	
	public String getZipcode() {
		return zipcode;
	}
	public String getSido() {
		return sido;
	}
	public String getGugun() {
		return gugun==null? "" : gugun; //null나오는것 처리위해 삼항연산자 사용
	}
	public String getDong() {
		return dong;
	}
	public String getBunji() {
		return bunji==null? "" : bunji;
	}
	public int getSeq() {
		return seq;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	
	
	
}
