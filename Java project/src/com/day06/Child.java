package com.day06;

public class Child extends Father{ //extends Father,Grandfather 불가능 => 다중상속 불가능
	public Child() {
		System.out.println ("Child 생성자");
	}
	public void childMethod() {
		System.out.println("childMethod");
	}
	//오버라이딩
	//:상속관계에 있을 때 부모의 메소드를 자식이 재정의 하는 것

	@Override //애노테이션
	public void method() {
		System.out.println("method 재정의");
	}

}
