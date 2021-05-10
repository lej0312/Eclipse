package com.day04;

public class BBS {
	private static int no; //***static:객체마다 만들어지는것이 아니라 하나를 가지고 나눠 쓰는것
	private String name;
	private String date;
	private String title;
	private String content;
	public BBS(String name,String date,String title,String content) {
		BBS.no++; //static사용으로 클래스 이름으로 접근 (하지만 BBS생략 가능)
		this.name=name; //객체 이름으로 접근
		this.date=date;
		this.title=title;
		this.content=content;
		}
	public void print() {
		System.out.println(no+"/"+name+"/"+date+"/"+title+"/"+content);
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public static void main(String[] args) {
		BBS b1=new BBS("홍길동","2021","제목1","내용1");
		b1.print(); //글쓴이,날짜,제목,내용
		BBS b2=new BBS("이순신","2020","제목2","내용2");
		b2.print(); //글쓴이,날짜,제목,내용
		BBS b3=new BBS("강감찬","2021","제목3","내용3");
		b3.print(); //글쓴이,날짜,제목,내용
		
		System.out.println(b1);

	}

}
