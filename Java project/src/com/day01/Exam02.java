package com.day01;

public class Exam02 {
	public static void main(String[]args) {
		//a ������ 49�Ҵ�
		int a=49;
		//a�� 50���� Ů�ϱ�? 
		//ũ�� 50���� ũ�� ������ 50���� �۴�
		
		//���ǹ� =>true/false
		if(a>50){
			System.out.print("50���� ũ��"); //true
		}else{ //false
			System.out.print("50���� �۴�");
		}
		//a�� ¦������ Ȧ������ ���
		if(a%2==0){
			System.out.print("¦��");
		}else{
			System.out.print("Ȧ��");
		}
		
		a=51; //50 100 200
		if(a>50){
			System.out.print("50���� ũ��");
		}else if(a>100) {
			System.out.print("100���� ũ��");
		}else if(a>200) {
			System.out.print("2000���� ũ��");
		}else {
			System.out.println("else");
		}
		System.out.println();
		a=202;
		if(a>50){
			System.out.print("50���� ũ��");
		}if(a>100) {
			System.out.print("100���� ũ��");
		}if(a>200) {
			System.out.print("2000���� ũ��");
		}else {
			System.out.println("else");
		}
		System.out.println();
		
	}
}
