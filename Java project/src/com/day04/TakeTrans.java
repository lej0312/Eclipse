package com.day04;

public class TakeTrans {
public static void main(String[]args) {
	Person p1=new Person("ȫ�浿",5000);
	Person p2=new Person("�̼���",10000);
	
	Bus bus100=new Bus(100);
	//ȫ�浿�� ������ Ÿ��
	p1.takeBus(bus100);
	p1.showInfo();
	bus100.showInfo();
	
	Subway subwayGreen=new Subway("2ȣ��");
	//�̼����� ����ö�� Ÿ��
	p2.takeSubway(subwayGreen);
	p2.showInfo();
	subwayGreen.showInfo();
	}
}

