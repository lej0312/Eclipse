package com.day02;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 1~10������ �� 55
		 * 11~20������ �� 155
		 * 21~30������ ��
		 * ......
		 * 91~100������ �� 955
		 * Exam03�� ���غ���
		 */
		int sum=0;
		for(int i=1;i<101;i++) {
			sum += i;
			if(i%10==0) {//i=10 20 30
				System.out.println((i-9)+"����"+i+"������ ��"+sum);
				sum=0; //�� �κ��� ���� ������ Ʋ�� �հ谡 ����
			}
		}
		/*
		 * �л����� ���ٿ� ���� �л� ���� �Է¹޾� ����Ͻÿ�.
		 * eg)10(�л���) 3(����)
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 10	�� ���·�
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("�л� ��>>");
		int stuCnt=sc.nextInt();
		System.out.println("�� �� �ο� ��>>");
		int lineCnt=sc.nextInt();
		for(int i=1;i<=stuCnt;i++) {
			System.out.println(i+"\t");
			if(i%lineCnt==0) {
				System.out.println();
			}
		}
		//�� �������� ���
		int row=0;
		if(stuCnt%lineCnt==0) {
			row = stuCnt/lineCnt;
		}else {
			row = (stuCnt/lineCnt)+1;
		}
		System.out.println("�� ���� ��:"+row);
		//���׿�����
		int r=(stuCnt%lineCnt==0) ? stuCnt/lineCnt : (stuCnt/lineCnt)+1; //?���� ����: ����
		System.out.println("�� ���� ��:"+r);
		

		
	}

}
