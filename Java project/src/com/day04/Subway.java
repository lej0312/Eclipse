package com.day04;

//p178
public class Subway {
	private String lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//Ÿ��
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println("����ö" + lineNumber);
		System.out.println("�°� ��" + passengerCount);
		System.out.println("����:" + money);
	}

}