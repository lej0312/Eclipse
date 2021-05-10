package com.day04;

public class Student {
	String name;
	int kor,math,eng;

	public Student(String name, int kor, int math, int eng) {
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
	public Student(String name) {
		this.name=name;
	}
	public int getTotal() {//����
		return kor+math+eng;
	}
	public double getAverage() {//���
		//return (kor+math+eng)/3; 
		return getTotal()/3;
	}
	public void info() {
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(math+"\t");
		System.out.print(eng+"\t");
		System.out.print(getTotal()+"\t");
		System.out.println(getAverage());
	}
	
	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿",100,80,70);
		Student s2=new Student("�̼���",50,60,70);
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		s1.info();
		s2.info();
		Student s3=new Student("������");
		s3.info();

//		info()�� ����� �����ϰ� ǥ�� ����
//		System.out.print(s1.name+"\t"); 
//		System.out.print(s1.kor+"\t");
//		System.out.print(s1.math+"\t");
//		System.out.print(s1.eng+"\t");
//		System.out.print(s1.getTotal()+"\t");
//		System.out.print(s1.getAverage());
//		System.out.println();
//		
//		System.out.print(s2.name+"\t");
//		System.out.print(s2.kor+"\t");
//		System.out.print(s2.math+"\t");
//		System.out.print(s2.eng+"\t");
//		System.out.print(s2.getTotal()+"\t");
//		System.out.print(s2.getAverage());
	}

}
