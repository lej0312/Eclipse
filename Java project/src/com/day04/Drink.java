package com.day04;

public class Drink {
	String name;
	int price,count;
	
	public Drink(String name,int price,int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	public int getTotal() {
		return price*count;
	}
	public void getData() {
		System.out.print(name+"\t");
		System.out.print(price+"\t");
		System.out.print(count+"\t");
//		System.out.print(price*count+"\t");
		System.out.println(getTotal()+"\n");
	}
	public static void main(String[] args) {
		Drink d1 = new Drink("Ä¿ÇÇ",500,3);
		d1.getData(); //Ä¿ÇÇ 500 3 1500
		Drink d2 = new Drink("³ìÂ÷",3000,5);
		d2.getData(); //³ìÂ÷ 3000 5 15000
		System.out.println("ÃÑÆÇ¸Å¾×:"+(d1.getTotal()+d2.getTotal()));
	}

}
