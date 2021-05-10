package com.day04;

public class Circle {
	String name;
	int r;
	final double PI=3.14;
	public Circle() {
		
	}
	public Circle(String name,int r) {
		this.name=name;
		this.r=r;
	}
	public void getArea() {
		System.out.println(name+"면적:"+r*r*PI);
	}
	
	public static void main(String[] args) {
		Circle c1=new Circle("피자",10);
		c1.getArea();//피자 면적
		
		Circle c2=new Circle();
		c2.name="도넛";
		c2.r=2;
		c2.getArea();//도넛 면적

	}

}
