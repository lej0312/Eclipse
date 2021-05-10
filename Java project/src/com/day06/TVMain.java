package com.day06;

public class TVMain {

	public static void main(String[] args) {
		ColorTV mytv=new ColorTV(32,1024);
		mytv.print(); //32인치 1024컬러
		
		IPTV iptv=new IPTV("192.1.1.2",21,2048);
	//	ColorTV iptv=new IPTV("192.1.1.2",21,2048); //가능
		iptv.print(); //나의 TV는 192.1.1.2주소의 32인치 2048 컬러
		
	}

}
