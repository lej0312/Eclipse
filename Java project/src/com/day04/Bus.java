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
		System.out.println("����"+busNumber);
		System.out.println("�°� ��"+passengerCount);
		System.out.println("����:"+money);
	}
	
}
