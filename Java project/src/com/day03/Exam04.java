package com.day03;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
	int[] data= {10,5,100,200,30,77};
	int sum=0;
	int max=data[0];//�ִ밪
	int maxPos=0;//�ִ밪��ġ
	for(int i=0;i<data.length;i++) {
		sum += data[i];
		if(max<data[i]) {
			max=data[i];
			maxPos=i+1;
		}
	}
	System.out.println("�ִ밪:"+max);
	System.out.println("�ִ밪��ġ:"+maxPos);
	System.out.println("�迭�հ�:"+sum);
	System.out.println("���:"+(float)sum/data.length);
	
	//���ڸ� �Է¹޾� �� ���� �迭�� ������ �ֽ��ϴ�.
	//������ �����ϴ� ���
	System.out.println("ã�� �� �Է�>>"); //55
	Scanner sc=new Scanner(System.in);
	int search=sc.nextInt();//55
	boolean flag=false; //�Ϲ������� boolean �ʱⰪ false
	for(int i=0;i<data.length;i++) {
		if(search==data[i]) {
			System.out.println("�ֽ��ϴ�.");
			flag=true;
			break;//��������
		}
	}
	if(flag==false) {
		System.out.println("�����ϴ�.");
	}
	//Math.random()�����߻�
	//0���� 1������ double�� �����߻�
	System.out.println(Math.random());
	//0���� 10������ �����߻�
	int r=(int)(Math.random()*10);
	System.out.println(r);

	
	
	
	

	}
}
