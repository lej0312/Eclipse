package com.day07;

public abstract class AbsShape { //abstract �߻�Ŭ����-�θ� ���� ���ϴ� ���� �ڽ��� �����ϰ� ����� ��?
	//���� �׸���
	public abstract void draw(); //�߻�޼ҵ� abstract
		

	
	//���� ����ϱ�
	public void print() {
		System.out.println("���� ����ϱ�");	
	}
	
	//���� �̵��ϱ�
	public abstract void move(); //�߻�޼ҵ�
		
	
}
