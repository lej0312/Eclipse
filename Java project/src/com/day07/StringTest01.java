package com.day07;

public class StringTest01 {// ==:�ּ� ����� / equals:���� �����
							//public class StringTest01 extends Object�� ���� Object�� �ֻ��� ��ü���� ���� ����
	public static void main(String[] args) {
		String str="�ȳ�";
		String str1="�ȳ�";
		String tmp=new String("�ȳ�");
		if(str==tmp) {
			System.out.println("str===tmp �ּ� ����");
		}else {
			System.out.println("str==tmp �ּ� �ٸ���");
		}

		if(str==str1) {
			System.out.println("str==str1 �ּ� ����");
		}else {
			System.out.println("str==str1 �ּ� �ٸ���");
		}
		
		if(str.equals(tmp)) {
			System.out.println("str equals tmp ���� ����");
		}else {
			System.out.println("str euqals tmp ���� �ٸ���");
		}
		
		if(str.equals(str1)) {
			System.out.println("str equals str1 ���� ����");
		}else {
			System.out.println("str euqals str1 ���� �ٸ���");
		}
		str=str+str1; //�ȳ�ȳ� String Ŭ������ ����Ŭ������ ������ �ٲ��� ���Ѵ�.
		if(str==str1) {
			System.out.println("str==str1 �ٽ� �ּ� ����");
		}else {
			System.out.println("str==str1 �ٽ� �ּ� �ٸ���");
		}
		
		
	}

}
