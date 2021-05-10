package com.day10;
//학생
class StudentThread extends Thread{
	private String name;
	private SharedBoard board;
	public StudentThread(String name,SharedBoard board) {
		this.name=name;
		this.board=board;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			board.add();
		}
	}
}
//게시판
class SharedBoard {
	private int sum = 0;
	synchronized public void add() {
		int n = sum;
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
}

public class SynchEx {

	public static void main(String[] args) {
		SharedBoard board=new SharedBoard();
		StudentThread sth1=new StudentThread("이순신",board);
		Thread sth2=new StudentThread("홍길동",board);
		sth1.start();
		sth2.start();
	}
}
