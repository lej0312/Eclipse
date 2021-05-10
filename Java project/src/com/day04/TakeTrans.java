package com.day04;

public class TakeTrans {
public static void main(String[]args) {
	Person p1=new Person("홍길동",5000);
	Person p2=new Person("이순신",10000);
	
	Bus bus100=new Bus(100);
	//홍길동이 버스를 타다
	p1.takeBus(bus100);
	p1.showInfo();
	bus100.showInfo();
	
	Subway subwayGreen=new Subway("2호선");
	//이순신이 지하철을 타다
	p2.takeSubway(subwayGreen);
	p2.showInfo();
	subwayGreen.showInfo();
	}
}

