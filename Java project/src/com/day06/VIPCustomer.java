package com.day06;
//p236
public class VIPCustomer 
	extends Customer{

	private int agentID; //전담 상담원
	double saleRate; //할인율
	
//	public VIPCustomer() {
//		customerGrade="VIP";
//		bonusRate=0.05;
//		saleRate=0.1;	
//	}
	public VIPCustomer(int customerID,String customerName,int agentID) {
		super(customerID,customerName);
		this.agentID=agentID;
		super.customerGrade="VIP";
		super.bonusRate=0.05;
		saleRate=0.1;
	}
	
	public int calPrice(int price) {
		bonusPoint += price*bonusRate;
		return price-(int)(price*saleRate);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerGrade+":"+super.showCustomerInfo();
	}
}
