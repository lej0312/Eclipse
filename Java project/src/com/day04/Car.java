package com.day04;

public class Car {
	String name;
	String carColor;
	int speed;
	public Car() {//������ Ŭ���� �̸�,void ���� �ȵ�
		
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
		System.out.println("�ӵ�:"+speed);
	}
	
	public static void main(String[]args) {
		Car c1=new Car();//����Ʈ ������
		c1.name="�ҳ�Ÿ";
		c1.carColor="���";
		c1.speedUp(30);//�ӵ��� �ø���
		c1.speedDown(10);//�ӵ��� ������
		c1.getSpeed();//�ӵ��� �˷��ش�==>�ӵ�:20
		Car c2=new Car("�� ��","black");
		c2.speedUp(50);
		c2.getSpeed();
		
	}
}
