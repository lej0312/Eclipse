package com.day08;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}	
	@Override
	public boolean equals(Object obj) {
		//두 좌표가 같다면 같은걸로
		Point p=(Point) obj;
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());//p363
		System.out.println(obj); //obj.getClass().getName()+@+hashcode
		System.out.println(obj.toString());
	}

	public static void main(String[] args) {
		Point p=new Point(2,3);
		ObjectPropertyEx.print(p);
		Point p1=new Point(2,3);
		Point p2=new Point(3,4);
		if(p==p1) {
			System.out.println("p==p1");
		}
		if(p.equals(p1)) {
			System.out.println("p equals p1");
		}
		if(p.equals(p2)) {
			System.out.println("p equals p2");
		}
		
		
		
	}

}
