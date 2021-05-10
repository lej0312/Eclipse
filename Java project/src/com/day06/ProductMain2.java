package com.day06;

import java.util.ArrayList;
import java.util.List;  //util에 있는 것 반드시 임포트 해줘야함 왜냐하면 lang이 아니라서...?

class Product2 {
	protected int price;// 가격
	protected int bonus;// 제품의 10% 보너스 점수

	// 생성자
	public Product2(int price) {
		this.price = price;
		this.bonus += price / 10;
	}
}

class PTV2 extends Product2 {
	public PTV2(int price) {
		super(price);
	}
	@Override
	public String toString() { //***toString 최상위 객체 Object이 가지고 있는 메소드, 오버라이딩 가능
		return "TV";
	}
}

class Computer2 extends Product2 {
	public Computer2(int price) {
		super(price);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	public Audio2(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "오디오";
	}
}

// 구매자
class Buyer2 {
	private int money;
	private int bonusPoint;
	List<Product2>alist=new ArrayList<>(); //ArrayList alist
	private int cnt;
	// 생성자
	public Buyer2(int money) {
		this.money = money;
	}

	// 물건 사다
	public void buy(Product2 p) {//돈-,포인트+,구매내역에 추가(저장소 필요)
		money -= p.price;
		bonusPoint += p.bonus;
		alist.add(p);
	}
	
	//환불하다
	public void refund(Product2 p) {
		alist.remove(p);
		money += p.price;
		bonusPoint -= p.bonus;	
	}
	
	// 구매 물건 보기
	public void show() {//돈,포인트,구매내역 출력
		int sum=0;
		for(int i=0; i<alist.size(); i++) {
			System.out.println("구매상품:"+alist.get(i));
			sum+=alist.get(i).price;
		}
		System.out.println("구매금액:"+sum);
		System.out.println("포인트:"+bonusPoint);
	}
		

}

public class ProductMain2 {

	public static void main(String[] args) {
		Buyer2 b=new Buyer2(1000);
		PTV2 ptv=new PTV2(100);
		Computer2 com=new Computer2(120);
		Audio2 audio=new Audio2(70);
		
		b.buy(ptv);
		b.buy(com);
		b.buy(audio);
		
		b.refund(com); //반품:구매리스트에서 제거,돈+,포인트-
		
		b.show();

	}

}
