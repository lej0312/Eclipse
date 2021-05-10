package com.day06;

public class IPTV extends ColorTV{
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip=ip;
	}
	@Override
	public void print() {
		System.out.print("���� TV��" + ip + "�ּ���");
		super.print();
	}
	

}
