package com.day06;

public class Father extends GrandFather { //***extends �θ��� ~�� ���� ����
	public Father() {
		//super(); ***super-�����ڸ� �θ�? default�̱⶧���� ��������
		System.out.println("Father ������");
	}

	public void fatherMethod() {
		System.out.println("fatherMethod");
	}

	
	@Override
	public void method() {
		System.out.println("�ƹ����� �Ҿƹ��� method ������");
	}

}
