package com.day03;

public class Exam06 {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		//1~45 ���� �� 6�� �߻�
		//�ߺ���� �ȵ�
		
		//�ζ� ��ȣ 6�� ����ϱ�
		int[] lotto=new int[6];
		int n=0;//�迭�� �� �ζǹ�ȣ ����
		do {
			boolean flag=false;
			int r=(int)(Math.random()*45)+1;//�����߻�
			//�ߺ��̸� �迭�� ����
			for(int i=0;i<n;i++) {
				if(r==lotto[i]) {
					flag=true;
					break;
				}
			}
			if(flag==true)continue;
			lotto[n]=r; ////������ �迭�� ����
			n++; //�迭�� �ζǹ�ȣ ������ 1����
		}while(n<lotto.length);
		//�ζ� ��ȣ 6�� ����ϱ�
		System.out.println();
		System.out.println("=======");
		for(int num:lotto) {
			System.out.println(num+"\t");
		}
		
		
		

	}

}
