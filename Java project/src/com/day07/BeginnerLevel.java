package com.day07;

//p300
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 할 줄 모름.");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 할 줄 모름.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** 초보자 레벨입니다. ***");
		
	}

}
