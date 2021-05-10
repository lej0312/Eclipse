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
	
	//getter 값을 가져올때 setter 값을 세팅할때
	public String getName() {
		return name;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public static void main(String[] args) {
		Good g1=new Good("0001","레몬","레몬사",1000);
		System.out.println(g1.name+":"+g1.getSellingPrice());//레몬:1000
		Good g2=new Good("0002","사과","사과사",1500);
		System.out.println(g2.name+":"+g2.getSellingPrice());//사과:1500
		g2.updatediscountRate(0.2);//20% 할인
		System.out.println(g2.name+":"+g2.getSellingPrice());//사과:?
		System.out.println(g2.name+"할인율:"+g2.discountRate);
	}

}
