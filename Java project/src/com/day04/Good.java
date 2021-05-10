package com.day04;

public class Good {
	private String name, code, maker;
	private double discountRate;
	private int price;
	
	public Good(String code,String name,String maker,int price) {
		this.code=code;
		this.name=name;
		this.maker=maker;
		this.price=price;
	}
	public int getSellingPrice(){
		return price-(int)(price*discountRate);
	}
	
	public void updatediscountRate(double rate) {
		discountRate=rate;
	}
	
	//getter ���� �����ö� setter ���� �����Ҷ�
	public String getName() {
		return name;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public static void main(String[] args) {
		Good g1=new Good("0001","����","�����",1000);
		System.out.println(g1.name+":"+g1.getSellingPrice());//����:1000
		Good g2=new Good("0002","���","�����",1500);
		System.out.println(g2.name+":"+g2.getSellingPrice());//���:1500
		g2.updatediscountRate(0.2);//20% ����
		System.out.println(g2.name+":"+g2.getSellingPrice());//���:?
		System.out.println(g2.name+"������:"+g2.discountRate);
	}

}
