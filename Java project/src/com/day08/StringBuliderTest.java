package com.day08;

public class StringBuliderTest {

	public static void main(String[] args) {
		// String 정적 클래스로 한 번 만들어지면 변경 안됨
		// StringBuilder 동적 클래스로 내용 변경됨
		String str = "Hi...Glad to meet you!!";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.append("java"); //*함수 체크 append insert replace delete
		System.out.println(sb);
		sb.insert(2, "oracle");
		System.out.println(sb);
		sb.replace(2, 4, "database  ");
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
		System.out.println(sb.charAt(5));
	}

}
