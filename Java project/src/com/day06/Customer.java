package com.day06;

public class Customer {
	private int customerID;
	private String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRate;
	
	public Customer() {
		customerGrade="SILVER";
		bonusRate=0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this();//10번줄 호출
		this.customerID = customerID;
		this.customerName = customerName;
//		customerGrade = "SILVER";
//		bonusRate = 0.01;
	}
	public int calPrice(int price) {
		bonusPoint += price*bonusRate;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+" 입니다.";
	}

	public String getCustomerName() {
		return customerName;
	}

}