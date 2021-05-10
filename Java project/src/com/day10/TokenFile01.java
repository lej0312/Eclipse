package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFile01 {
	// aa.txt ������ �о
	// 16������ ��ȯ�Ͽ� bb.txt�� ��������
	// ��, ���ڿ��� split(":")�Լ� �̿�

	// aa.txt�� ���پ� �о�鿩 :������ �̸� 16������ ��ȯ�Ͽ�
	// bb.txt�� ��������

	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream ps = null;
		try {
			sc = new Scanner(new File("src\\com\\day10\\aa.txt"));
			ps = new PrintStream("src\\com\\day10\\bb.txt");
			while (sc.hasNext()) {
//			ps.println(sc.nextLine());
				String str = sc.nextLine();
				String[] tmp = str.split(":");
				for (int i = 0; i < tmp.length; i++) {
					String hex = Integer.toHexString(Integer.parseInt(tmp[i]));
					ps.print(hex.toUpperCase() + " ");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			ps.close();
		}

	}
}