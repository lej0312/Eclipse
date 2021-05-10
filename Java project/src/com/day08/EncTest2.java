package com.day08;

public class EncTest2 {
	public String encrypt(String msg) {
		// 단, 공백은 그대로 출력
		//String result = "";
		//String Builder 사용
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() 문자 하나 리턴 (문자하나는 ' ' (공백있음))
				sb.append(msg.charAt(i));
			} else {
				sb.append((char)(msg.charAt(i)+2));
			}
		}
		return sb.toString();
	}

	public String decrypt(String msg) {
		//String result = "";
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() 문자 하나 리턴 (문자하나는 ' ' (공백있음))
				sb.append(msg.charAt(i));
			} else {
				sb.append((char)(msg.charAt(i)-2));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		EncTest2 enc = new EncTest2();
		String msg = "Hi...Glad to meet you!!";
		System.out.println("암호화 전:" + msg);
		String str = enc.encrypt(msg); // +2
		System.out.println("암호화 후:" + str);
		System.out.println("복호화 후:" + enc.decrypt(str)); // -2

	}

}
