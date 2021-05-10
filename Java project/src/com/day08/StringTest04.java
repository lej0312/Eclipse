package com.day08;

public class StringTest04 {

	public static void main(String[] args) {
		String msg = "This/is/a/java";
		// split() 을 이용해서 Java a is This 출력
		String[] arr = msg.split("/");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// This is a java ===> java a is This ==> avaj a si sihT

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");

		}
		System.out.println();
		String str = "Hi...Glad to meet you!!!!";
		for (int i = 0; i < str.length(); i++) {
			System.out.print((char) (str.charAt(i) + 2));
		}
		System.out.println();

	}

}
