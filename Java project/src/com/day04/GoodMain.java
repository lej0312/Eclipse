package com.day04;

public class GoodMain {
	public static void main(String[] args) {
		Good g1=new Good("0001","레몬","레몬사",1000);
		System.out.println(g1.getName()+":"+g1.getSellingPrice());//레몬:1000
		Good g2=new Good("0002","사과","사과사",1500);
		System.out.println(g2.getName()+":"+g2.getSellingPrice());//사과:1500
		g2.updatediscountRate(0.2);//20% 할인
		System.out.println(g2.getName()+":"+g2.getSellingPrice());//사과:?
		System.out.println(g2.getName()+"할인율:"+g2.getDiscountRate());
	}

}

/*접근제한자
public ->누구나 접근 가능
생략가능 default -> 가능?

캡슐화 -> 정보은닉
*/