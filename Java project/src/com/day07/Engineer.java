package com.day07;
//p278 4�� ���� => ���� �߻� => ����

class Employee {
	public String name;
	public String grade;
	//public Employee() {
	 //
	 //}

	public Employee(String name) {
		this.name = name;
	}
}

public class Engineer extends Employee {
	private String skillset;

	public Engineer() {
		super("ȫ�浿");
	}

	public String getSkillSet() {
		return skillset;
	}

	public void setSkilSet(String skillset) {
		this.skillset = skillset;

	}
}