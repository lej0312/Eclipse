package com.day05_object;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1=new Circle("����",10);
		c1.getArea(); //���� ���̴� 314
		
		Circle c2=new Circle();
		c2.setName("����");
		c2.setR(5);
		c2.getArea();
		
		Circle c3=new Circle("����",15);
		Circle c4=new Circle("����",20);
		Circle c5=new Circle("����",25);
		//�ѳ���
		System.out.println(c1.getA()+c2.getA()+c3.getA()+c4.getA()+c5.getA());
		//int�� ũ�� 5�� �迭
		//int[] arr=new int[5];
		//������ ũ�� 5�� �迭
		//String[] str=new String[5];
		//Circle�� ũ�� 5�� �迭
		Circle[]cirArr=new Circle[5];
		cirArr[0]=c1;
		cirArr[1]=c2;
		cirArr[2]=c3;
		cirArr[3]=c4;
		cirArr[4]=c5;
		double sum=0;
		for(int i=0;i<cirArr.length;i++) {
			sum += cirArr[i].getA();
		}
		System.out.println("��:"+sum);
	}

}
