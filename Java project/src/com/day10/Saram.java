package com.day10;

public class Saram {
	private String name;
	public Saram(String name) {
		this.name=name;
	}
	public void speak() {
		for(int i=1; i<6; i++) {
			System.out.println(name+":"+i+"번째 말한다.");
		}
	}

	public static void main(String[] args) {
		Saram s1=new Saram("홍길동");
		Saram s2=new Saram("이순신");
		Saram s3=new Saram("강감찬");
		s1.speak();
		s2.speak();
		s3.speak();
		
	}

}
