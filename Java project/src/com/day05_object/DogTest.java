package com.day05_object;

public class DogTest {
	
	public static void main(String[] args) {
		Dog[] doglist = new Dog[5];
		doglist[0]=new Dog();
		doglist[0].setName("�۸�0");
		doglist[0].setType("������0");
		
		doglist[1]=new Dog();
		doglist[1].setName("�۸�1");
		doglist[1].setType("������1");
		
		doglist[2]=new Dog();
		doglist[2].setName("�۸�2");
		doglist[2].setType("������2");
		
		doglist[3]=new Dog();
		doglist[3].setName("�۸�3");
		doglist[3].setType("������3");
		
		doglist[4]=new Dog();
		doglist[4].setName("�۸�4");
		doglist[4].setType("������4");
		for(int i=0;i<doglist.length;i++) {
			System.out.println(doglist[i].showDogInfo());
		}
		System.out.println("==========");
		for(Dog dog:doglist) {
			System.out.println(dog.showDogInfo());
		}
		
	}

}
