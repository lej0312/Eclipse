package com.day04;

public class BBSMain {
	public static void main(String[] args) {
		BBS b1=new BBS("ȫ�浿","2021","����1","����1");
		b1.print(); //�۾���,��¥,����,����
		BBS b2=new BBS("�̼���","2020","����2","����2");
		b2.print(); //�۾���,��¥,����,����
		BBS b3=new BBS("������","2021","����3","����3");
		b3.print(); //�۾���,��¥,����,����
		System.out.println(b1.getName());
		System.out.println(b1.getDate());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());
		//b1.date="2019";
		b1.setDate("2019");
		b1.print();
	}
}
