package com.day10;

public class Saram {
	private String name;
	public Saram(String name) {
		this.name=name;
	}
	public void speak() {
		for(int i=1; i<6; i++) {
			System.out.println(name+":"+i+"��° ���Ѵ�.");
		}
	}

	public static void main(String[] args) {
		Saram s1=new Saram("ȫ�浿");
		Saram s2=new Saram("�̼���");
		Saram s3=new Saram("������");
		s1.speak();
		s2.speak();
		s3.speak();
		
	}

}
