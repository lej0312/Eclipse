package com.day06;

//p252,253
public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim=new VIPCustomer(10020,"������",12345);
		customerKim.bonusPoint = 10000;
		
		int price=10000;
		System.out.println(customerLee.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+customerLee.calPrice(price)+"�� �Դϴ�.");
		System.out.println(customerKim.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+customerKim.calPrice(price)+"�� �Դϴ�.");

		Customer vc=new VIPCustomer(10030,"������",2000);
		vc.bonusPoint=1000;
		System.out.println(vc.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+vc.calPrice(price)+"�� �Դϴ�.");
	
		Customer gc=new GoldCustomer(10050,"������");
		gc.bonusPoint=2000;
		
		System.out.println(gc.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+vc.calPrice(price)+"�� �Դϴ�.");
		
	}
}
