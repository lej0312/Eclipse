package com.day06;

public class TVMain {

	public static void main(String[] args) {
		ColorTV mytv=new ColorTV(32,1024);
		mytv.print(); //32��ġ 1024�÷�
		
		IPTV iptv=new IPTV("192.1.1.2",21,2048);
	//	ColorTV iptv=new IPTV("192.1.1.2",21,2048); //����
		iptv.print(); //���� TV�� 192.1.1.2�ּ��� 32��ġ 2048 �÷�
		
	}

}
