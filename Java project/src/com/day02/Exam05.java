package com.day02;

public class Exam05 {

	public static void main(String[] args) {
		// for �̿� 1~5���� ���
		// 1 2 3 4 5
		for(int i=1;i<6;i++) {
			System.out.println(i+"\t");
		}
		System.out.println();
		
		//while-Ƚ���� �� �� ���� �� (cf:forȽ���� �� �� ���� ��)
		int n=1;
		while(n<6) {
			System.out.println(n+"\t");
			n++;
		}
		System.out.println();
		
		//do~while-������ �� ���� ����
		int m=1;
		do {
			System.out.println(m+"\t");
			m++;
		}while(m<6);
		System.out.println();
		System.out.println("=========");
		
		for(int i=1;i<10;i++) {
			if(i==5) break; //if�� �ɸ��� ���� �� �� �϶��� �߰�ȣ{} ���� ����
			System.out.println("i="+i);
		}
		
		System.out.println("=========");
	
		for(int i=1;i<10;i++) {
		if(i==5) continue;
		System.out.println("i="+i);	
		}
		
		
			
	}
		
}


