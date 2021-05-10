package com.day04;

//p178
public class Subway {
	private String lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//Å¸´Ù
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶" + lineNumber);
		System.out.println("½Â°´ ¼ö" + passengerCount);
		System.out.println("¼öÀÔ:" + money);
	}

}