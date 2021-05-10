package com.day10;

public class GugudanTh2 implements Runnable { // Runnable »ç¿ëÇÏ¿©
	private int dan;

	public GugudanTh2(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

	public static void main(String[] args) {
		GugudanTh2 gth1 = new GugudanTh2(5);
		Thread th1 = new Thread(gth1); // Thread °´Ã¼ »ı¼º
		th1.start();

		GugudanTh2 gth2 = new GugudanTh2(8);
		Thread th2 = new Thread(gth2);
		th2.start(); // 5,8´ÜÀÌ ¼¯¿©¼­ ³ª¿È
	}

}
