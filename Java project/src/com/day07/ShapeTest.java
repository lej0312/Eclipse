package com.day07;

import java.util.ArrayList;

class Shape2 {
	public void draw() {
		System.out.println("Shape2");
	}
}

class Circle2 extends Shape2 {
	public void draw() {
		System.out.println("Circle2");
	}
}

class Triangle2 extends Shape2 {
	public void draw() {
		System.out.println("Triangle2");

	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape2>list=new ArrayList<>(); //
		list.add(new Circle2());
		list.add(new Triangle2());
		list.add(new Shape2());

		for (Shape2 s : list) {
			s.draw(); //
		}
		/*
		 * Circle2 
		 * Triangle2 
		 * Shape2
		 */


	}

}
