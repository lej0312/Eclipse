package com.day05_object;

public class Dog {
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String showDogInfo() {
		return name + "," + type;
	}

}
