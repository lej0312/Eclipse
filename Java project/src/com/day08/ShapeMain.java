package com.day08;

import java.util.ArrayList;
import java.util.Scanner;
//ArrayList �̿�
//��=>Circle
//�簢��=>Square
//�θ�-->Shape
class Shape{
	private int x,y;
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.println("��ǥ(x,y)="+x+","+y);
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
		System.out.println("�� ����:"+r);
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
		System.out.println("���� ��:"+w);
		System.out.println("���� ����:"+h);
		System.out.println();
	}
}
class ShapeManager{
	//�����Է�(��,�簢��):�� x,y /�簢�� x,y,w,h
	ArrayList<Shape>alist=new ArrayList<>();
	public void inputData(int choice) {
		System.out.println("�����Է�...");
		System.out.println("x��ǥ>>");
		int x=ShapeMain.sc.nextInt();
		System.out.println("y��ǥ>>");
		int y=ShapeMain.sc.nextInt();
		if(choice==1) {//��
			System.out.println("������>>");
			int r=ShapeMain.sc.nextInt();
			alist.add(new Circle(x,y,r));
		}else if(choice==2) {//�簢��
			System.out.println("���� ��>>");
			int w=ShapeMain.sc.nextInt();
			System.out.println("���� ����>>");
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
		System.out.println("�����ϼ���...");
		System.out.println("1.�� 2.�簢�� 3.���� 4.����");
	}

	public static void main(String[] args) {
		ShapeManager sm=new ShapeManager();
		
		while (true){
			ShapeMain.showMenu();
			int choice=ShapeMain.sc.nextInt();
			switch(choice) { 
			case 1:							//��
			case 2:sm.inputData(choice);break;//�簢��
			case 3:sm.viewData();break;
			case 4:System.out.println("����");
				System.exit(0);
				
			}
		}
		

	}

}
