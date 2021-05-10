package com.day05_object;

public class DogTest {
	
	public static void main(String[] args) {
		Dog[] doglist = new Dog[5];
		doglist[0]=new Dog();
		doglist[0].setName("港港0");
		doglist[0].setType("碍酒瘤0");
		
		doglist[1]=new Dog();
		doglist[1].setName("港港1");
		doglist[1].setType("碍酒瘤1");
		
		doglist[2]=new Dog();
		doglist[2].setName("港港2");
		doglist[2].setType("碍酒瘤2");
		
		doglist[3]=new Dog();
		doglist[3].setName("港港3");
		doglist[3].setType("碍酒瘤3");
		
		doglist[4]=new Dog();
		doglist[4].setName("港港4");
		doglist[4].setType("碍酒瘤4");
		for(int i=0;i<doglist.length;i++) {
			System.out.println(doglist[i].showDogInfo());
		}
		System.out.println("==========");
		for(Dog dog:doglist) {
			System.out.println(dog.showDogInfo());
		}
		
	}

}
