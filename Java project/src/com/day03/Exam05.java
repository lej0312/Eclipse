package com.day03;

public class Exam05 {

	public static void main(String[] args) {
		/*
		 * ũ�Ⱑ 10�� �迭�� �����
		 * 0~50 ���� ������ �߻��ؼ� �迭�� �ֱ�
		 * ��, 0�� �ƴ� ���� �ֱ�
		 * �迭�� ���� ��(�ߺ�) ���
		 * 
		 */
		
		int[] arr=new int[10];
		int n=0; //�迭�� ���� ��
		while(n<arr.length) {//1<10
			int r=(int)(Math.random()*50);//14 0
			if(r==0) continue;
			arr[n]=r; //eg)arr[0]=14;
			n++;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"\t");
//		}
		
		//for-each�� (���� ���� ���)
		for(int num:arr) {
			System.out.println(num+"\t");
		}
		
		
		
	}
}
