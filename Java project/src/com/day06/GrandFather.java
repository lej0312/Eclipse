package com.day06;

public class GrandFather {
	protected String value = "재산있음"; //protected 상속 관계라면 어디에 있든 상속 할 수 있다...?

	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}

	public void grandFatherMethod() {
		System.out.println("grandFatherMethod");
	}
	public void method() {
		System.out.println("method");
	}
}
