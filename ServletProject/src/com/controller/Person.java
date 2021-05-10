package com.controller;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String[] hobby;
	private String job;
	
	//디폴트 생성자
	public Person() {
		
	}
	
	//생성자
	public Person(String name, int age, String gender, String[] hobby, String job) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
		this.job = job;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String[] getHobby() {
		return hobby;
	}
	public String getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
}
