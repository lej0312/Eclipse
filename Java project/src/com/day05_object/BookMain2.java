package com.day05_object;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain2 {
	ArrayList<Book>blist=new ArrayList<Book>();
	static Scanner sc=new Scanner(System.in); //static ����ϸ� �� �� ������� ���� ������ ��� ����

	//�޴�
	public void ShowMenu() {
		System.out.println("1.å �߰�");
		System.out.println("2.å ��ü����");
		System.out.println("3.����");
		System.out.println("�����ϼ���>>");
	}
	//å �԰�
	public void bookInsert() {
		System.out.println("å �԰�>>");
		System.out.println("å ����:");
		String title = sc.nextLine();//�� �� �Է� (���͸� ġ�� ���� �ձ��� �� �ٷ� �ν�) 
		System.out.println("å ����:");
		String writer=sc.nextLine();
		//arr[cnt]=new Book(title,writer);
		//cnt++;
		//arr[cnt++]=new Book(title,writer);
		blist.add(new Book(title, writer));
	}
	
	//å ����Ʈ
	public void bookList() {
		System.out.println("����Ʈ");
//		for(int i=0;i<cnt;i++) {//i<arr.length�� ��, arr.length=50, arr[0] arr[1] null �̹Ƿ� i<cnt���� ��
//			System.out.println("å ����:"+arr[i].getTitle());
//			System.out.println("å ����:"+arr[i].getWriter());
//			System.out.println();
//		}
		//for-each
		for(Book b:blist) {
			if(b==null) break;
			System.out.println("å ����:"+b.getTitle());
			System.out.println("å ����:"+b.getWriter());
			System.out.println();
		}
	}
	public static void main(String[] args) { 
		BookMain bm=new BookMain();
		while(true) {
			bm.ShowMenu();
			int choice=sc.nextInt(); //1 ����
			sc.nextLine();
			switch (choice) {
			case 1:bm.bookInsert();break;
			case 2:bm.bookList();break;
			case 3:System.out.println("����");
				System.exit(0);
			default:System.out.println("�Է¿���");
			}
		}

		
	
		
	}
		
}
