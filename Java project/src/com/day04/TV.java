package com.day04;

public class TV {
	String maker;
	int year,inch;
	
	public TV(String maker,int year,int inch) {
		this.maker=maker;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		System.out.println(maker+"���� ����"+year+"����"+inch+"��ġ");
	}
	
	public static void main(String[] args) {
		TV tv1=new TV("LG",2020,60);
		tv1.show();
		TV tv2=new TV("�Ｚ",2021,75);
		tv2.show(); //LG���� ���� 2020�� �� 60 ��ġ
		
	}

}
