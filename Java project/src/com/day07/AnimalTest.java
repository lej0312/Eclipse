package com.day07;

import java.util.ArrayList;

//p275 276

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}

}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}

}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
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
			if (ani instanceof Human) {// *instanceof => ���� ��ü�� ���� ������ ����°� => ani�� Human������
				Human h = (Human) ani; //����=���� => �Ұ����ϱ� ������ ĳ���� �ؾ���
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}

		}
	}

	public static void main(String[] args) {
		AnimalTest atest = new AnimalTest();
		atest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		atest.testCasting();
	}

}
