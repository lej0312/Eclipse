package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFile01 {
	// aa.txt 파일을 읽어서
	// 16진수로 변환하여 bb.txt로 내보내기
	// 단, 문자열의 split(":")함수 이용

	// aa.txt를 한줄씩 읽어들여 :나누어 이를 16진수로 변환하여
	// bb.txt로 내보내기

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