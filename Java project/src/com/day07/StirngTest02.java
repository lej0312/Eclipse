package com.day07;

public class StirngTest02 {

	public static void main(String[] args) { //***�Լ�üũ
	String str="�ȳ��ϼ��� Hello ������ �ڹٰ���!!!!!";
	System.out.println("str ����:"+str.length()); 
	System.out.println("H�� ��ġ:"+str.indexOf("H"));
	System.out.println("H�� ��ġ:"+str.indexOf("Hello"));
	System.out.println("4��° ����:"+str.charAt(4));
	String tmp="������ �սô�";
	System.out.println("str�� tmp ����"+str+tmp);
	System.out.println("str�� tmp ����"+str.concat(tmp));
	int value=7;
	//str�� value�� ����
	System.out.println("str�� tmp ����"+str+value);
	System.out.println("str�� tmp ����"+str.concat(value+""));
	//int==String ��ȯ
	String s=String.valueOf(value);
	System.out.println("str�� tmp ����"+str.concat(s));
	System.out.println("str�� tmp ����"+str.concat(String.valueOf(value)));
	String tmp2="jgnfdjgks gkmkdhm fmkadngjh";
	System.out.println("tmp2:"+tmp2);
	System.out.println("tmp2 �빮��:"+tmp2.toUpperCase());
	System.out.println("tmp2 �ҹ���:"+tmp2.toUpperCase().toLowerCase());
	//tmp2 ���ڿ��� ����
	System.out.println("tmp2 ����:"+tmp2.length());
	//tmp2 ���ڿ��� ������ ����
	System.out.println("tmp2 ���ڿ��� ������ ����:"+tmp2.charAt(tmp2.length()-1));
	System.out.println(tmp2.lastIndexOf('d'));
	
	
	}
}
