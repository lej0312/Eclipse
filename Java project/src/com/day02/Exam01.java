package com.day02;

public class Exam01 {
	public static void main(String[] args) {
		//�ݺ���
		//1~5 0~4 10~6 1 3 5 7 9
		for(int i=1;i<6;i++) {//i=1 2 3 4 5 6
			System.out.println(i+":�ȳ��ϼ���");
		}
		//������ 2�� ���
		//2*1=2
		//2*2=4
		
		//2*9=18
		for(int i=1;i<10;i++) {
			System.out.println("2*"+i+"="+2*i);
		}
		//1���� 10���� ¦���� ��� 2 4 6 8 10
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				System.out.println(i+"\t");
			}
		}
		System.out.println();
		System.out.println("=========");
		for(int i=2;i<11;i+=2) {//i=2 4 6 8 10
			System.out.println(i+"\t");
		}
				
		
	}

}
