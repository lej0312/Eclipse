package com.day07;

interface ShapeArea {
	double area(); // ���� ���ϱ�

	double circum(); // �ѷ� ���ϱ�
}

class Rectangle implements ShapeArea {
	private int x,y;

	// ������
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
		return 2*r*Math.PI; //static�� Ŭ���� �̸����� ����
	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		ShapeArea rec = new Rectangle(5,7);
		ShapeArea circle = new SCircle(5);
		System.out.println("�� ����:" + circle.area());
		System.out.println("�� �ѷ�:" + circle.circum());
		System.out.println("�簢�� ����:" + rec.area());
		System.out.println("�簢�� ����:" + rec.circum());

	}

}
