package com.day08;

public class EncTest {
	public String encrypt(String msg) {
		// 단, 공백은 그대로 출력
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() 문자 하나 리턴 (문자하나는 ' ' (공백있음))
				result += msg.charAt(i);
			} else {
				result += (char) (msg.charAt(i) + 2);
			}
		}
		return result;
	}

	public String decrypt(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() 문자 하나 리턴 (문자하나는 ' ' (공백있음))
				result += msg.charAt(i);
			} else {

				result += (char) (msg.charAt(i) - 2);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		EncTest enc = new EncTest();
		String msg = "Hi...Glad to meet you!!";
		System.out.println("암호화 전:" + msg);
		String str = enc.encrypt(msg); // +2
		System.out.println("암호화 후:" + str);
		System.out.println("복호화 후:" + enc.decrypt(str)); // -2

	}

}
