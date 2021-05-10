package com.day05_object;

public class Circle {
		private String name;
		private int r;
		final double PI=3.14;
		
		public Circle() {
			
		}
		
		public Circle(String name,int r) {
			this.name=name;
			this.r=r;
		}
		public void getArea() {
			System.out.println(name+":"+r*r*PI);
		}
		public double getA() {
			return r*r*PI;
		}
		//setter
		public void setName(String name) {
			this.name = name;
		}

		public void setR(int r) {
			this.r = r;
		}

}
