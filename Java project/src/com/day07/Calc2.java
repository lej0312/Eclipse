package com.day07;

public interface Calc2 {//interface 모든 것이 추상메소드로 이루어진것 추상 abstract 생략
	//인터페이스 변수는 final, (final 생략가능)
	//메소드는 추상으로 만들어짐 (abstract 생략가능)
	//***추상클래스, 인터페이스
	
	int value=5; //=final int value=5;
	public int add(int a,int b);
	public int sub(int a,int b);
	public double average(int[]a);
}
