package com.day06;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size,int color) {
		super(size); //부모의것 부르기 위해...?
		this.color=color;
	}
	public void print() {
		//32인치 1024컬러
		System.out.println(getSize()+"인치"+color+"컬러");
	}
	
}
