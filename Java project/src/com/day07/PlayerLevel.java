package com.day07;
//p299
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {//final-�����Ұ�
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		run();
		
	}
	
}
