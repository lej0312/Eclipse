package com.day06;

public class IPTV extends ColorTV{
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip=ip;
	}
	@Override
	public void print() {
		System.out.print("나의 TV는" + ip + "주소의");
		super.print();
	}
	

}
