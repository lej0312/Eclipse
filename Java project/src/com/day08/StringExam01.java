package com.day08;

import java.util.Scanner;

public class StringExam01 {

	public static void main(String[] args) {
		//split() �̿��Ͽ� �Է��� ������ �ܾ�� �� �ܾ� �� ���
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���. ����� exit>>");
			String line=sc.nextLine();
			//if(line.equals("exit"))break;
			//if(line.toLowerCase().equals("exit"))break;
			//if(line.toUpperCase().equals("EXIT"))break;
			if(line.equalsIgnoreCase("exit"))break;
			String[]arr=line.split(" ");
			System.out.println("�ܾ��:"+arr.length);
			for(String word :arr) {
				System.out.println("�ܾ�:"+word);
			}
		}
			sc.close();
			
			
		}
		
		
	}


