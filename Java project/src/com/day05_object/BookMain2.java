package com.day05_object;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain2 {
	ArrayList<Book>blist=new ArrayList<Book>();
	static Scanner sc=new Scanner(System.in); //static 사용하면 한 번 만들어진 것을 여러번 사용 가능

	//메뉴
	public void ShowMenu() {
		System.out.println("1.책 추가");
		System.out.println("2.책 전체보기");
		System.out.println("3.종료");
		System.out.println("선택하세요>>");
	}
	//책 입고
	public void bookInsert() {
		System.out.println("책 입고>>");
		System.out.println("책 제목:");
		String title = sc.nextLine();//한 줄 입력 (엔터를 치면 엔터 앞까지 한 줄로 인식) 
		System.out.println("책 저자:");
		String writer=sc.nextLine();
		//arr[cnt]=new Book(title,writer);
		//cnt++;
		//arr[cnt++]=new Book(title,writer);
		blist.add(new Book(title, writer));
	}
	
	//책 리스트
	public void bookList() {
		System.out.println("리스트");
//		for(int i=0;i<cnt;i++) {//i<arr.length일 시, arr.length=50, arr[0] arr[1] null 이므로 i<cnt여야 함
//			System.out.println("책 제목:"+arr[i].getTitle());
//			System.out.println("책 제목:"+arr[i].getWriter());
//			System.out.println();
//		}
		//for-each
		for(Book b:blist) {
			if(b==null) break;
			System.out.println("책 제목:"+b.getTitle());
			System.out.println("책 제목:"+b.getWriter());
			System.out.println();
		}
	}
	public static void main(String[] args) { 
		BookMain bm=new BookMain();
		while(true) {
			bm.ShowMenu();
			int choice=sc.nextInt(); //1 엔터
			sc.nextLine();
			switch (choice) {
			case 1:bm.bookInsert();break;
			case 2:bm.bookList();break;
			case 3:System.out.println("종료");
				System.exit(0);
			default:System.out.println("입력오류");
			}
		}

		
	
		
	}
		
}
