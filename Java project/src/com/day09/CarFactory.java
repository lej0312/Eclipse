package com.day09;

import java.util.HashMap;

public class CarFactory {

	HashMap<String, Car> carMap = new HashMap<>();
	private static CarFactory intstance = new CarFactory();

	public static CarFactory getInstance() {
		
		//if(instance==null)
		//instance=new CarFactory();
		return intstance;
	}

	public Car createCar(String name) {
		if (carMap.containsKey(name)) {// ∏ ø° ¿÷¿Ω
			return carMap.get(name);
		}
		Car car = new Car();// ∏ ø° æ¯¿Ω
		carMap.put(name, car);
		return car;
	}
}
