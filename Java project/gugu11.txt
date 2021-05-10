package com.day10;

public class GugudanTh extends Thread { // Thread를 상속받음
	private int dan;

	public GugudanTh(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() { // Thread를 상속받아 run을 통해 실행함
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

	public static void main(String[] args) {
		// 가장 작은 실행 단위:Thread
		// 단일 쓰레드
		// 멀티 쓰레드
		// Thread
		GugudanTh gt1 = new GugudanTh(5);
		gt1.start();
		GugudanTh gt2 = new GugudanTh(6);
		gt2.start();
		GugudanTh gt3 = new GugudanTh(9);
		gt3.start();

	}

}
