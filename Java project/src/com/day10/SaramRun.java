package com.day10;

public class SaramRun implements Runnable {
	private String name;
	
	public SaramRun(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		SaramRun sr1=new SaramRun("홍길동");
		SaramRun sr2=new SaramRun("이순신");
		SaramRun sr3=new SaramRun("강감찬");
		Thread th1=new Thread(sr1);
		th1.start();
		Thread th2=new Thread(sr2);
		th2.start();
		Thread th3=new Thread(sr3);
		th3.start();
	}
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println(name+":"+i+"번째 말하다.");
			
	//ArrayList Vector (동기화 구현)
	//HashMap HashTable (동기화 구현)
			
			
		}

	}

}
