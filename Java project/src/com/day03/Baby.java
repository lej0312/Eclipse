package com.day03;

public class Baby {
	//속성+행위

	String name;//이름
	int age;//나이
	
	//웃는다
	public void smile() {
		System.out.println("웃는다");
	}
	
	//운다
	public void cry() {
		System.out.println("운다");
	}
	//
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
	
	public static void main(String[]args) {
		Baby b1=new Baby();//객체생성
		b1.cry();
		b1.smile();
		b1.name="홍길동";
		System.out.println(b1.name);
		b1.age=10;
		b1.info();
		
		Baby b2=new Baby();
		b2.name="이순신";
		b2.age=5;
		b2.info();
		b2.age=55;
		b2.info();
	}
	
	
}
