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
		this();//10���� ȣ��
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
		return customerName+" ���� ����� "+customerGrade+" �̸�, ���ʽ� ����Ʈ�� "+bonusPoint+" �Դϴ�.";
	}

	public String getCustomerName() {
		return customerName;
	}

}