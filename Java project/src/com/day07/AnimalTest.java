package com.day07;

import java.util.ArrayList;

//p275 276

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();

	public void addAnimal() {
		aniList.add(new Human()); // Animal hu=new Human();
		aniList.add(new Tiger());
		aniList.add(new Eagle());
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if (ani instanceof Human) {// *instanceof => 앞의 개체가 무슨 형인지 물어보는것 => ani가 Human형인지
				Human h = (Human) ani; //하위=상위 => 불가능하기 때문에 캐스팅 해야함
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}

		}
	}

	public static void main(String[] args) {
		AnimalTest atest = new AnimalTest();
		atest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		atest.testCasting();
	}

}
