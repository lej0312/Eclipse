package com.day04;

public class GoodMain {
	public static void main(String[] args) {
		Good g1=new Good("0001","����","�����",1000);
		System.out.println(g1.getName()+":"+g1.getSellingPrice());//����:1000
		Good g2=new Good("0002","���","�����",1500);
		System.out.println(g2.getName()+":"+g2.getSellingPrice());//���:1500
		g2.updatediscountRate(0.2);//20% ����
		System.out.println(g2.getName()+":"+g2.getSellingPrice());//���:?
		System.out.println(g2.getName()+"������:"+g2.getDiscountRate());
	}

}

/*����������
public ->������ ���� ����
�������� default -> ����?

ĸ��ȭ -> ��������
*/