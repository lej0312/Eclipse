package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFile02 {
	// aa.txt 파일을 읽어서 
	// 8진수로 변환하여 cc.txt로 내보내기
	//단, StringTokenizer 이용
	
	// aa.txt를 한줄씩 읽어들여 : 나누어 이를 8진수로 변환하여
	//cc.txt로 내보내기

	public static void main(String[] args) {
		Scanner sc =null;
		PrintStream ps =null;
		try {
			 sc = new Scanner(new File("src\\com\\day10\\aa.txt"));
			 ps = new PrintStream("src\\com\\day10\\cc.txt");
			while(sc.hasNext()) {
				String str = sc.nextLine();  //10:20
			    StringTokenizer stk = new StringTokenizer(str,":");
			    while(stk.hasMoreTokens()) {
			    	String oct = Integer.toOctalString(Integer.parseInt(stk.nextToken()));
			    	ps.print(oct +"  ");
			    }
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}finally {
			sc.close();
			ps.close();
		}

	}

}
