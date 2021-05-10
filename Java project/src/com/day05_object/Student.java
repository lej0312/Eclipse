package com.day05_object;

public class Student {
	private String name;
	private int kor,eng,math;
	private int rank=1;
	
	public Student(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//
	public String getName() {
		return name;
	}
	//ÃÑÁ¡
	public int getTotal() {
		return kor+eng+math;
	}
	
	//Æò±Õ
	public double getAverage() {
		return(kor+eng+math/3);
	}
	
	public void setRank() {
		this.rank++;
	}
	
	public int getRank() {
		return rank;
	}
}
