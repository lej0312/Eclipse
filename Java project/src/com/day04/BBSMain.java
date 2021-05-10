package com.day04;

public class BBSMain {
	public static void main(String[] args) {
		BBS b1=new BBS("홍길동","2021","제목1","내용1");
		b1.print(); //글쓴이,날짜,제목,내용
		BBS b2=new BBS("이순신","2020","제목2","내용2");
		b2.print(); //글쓴이,날짜,제목,내용
		BBS b3=new BBS("강감찬","2021","제목3","내용3");
		b3.print(); //글쓴이,날짜,제목,내용
		System.out.println(b1.getName());
		System.out.println(b1.getDate());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());
		//b1.date="2019";
		b1.setDate("2019");
		b1.print();
	}
}
