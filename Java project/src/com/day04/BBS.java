package com.day04;

public class BBS {
	private static int no; //***static:��ü���� ��������°��� �ƴ϶� �ϳ��� ������ ���� ���°�
	private String name;
	private String date;
	private String title;
	private String content;
	public BBS(String name,String date,String title,String content) {
		BBS.no++; //static������� Ŭ���� �̸����� ���� (������ BBS���� ����)
		this.name=name; //��ü �̸����� ����
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
		BBS b1=new BBS("ȫ�浿","2021","����1","����1");
		b1.print(); //�۾���,��¥,����,����
		BBS b2=new BBS("�̼���","2020","����2","����2");
		b2.print(); //�۾���,��¥,����,����
		BBS b3=new BBS("������","2021","����3","����3");
		b3.print(); //�۾���,��¥,����,����
		
		System.out.println(b1);

	}

}
