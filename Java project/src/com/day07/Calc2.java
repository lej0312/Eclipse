package com.day07;

public interface Calc2 {//interface ��� ���� �߻�޼ҵ�� �̷������ �߻� abstract ����
	//�������̽� ������ final, (final ��������)
	//�޼ҵ�� �߻����� ������� (abstract ��������)
	//***�߻�Ŭ����, �������̽�
	
	int value=5; //=final int value=5;
	public int add(int a,int b);
	public int sub(int a,int b);
	public double average(int[]a);
}
