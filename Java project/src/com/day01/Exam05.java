package com.day01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[]args) {
		/* �̸�, ����, ����, ���� ������ �Է¹޾�
		�л��� ������ ����� ����ϱ�*/
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("�̸� �Է�>>");
	String name=sc.next();
	System.out.println("�����Է�(����, ����, ����)>>");
	int kor=sc.nextInt();
	int eng=sc.nextInt();
	int math=sc.nextInt();
	int tot=kor+eng+math;
	float avg=tot/3;
	System.out.println("����:"+tot);
	System.out.println("���:"+tot/3);
	System.out.println("���:"+avg);
	
	
	/*
	 * ��� 90�� �̻��̸� A����
	 * ��� 80�� �̻��̸� B����
	 * ��� 70�� �̻��̸� C����
	 * ������ F����
	 */
	// �̸�:����
	String grade="";
	/*if (avg>=90) {
		grade="A����";
	}else if(avg>=80) {
		grade="B����";	
	}else if(avg>=70) {
		grade="C����";	
	}else {
		grade="F����";
	}*/
	
	// switch
	switch((int)avg/10){
	case 10:
	case 9:grade="A"; break;
	case 8:grade="B"; break;
	case 7:grade="C"; break;
	default:grade="F"; 
	}
	
	System.out.println(name+":"+grade);
	}
}

