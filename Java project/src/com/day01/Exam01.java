package com.day01;

public class Exam01 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		//�ڹ� �� �� �ּ�
		/*
		 	�ڹ� ���� �� �ּ�
		 */
		int age=20; //age��� ������ 20�� ����
		System.out.println(age);
		System.out.println("age");
		String addr="�λ�";
		System.out.println(addr);
		//����:20
		System.out.println("���� :"+age);
		//�ּ�:�λ�
		System.out.println("�ּ� :"+addr);
		//�̸� ���� name�� �����ϰ� ȫ�浿�� �Ҵ�
		//�̸�:ȫ�浿
		String name="ȫ�浿";
		System.out.println("�̸� :"+name);
		//���� a�� 15�� �Ҵ�
		int a=15;
		//���� b�� 8�� �Ҵ�
		int b=8;
		System.out.println(a);
		System.out.println(b);
		//�� ���� ���� ���
		System.out.println(a+b);
		System.out.println("�հ� :"+(a+b));
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+a*b);
		System.out.println("a/b:"+a/b); //��
		System.out.println("a%b:"+a%b); //������
		
		//������ r�� 5�� �����ϰ�
		//���� ���̸� ����Ͻÿ� (������*������*3.14)
		//�������� 3.14
		int r=5; 
		//final double PI=3.14;
		final float PI=3.14f;
		// pi=3.15;
		System.out.println("���� ���� :"+r*r*3.14);
		System.out.println("���� ���� :"+r*r*PI);
		/*
		 * int: 4����Ʈ(1����Ʈ => 8��Ʈ)
		 * double(�Ǽ�):8����Ʈ ===>�⺻
		 * float(�Ǽ�);4����Ʈ 
		 */
		 
		//float �� f������ 5 �Ҵ�
		float f=5f;
		int num=10;
		f=num; //float = int (4����Ʈ/4����Ʈ �Ǽ�>����) ==>����ȯ(�ڵ� ����ȯ)
		System.out.println("f:"+f);
		num=(int)f; //����<�Ǽ� ==>����ȯ(����� ����ȯ)
		
		
	}
}
