package com.day06;

class Product {
	protected int price;// 가격
	protected int bonus;// 제품의 10% 보너스 점수

	// 생성자
	public Product(int price) {
		this.price = price;
		this.bonus += price / 10;
	}
}

class PTV extends Product {
	public PTV(int price) {
		super(price);
	}
	@Override
	public String toString() { //***toString 최상위 객체 Object이 가지고 있는 메소드, 오버라이딩 가능
		return "TV";
	}
}

class Computer extends Product {
	public Computer(int price) {
		super(price);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "오디오";
	}
}

// 구매자
class Buyer {
	private int money;
	private int bonusPoint;
	private Product[]arr=new Product[100];//배열
	private int cnt;
	// 생성자
	public Buyer(int money) {
		this.money = money;
	}

	// 물건 사다
	public void buy(Product p) {//돈-,포인트+,구매내역에 추가(저장소 필요)
		money -= p.price;
		bonusPoint += p.bonus;
		arr[cnt++]=p;
	}

	// 구매 물건 보기
	public void show() {//돈,포인트,구매내역 출력
		int sum=0;
		for(int i=0; i<cnt; i++) {
			System.out.println("구매상품:"+arr[i]);
			sum+=arr[i].price;
		}
		System.out.println("구매금액:"+sum);
		System.out.println("포인트:"+bonusPoint);
	}

}

public class ProductMain {

	public static void main(String[] args) {
		Buyer b=new Buyer(1000);
		PTV ptv=new PTV(100);
		Computer com=new Computer(120);
		Audio audio=new Audio(70);
		
		b.buy(ptv);
		b.buy(com);
		b.buy(audio);
		
		b.show();
	}

}
