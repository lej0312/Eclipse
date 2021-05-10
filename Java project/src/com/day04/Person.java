package com.day04;

//p175
public class Person {
	private String studentName; //이름
	private int grade; //학년
	private int money; //돈
	//생성자
	public Person(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//지하철타다
	public void takeSubway(Subway subway) {//***Subway부분 무슨값(문자값?)으로 객체가 들어감... 
		subway.take(1500);
		this.money-=1500;
	}
	//버스타다
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	//정보출력
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}
}
