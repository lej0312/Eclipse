package com.day04;

//p175
public class Person {
	private String studentName; //�̸�
	private int grade; //�г�
	private int money; //��
	//������
	public Person(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//����öŸ��
	public void takeSubway(Subway subway) {//***Subway�κ� ������(���ڰ�?)���� ��ü�� ��... 
		subway.take(1500);
		this.money-=1500;
	}
	//����Ÿ��
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	//�������
	public void showInfo() {
		System.out.println(studentName+"���� ���� ����"+money+"�Դϴ�.");
	}
}
