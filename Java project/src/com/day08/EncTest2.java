package com.day08;

public class EncTest2 {
	public String encrypt(String msg) {
		// ��, ������ �״�� ���
		//String result = "";
		//String Builder ���
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() ���� �ϳ� ���� (�����ϳ��� ' ' (��������))
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
			if (msg.charAt(i) == ' ') {// charAt() ���� �ϳ� ���� (�����ϳ��� ' ' (��������))
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
		System.out.println("��ȣȭ ��:" + msg);
		String str = enc.encrypt(msg); // +2
		System.out.println("��ȣȭ ��:" + str);
		System.out.println("��ȣȭ ��:" + enc.decrypt(str)); // -2

	}

}
