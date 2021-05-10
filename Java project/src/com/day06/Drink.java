package com.day06;

public class Drink {
	private String name;
	private int price;

	// »ý¼ºÀÚ
	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
