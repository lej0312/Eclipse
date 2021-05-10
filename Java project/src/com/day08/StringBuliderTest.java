package com.day08;

public class StringBuliderTest {

	public static void main(String[] args) {
		// String ���� Ŭ������ �� �� ��������� ���� �ȵ�
		// StringBuilder ���� Ŭ������ ���� �����
		String str = "Hi...Glad to meet you!!";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.append("java"); //*�Լ� üũ append insert replace delete
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
