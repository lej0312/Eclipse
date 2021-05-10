package com.day07;

public class AbsShapeMain {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성 못함(new 안됨)
		//AbsShape as=new AbsShape(); 
		
		AbsCircle ac=new AbsCircle();
		ac.move();
		
		AbsShape as=new AbsCircle();
		as.draw();
		AbsShape asq=new AbsSquare();
		asq.draw();
		asq.print();
		asq.move();
	}

}
