package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFile02 {
	// aa.txt ������ �о 
	// 8������ ��ȯ�Ͽ� cc.txt�� ��������
	//��, StringTokenizer �̿�
	
	// aa.txt�� ���پ� �о�鿩 : ������ �̸� 8������ ��ȯ�Ͽ�
	//cc.txt�� ��������

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
