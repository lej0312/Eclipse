package com.day04;

public class Car {
	String name;
	String carColor;
	int speed;
	public Car() {//생성자 클래스 이름,void 쓰면 안됨
		
	}
	public Car(String name,String color) {
		this.name="name";
		this.carColor="color";
	}
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void getSpeed() {
		System.out.println("속도:"+speed);
	}
	
	public static void main(String[]args) {
		Car c1=new Car();//디폴트 생성자
		c1.name="소나타";
		c1.carColor="흰색";
		c1.speedUp(30);//속도를 올린다
		c1.speedDown(10);//속도를 내린다
		c1.getSpeed();//속도를 알려준다==>속도:20
		Car c2=new Car("내 차","black");
		c2.speedUp(50);
		c2.getSpeed();
		
	}
}
