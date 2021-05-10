package com.day04;
//p177
public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	public void take(int money) {
		this.money+=money;
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println("¹ö½º"+busNumber);
		System.out.println("½Â°´ ¼ö"+passengerCount);
		System.out.println("¼öÀÔ:"+money);
	}
	
}
