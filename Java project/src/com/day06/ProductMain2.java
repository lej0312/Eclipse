package com.day06;

import java.util.ArrayList;
import java.util.List;  //util�� �ִ� �� �ݵ�� ����Ʈ ������� �ֳ��ϸ� lang�� �ƴ϶�...?

class Product2 {
	protected int price;// ����
	protected int bonus;// ��ǰ�� 10% ���ʽ� ����

	// ������
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
	public String toString() { //***toString �ֻ��� ��ü Object�� ������ �ִ� �޼ҵ�, �������̵� ����
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
		return "�����";
	}
}

// ������
class Buyer2 {
	private int money;
	private int bonusPoint;
	List<Product2>alist=new ArrayList<>(); //ArrayList alist
	private int cnt;
	// ������
	public Buyer2(int money) {
		this.money = money;
	}

	// ���� ���
	public void buy(Product2 p) {//��-,����Ʈ+,���ų����� �߰�(����� �ʿ�)
		money -= p.price;
		bonusPoint += p.bonus;
		alist.add(p);
	}
	
	//ȯ���ϴ�
	public void refund(Product2 p) {
		alist.remove(p);
		money += p.price;
		bonusPoint -= p.bonus;	
	}
	
	// ���� ���� ����
	public void show() {//��,����Ʈ,���ų��� ���
		int sum=0;
		for(int i=0; i<alist.size(); i++) {
			System.out.println("���Ż�ǰ:"+alist.get(i));
			sum+=alist.get(i).price;
		}
		System.out.println("���űݾ�:"+sum);
		System.out.println("����Ʈ:"+bonusPoint);
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
		
		b.refund(com); //��ǰ:���Ÿ���Ʈ���� ����,��+,����Ʈ-
		
		b.show();

	}

}
