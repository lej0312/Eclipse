package com.day10;

public class SaramRun implements Runnable {
	private String name;
	
	public SaramRun(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		SaramRun sr1=new SaramRun("ȫ�浿");
		SaramRun sr2=new SaramRun("�̼���");
		SaramRun sr3=new SaramRun("������");
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
			System.out.println(name+":"+i+"��° ���ϴ�.");
			
	//ArrayList Vector (����ȭ ����)
	//HashMap HashTable (����ȭ ����)
			
			
		}

	}

}
