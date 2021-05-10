package com.day06;

public class GoldCustomer extends Customer {
	
	double saleRate;//«“¿Œ¿≤
	
	public GoldCustomer(int customerID,String customerName) {
		super(customerID,customerName);
		super.customerGrade="GOLD";
		super.bonusRate=0.02;
		this.saleRate=0.1;
	}
	public int calPrice(int price) {
		bonusPoint += price*bonusRate;
		return price-(int)(price*saleRate);
	}
	
	public String showCustomerInfo() {
		return customerGrade+":"+super.showCustomerInfo();
	}
	
	

}
