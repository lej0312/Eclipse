package com.day07;

public abstract class AbsShape { //abstract 추상클래스-부모가 하지 못하는 것을 자식이 구현하게 만드는 것?
	//도형 그리기
	public abstract void draw(); //추상메소드 abstract
		

	
	//도형 출력하기
	public void print() {
		System.out.println("도형 출력하기");	
	}
	
	//도형 이동하기
	public abstract void move(); //추상메소드
		
	
}
