package com.day06;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size,int color) {
		super(size); //�θ��ǰ� �θ��� ����...?
		this.color=color;
	}
	public void print() {
		//32��ġ 1024�÷�
		System.out.println(getSize()+"��ġ"+color+"�÷�");
	}
	
}
