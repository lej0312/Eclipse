package com.day04;

class Triangle{
	int bottom;
	int height;
	
	public Triangle(int bottom,int height) {
		this.bottom=bottom;
		this.height=height;
	}
	public double getArea() {//double ��� int�� ����)
		//System.out.println(bottom*height/2);
		return bottom*height/2;
	}
	public void setBottom(int bottom) {
		this.bottom=bottom;
	}
	public void setHeight(int height) {
		this.height=height;
	}
}
public class TriangleMain {//���༺�� �ִ� Ŭ�������� ���ϸ����� �ؾ���
	
	public static void main(String[] args) {
		Triangle t1=new Triangle(10,20);//(�غ�,����)
		System.out.println("�ﰢ���� ����:"+t1.getArea());
		t1.setBottom(15);
		t1.setHeight(22);
		System.out.println("�ﰢ���� ����:"+t1.getArea());
	}

}
