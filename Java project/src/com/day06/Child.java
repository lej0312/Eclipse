package com.day06;

public class Child extends Father{ //extends Father,Grandfather �Ұ��� => ���߻�� �Ұ���
	public Child() {
		System.out.println ("Child ������");
	}
	public void childMethod() {
		System.out.println("childMethod");
	}
	//�������̵�
	//:��Ӱ��迡 ���� �� �θ��� �޼ҵ带 �ڽ��� ������ �ϴ� ��

	@Override //�ֳ����̼�
	public void method() {
		System.out.println("method ������");
	}

}
