package com.day12;

public class Player {
	private int num;
	private String name;
	private int height;
	private int weight;
	private String kind;

	// getter , setter
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
}