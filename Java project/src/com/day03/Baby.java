package com.day03;

public class Baby {
	//�Ӽ�+����

	String name;//�̸�
	int age;//����
	
	//���´�
	public void smile() {
		System.out.println("���´�");
	}
	
	//���
	public void cry() {
		System.out.println("���");
	}
	//
	public void info() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
	
	public static void main(String[]args) {
		Baby b1=new Baby();//��ü����
		b1.cry();
		b1.smile();
		b1.name="ȫ�浿";
		System.out.println(b1.name);
		b1.age=10;
		b1.info();
		
		Baby b2=new Baby();
		b2.name="�̼���";
		b2.age=5;
		b2.info();
		b2.age=55;
		b2.info();
	}
	
	
}
