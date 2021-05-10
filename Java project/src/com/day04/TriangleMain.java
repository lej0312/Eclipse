package com.day04;

class Triangle{
	int bottom;
	int height;
	
	public Triangle(int bottom,int height) {
		this.bottom=bottom;
		this.height=height;
	}
	public double getArea() {//double 대신 int도 가능)
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
public class TriangleMain {//실행성이 있는 클래스명을 파일명으로 해야함
	
	public static void main(String[] args) {
		Triangle t1=new Triangle(10,20);//(밑변,높이)
		System.out.println("삼각형의 넓이:"+t1.getArea());
		t1.setBottom(15);
		t1.setHeight(22);
		System.out.println("삼각형의 넓이:"+t1.getArea());
	}

}
