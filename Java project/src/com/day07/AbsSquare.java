package com.day07;

public class AbsSquare extends AbsShape {

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
		
	}

	@Override
	public void move() {
		System.out.println("사각형 이동하기");
		
	}
	@Override
	public void print() {
		System.out.println("사각형 출력하기");
	}
}
