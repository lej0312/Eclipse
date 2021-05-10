package com.day06;

public class Father extends GrandFather { //***extends 부모의 ~를 먼저 실행
	public Father() {
		//super(); ***super-생성자를 부름? default이기때문에 생략가능
		System.out.println("Father 생성자");
	}

	public void fatherMethod() {
		System.out.println("fatherMethod");
	}

	
	@Override
	public void method() {
		System.out.println("아버지가 할아버지 method 재정의");
	}

}
