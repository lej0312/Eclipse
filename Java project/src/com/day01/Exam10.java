package com.day01;

public class Exam10 {
	public static void main(String[] args) {
		//�ڹ� �⺻������ �� 8����
		int a; //4����Ʈ
		long c=1000000000000000000L;//8����Ʈ
		//�Ǽ�
		float f; //4����Ʈ
		double b; //8����Ʈ
		
		//boolean b =true; //true,false (�����ʷϻ��ƴ� �������� �ּ�ó��)
		char ch='a'; //���� �ϳ� (2����Ʈ�� Ȭ����ǥ)
		// char ch1="A";
		
		byte bb; //1byte
		short sh; //2byte
//----------------------------
		
		String str="";
		int aa=10;
		/*if(a==10) {
			str="10�̴�";
		}else {
			str="10�ƴ�";
		}*/
		//���׿�����(���ǿ�����)ǥ��
		str=(aa==10)?"10�̴�":"10�ƴ�";
		System.out.println(str);
	}

}
