package com.day08;

import java.util.ArrayList;
import java.util.Scanner;
//ArrayList 이용
//원=>Circle
//사각형=>Square
//부모-->Shape
class Shape{
	private int x,y;
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.println("좌표(x,y)="+x+","+y);
	}
}
class Circle extends Shape{
	private int r;
	public Circle(int x,int y,int r) {
		super(x,y);
		this.r=r;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("반 지름:"+r);
		System.out.println();
	}
}
class Square extends Shape{
	private int w,h;
	public Square(int x,int y,int w,int h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("가로 폭:"+w);
		System.out.println("세로 높이:"+h);
		System.out.println();
	}
}
class ShapeManager{
	//도형입력(원,사각형):원 x,y /사각형 x,y,w,h
	ArrayList<Shape>alist=new ArrayList<>();
	public void inputData(int choice) {
		System.out.println("도형입력...");
		System.out.println("x좌표>>");
		int x=ShapeMain.sc.nextInt();
		System.out.println("y좌표>>");
		int y=ShapeMain.sc.nextInt();
		if(choice==1) {//원
			System.out.println("반지름>>");
			int r=ShapeMain.sc.nextInt();
			alist.add(new Circle(x,y,r));
		}else if(choice==2) {//사각형
			System.out.println("가로 폭>>");
			int w=ShapeMain.sc.nextInt();
			System.out.println("세로 높이>>");
			int h=ShapeMain.sc.nextInt();
			alist.add(new Square(x,y,w,h));
		}
		
	}
	public void viewData() {
		for(Shape s:alist) {
			s.print();
		}
	}
}

public class ShapeMain {
	static Scanner sc=new Scanner(System.in);
	static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1.원 2.사각형 3.보기 4.종료");
	}

	public static void main(String[] args) {
		ShapeManager sm=new ShapeManager();
		
		while (true){
			ShapeMain.showMenu();
			int choice=ShapeMain.sc.nextInt();
			switch(choice) { 
			case 1:							//원
			case 2:sm.inputData(choice);break;//사각형
			case 3:sm.viewData();break;
			case 4:System.out.println("종료");
				System.exit(0);
				
			}
		}
		

	}

}
