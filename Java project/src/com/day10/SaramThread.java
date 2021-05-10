package com.day10;

public class SaramThread extends Thread {
	private String name;
	public SaramThread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println(name+":"+i+"번째 말한다.");
		}
	}

	public static void main(String[] args) {
		SaramThread sh1=new SaramThread("홍길동");
		SaramThread sh2=new SaramThread("이순신");
		SaramThread sh3=new SaramThread("강감찬");
		sh1.start();
		sh2.start();
		sh3.start();
	}
	

}
