package com.day03;

public class Bank { //***this==>�ڱ��ڽ� ��ü
	String name; //�̸�
	int money; //�ܾ�
	public Bank() {//����Ʈ ������, �������� (���ڰ� ����?) ***������
		System.out.println("������"); //��� �� 
	}
	public void inputMoney(int money) {//�Ա��ϴ�
		this.money += money; //5�� = 6��
	}
	public void outMoney(int money) {//����ϴ� �ܾ׺���
//		if(this.money>=money) { //5�� = 9��
//		this.money -= money;
//		}else {
//			System.out.println("�ܾ׺���");
//		}
		//���2
		if(this.money<money) {
			System.out.println("�ܾ׺���");
			return;
		}
		this.money -= money;
	
	}
	public void getMoney() {//�ܾ�Ȯ��
		System.out.println(name+"�� �ܾ�:"+this.money);
	}
	public static void main(String[]args) {
		Bank b1=new Bank();
		b1.name="ȫ�浿";
		//�Ա��ϴ�
		b1.inputMoney(5000);//5000 �Ű�����?
		b1.getMoney();
		//���
		b1.outMoney(7000);
		b1.getMoney();
		
		//�̼��� ���� 10000���� �Ա�
		Bank b2=new Bank();
		b2.name="�̼���";
		b2.inputMoney(10000);
		b2.getMoney();
		
	}
	

}
