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
	public int getTotal() {//총점
		return kor+math+eng;
	}
	public double getAverage() {//평균
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
		Student s1=new Student("홍길동",100,80,70);
		Student s2=new Student("이순신",50,60,70);
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		s1.info();
		s2.info();
		Student s3=new Student("강감찬");
		s3.info();

//		info()를 만들어 간단하게 표현 가능
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
