package com.day08;

public class EncTest {
	public String encrypt(String msg) {
		// ��, ������ �״�� ���
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == ' ') {// charAt() ���� �ϳ� ���� (�����ϳ��� ' ' (��������))
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
			if (msg.charAt(i) == ' ') {// charAt() ���� �ϳ� ���� (�����ϳ��� ' ' (��������))
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
		System.out.println("��ȣȭ ��:" + msg);
		String str = enc.encrypt(msg); // +2
		System.out.println("��ȣȭ ��:" + str);
		System.out.println("��ȣȭ ��:" + enc.decrypt(str)); // -2

	}

}
