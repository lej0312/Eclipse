package com.day10;

public class SaramThread extends Thread {
	private String name;
	public SaramThread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println(name+":"+i+"��° ���Ѵ�.");
		}
	}

	public static void main(String[] args) {
		SaramThread sh1=new SaramThread("ȫ�浿");
		SaramThread sh2=new SaramThread("�̼���");
		SaramThread sh3=new SaramThread("������");
		sh1.start();
		sh2.start();
		sh3.start();
	}
	

}
