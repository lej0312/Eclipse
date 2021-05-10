package com.day06;

class Product {
	protected int price;// ����
	protected int bonus;// ��ǰ�� 10% ���ʽ� ����

	// ������
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
	public String toString() { //***toString �ֻ��� ��ü Object�� ������ �ִ� �޼ҵ�, �������̵� ����
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
		return "�����";
	}
}

// ������
class Buyer {
	private int money;
	private int bonusPoint;
	private Product[]arr=new Product[100];//�迭
	private int cnt;
	// ������
	public Buyer(int money) {
		this.money = money;
	}

	// ���� ���
	public void buy(Product p) {//��-,����Ʈ+,���ų����� �߰�(����� �ʿ�)
		money -= p.price;
		bonusPoint += p.bonus;
		arr[cnt++]=p;
	}

	// ���� ���� ����
	public void show() {//��,����Ʈ,���ų��� ���
		int sum=0;
		for(int i=0; i<cnt; i++) {
			System.out.println("���Ż�ǰ:"+arr[i]);
			sum+=arr[i].price;
		}
		System.out.println("���űݾ�:"+sum);
		System.out.println("����Ʈ:"+bonusPoint);
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
