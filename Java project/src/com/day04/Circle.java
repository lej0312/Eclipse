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
		System.out.println(name+"����:"+r*r*PI);
	}
	
	public static void main(String[] args) {
		Circle c1=new Circle("����",10);
		c1.getArea();//���� ����
		
		Circle c2=new Circle();
		c2.name="����";
		c2.r=2;
		c2.getArea();//���� ����

	}

}
