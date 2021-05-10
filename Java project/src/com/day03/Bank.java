package com.day03;

public class Bank { //***this==>자기자신 객체
	String name; //이름
	int money; //잔액
	public Bank() {//디폴트 생성자, 생략가능 (인자가 없음?) ***생성자
		System.out.println("생성자"); //없어도 됨 
	}
	public void inputMoney(int money) {//입금하다
		this.money += money; //5번 = 6번
	}
	public void outMoney(int money) {//출금하다 잔액부족
//		if(this.money>=money) { //5번 = 9번
//		this.money -= money;
//		}else {
//			System.out.println("잔액부족");
//		}
		//방법2
		if(this.money<money) {
			System.out.println("잔액부족");
			return;
		}
		this.money -= money;
	
	}
	public void getMoney() {//잔액확인
		System.out.println(name+"님 잔액:"+this.money);
	}
	public static void main(String[]args) {
		Bank b1=new Bank();
		b1.name="홍길동";
		//입금하다
		b1.inputMoney(5000);//5000 매개변수?
		b1.getMoney();
		//출금
		b1.outMoney(7000);
		b1.getMoney();
		
		//이순신 고객이 10000원을 입금
		Bank b2=new Bank();
		b2.name="이순신";
		b2.inputMoney(10000);
		b2.getMoney();
		
	}
	

}
