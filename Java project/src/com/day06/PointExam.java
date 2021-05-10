package com.day06;

class Point{
	protected int x, y;
//	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x +","+y+")");
	}
}
class ColorPoint extends Point{

	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	//¿À¹ö¶óÀÌµù
	public void showPoint() {
		super.showPoint();
		System.out.println(color);
	}
	@Override
	public String toString() {
	//  yellow »ö±òÀÇ (7,9)
		return color +" »ö±òÀÇ ("+ x +","+y+")";
	}
	
}

public class PointExam {

	public static void main(String[] args) {
		Point p = new Point(3,4);
		p.showPoint(); // (3,4)
		ColorPoint  cp = new ColorPoint(2,5,"red");
		cp.showPoint(); //(2,5) red
		
		Point p1 = new ColorPoint(7,9,"yellow");
		p1.showPoint();
		System.out.println(p1);  //  yellow »ö±òÀÇ (7,9)

	}

}
