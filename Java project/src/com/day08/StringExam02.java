package com.day08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExam02 {

	public static void main(String[] args) {
		//StirngTokenizer() �̿��Ͽ� �Է��� ������ �ܾ�� �� �ܾ� �� ���
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���. ����� exit>>");
			String line=sc.nextLine();
			
			if(line.equalsIgnoreCase("exit"))break;
			//StringTokenizer stk ����
			StringTokenizer stk=new StringTokenizer(line);
			System.out.println("�ܾ��:"+stk.countTokens());
			while(stk.hasMoreTokens()) {
				System.out.println("�ܾ�:"+stk.nextToken());
			}
		}
			sc.close();
			
			
		}
		
		
	}


