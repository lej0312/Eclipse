package com.day10;

public class ExceptionTest01 { //����ó��:����Ǵ� ������ ó���ϴ� ��

	public static void main(String[] args) { //try catch finally
		String[] msg = { "one", "two", "three" };
//		String str=null;
		try {
//			System.out.println(str.length()); //���ڿ��� ����
			for (int i = 0; i < 3; i++) {
				System.out.println(msg[i]);
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("�迭���� �ʰ�"); // ���� ��� ������ ����
		} catch (NullPointerException n) {
			System.out.println("null�� �߻�"); // ���� ��� ������ ����
		} finally {
			System.out.println("�ݵ�� ���� ����"); // �ݵ�� �����ϴ� ����
		}

	}

}
