package com.day07;

public class StringTest01 {// ==:주소 물어볼때 / equals:내용 물어볼때
							//public class StringTest01 extends Object와 같음 Object는 최상위 개체여서 생략 가능
	public static void main(String[] args) {
		String str="안녕";
		String str1="안녕";
		String tmp=new String("안녕");
		if(str==tmp) {
			System.out.println("str===tmp 주소 같다");
		}else {
			System.out.println("str==tmp 주소 다르다");
		}

		if(str==str1) {
			System.out.println("str==str1 주소 같다");
		}else {
			System.out.println("str==str1 주소 다르다");
		}
		
		if(str.equals(tmp)) {
			System.out.println("str equals tmp 내용 같다");
		}else {
			System.out.println("str euqals tmp 내용 다르다");
		}
		
		if(str.equals(str1)) {
			System.out.println("str equals str1 내용 같다");
		}else {
			System.out.println("str euqals str1 내용 다르다");
		}
		str=str+str1; //안녕안녕 String 클래스는 정적클래스로 내용을 바꾸지 못한다.
		if(str==str1) {
			System.out.println("str==str1 다시 주소 같다");
		}else {
			System.out.println("str==str1 다시 주소 다르다");
		}
		
		
	}

}
