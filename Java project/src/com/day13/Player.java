package com.day13;

public class Player {
	private int num;
	private String name;
	private  int height;
	private int weight;
	private String kind;	
	
	//»ý¼ºÀÚ
	public Player() {
		
	}
	public Player(String name, int height, int weight, String kind) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.kind = kind;
	}
	//getter, setter
	
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
	public String getKind() {
		return kind;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	
}
