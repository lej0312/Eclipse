package com.day03;

public class Exam07 {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		//1~45 ���� �� 6�� �߻�
		//�ߺ���� �ȵ�
		
		//�ζ� ��ȣ 6�� ����ϱ�
		int[] lotto=new int[6];
		int n=0;//�迭�� �� �ζǹ�ȣ ����
		while(n<lotto.length){
			int r=(int)(Math.random()*45)+1;//�����߻�
			lotto[n]=r; ////������ �迭�� ����
			for(int i=0;i<n;i++) {//�ߺ�Ȯ��
				if(r==lotto[i]) {
					n--;
					break;
				}
			}
			n++; //�迭�� �ζǹ�ȣ ������ 1����
		}
		//�ζ� ��ȣ 6�� ����ϱ�
		System.out.println();
		System.out.println("=======");
		for(int num:lotto) {
			System.out.println(num+"\t");
		}
		
		
		

	}

}
