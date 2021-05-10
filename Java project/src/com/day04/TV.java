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
		System.out.println(maker+"에서 만든"+year+"년형"+inch+"인치");
	}
	
	public static void main(String[] args) {
		TV tv1=new TV("LG",2020,60);
		tv1.show();
		TV tv2=new TV("삼성",2021,75);
		tv2.show(); //LG에서 만든 2020년 형 60 인치
		
	}

}
