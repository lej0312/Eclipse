package com.day10;

public class ExceptionTest01 { //예외처리:예상되는 오류를 처리하는 것

	public static void main(String[] args) { //try catch finally
		String[] msg = { "one", "two", "three" };
//		String str=null;
		try {
//			System.out.println(str.length()); //문자열의 길이
			for (int i = 0; i < 3; i++) {
				System.out.println(msg[i]);
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("배열범위 초과"); // 오류 대신 나오는 문장
		} catch (NullPointerException n) {
			System.out.println("null값 발생"); // 오류 대신 나오는 문장
		} finally {
			System.out.println("반드시 수행 문장"); // 반드시 수행하는 문장
		}

	}

}
