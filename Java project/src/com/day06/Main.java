package com.day06;

public class Main {

	public static void main(String[] args) {
		GrandFather gf=new GrandFather();
		gf.grandFatherMethod();
		System.out.println("=============");
		Father f=new Father();
		f.fatherMethod();
		
		f.grandFatherMethod(); //Father에 extends를 사용하지 않으면 오류가 나지만 extends 사용으로 오류x 상속받음?
		System.out.println("============");
		Child c=new Child();
		c.childMethod();
		c.fatherMethod();
		c.grandFatherMethod(); //상속 받아 자기자신 father grandfather 모두 가능
		System.out.println(c.value);
		c.method();
		System.out.println("============");
		Father f1;
		Child c1=new Child();
		//father이 상위 개념이라서 가능함 f1은 Father형이지만 Child의 오버라이딩 된 메소드 사용 가능
		f1=c1; 
	//  f1.childMethod(); 불가능
		f1.method(); //가능
		
		//f2는 father형이고 오버라이딩 된 메소드는 Child의 것 사용
		Father f2=new Child();
		f2.method();
	// 	f2.childMethod(); 오류발생
		f2.fatherMethod();
		
		
	}

}
