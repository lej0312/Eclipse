package com.day07;
//302p
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("���� ���� �����մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** ������ �����Դϴ�. ***");
		
	}

}