package com.day06;

public class Main {

	public static void main(String[] args) {
		GrandFather gf=new GrandFather();
		gf.grandFatherMethod();
		System.out.println("=============");
		Father f=new Father();
		f.fatherMethod();
		
		f.grandFatherMethod(); //Father�� extends�� ������� ������ ������ ������ extends ������� ����x ��ӹ���?
		System.out.println("============");
		Child c=new Child();
		c.childMethod();
		c.fatherMethod();
		c.grandFatherMethod(); //��� �޾� �ڱ��ڽ� father grandfather ��� ����
		System.out.println(c.value);
		c.method();
		System.out.println("============");
		Father f1;
		Child c1=new Child();
		//father�� ���� �����̶� ������ f1�� Father�������� Child�� �������̵� �� �޼ҵ� ��� ����
		f1=c1; 
	//  f1.childMethod(); �Ұ���
		f1.method(); //����
		
		//f2�� father���̰� �������̵� �� �޼ҵ�� Child�� �� ���
		Father f2=new Child();
		f2.method();
	// 	f2.childMethod(); �����߻�
		f2.fatherMethod();
		
		
	}

}
