package com.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.util.Scanner;

//p551
class Person implements Serializable{ //직렬화
	
	private static final long serialVersionUID=11;
	private String name;
	private String job;
	//transient private Scanner sc=new Scanner(System.in); //transient 직렬화할 필요 없는것
	
	
	public Person() {

	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + ":" + job;
	}
}

public class SerialTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person p1 = new Person("홍길동", "대표이사");
		Person p2 = new Person("이순신", "상무이사");
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(p1);
			oos.writeObject(p2);
		}
		try (FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p11 = (Person) ois.readObject();
			Person p22 = (Person) ois.readObject();

			System.out.println(p11);
			System.out.println(p22);
		}

	}

}
