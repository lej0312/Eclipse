package com.day02;

public class Exam06 {

	public static void main(String[] args) {
		//1~10������ Ȧ�� �� ���ϱ�
		//for if�� ���
		int sum=0;
		for(int i=1;i<11;i++) {
			if(i%2==1) {
				sum+=i;
			}//if
		}//for
		System.out.println("Ȧ�� ��:"+sum);
		//1~10������ Ȧ�� �� ���ϱ�
		//for if�� continue ���
		int hap=0;
		for(int i=1;i<11;i++) {
			if(i%2!=1) continue;//¦���� �׳� for �ٽ� ����
				hap+=i;
		}//for
		System.out.println("Ȧ�� �� continue:"+hap);
		
		
		
	}//main
}//class
