package com.day07;

interface ShapeArea {
	double area(); // 면적 구하기

	double circum(); // 둘레 구하기
}

class Rectangle implements ShapeArea {
	private int x,y;

	// 생성자
	public Rectangle(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public double area() {
		return x*y;
	}

	@Override
	public double circum() {
		return (x+y)*2;
	}
}

class SCircle implements ShapeArea {
	private int r;
	
	public SCircle(int r) {
		this.r=r;
	}

	@Override
	public double area() {
		return r*r*Math.PI;
	}

	@Override
	public double circum() {
		return 2*r*Math.PI; //static은 클래스 이름으로 접근
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		ShapeArea rec = new Rectangle(5,7);
		ShapeArea circle = new SCircle(5);
		System.out.println("원 넓이:" + circle.area());
		System.out.println("원 둘레:" + circle.circum());
		System.out.println("사각형 넓이:" + rec.area());
		System.out.println("사각형 넓이:" + rec.circum());

	}

}
