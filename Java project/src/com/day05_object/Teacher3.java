package com.day05_object;

import java.util.ArrayList;

public class Teacher3 {
	
	ArrayList<Student> blist=new ArrayList<>();
	
	
	//menu
	public void showMenu() {
		System.out.println("1.�����Է�");
		System.out.println("2.���� ��ü����");
		System.out.println("3.����");
		System.out.println("�����ϼ���>>");
	}
	//�����Է�
	public void inputData() {
		// �̸�, ����, ����, ���� ���� �Է¹ޱ�
		System.out.println("�����Է�...");
		System.out.println("�̸� >>");
		String name = BookMain.sc.next();
		System.out.println("���� >>");
		int kor= BookMain.sc.nextInt();
		System.out.println("���� >>");
		int eng= BookMain.sc.nextInt();
		System.out.println("���� >>");
		int math= BookMain.sc.nextInt();
		//arr[cnt++] = new Student(name, kor, eng, math);
		blist.add(new Student(name,kor,eng,math));
	}
	//��������Ʈ
	public void viewData() {
		rankMethod(); // ���� ���ϴ� �޼ҵ�
		int sum =0;
		for(Student s : blist) {	//for-each
			if(s==null) break;
			System.out.println("�̸� : " + s.getName());
			System.out.println("���� : " + s.getTotal());
			System.out.println("��� : " + s.getAverage());
			System.out.println("���� : " + s.getRank());
			System.out.println();
			sum+=s.getTotal();
		}
		System.out.println("�б����� : " + sum);
		System.out.println("�б���� : " +sum/blist.size());
	}
	private void rankMethod() {  //���� ���ϴ� �޼ҵ�
		for(int i=0 ; i<blist.size()-1; i++) { //-1�� ������ ������ for �� �ʿ� ����
			for(int j=i+1  ; j < blist.size() ; j++)  {
				if(blist.get(i).getTotal()  > blist.get(j).getTotal()) {
					  blist.get(j).setRank();
				}else if(blist.get(i).getTotal()  <blist.get(j).getTotal()) {
					blist.get(i).setRank();
				}
			}
		}
	}

	public static void main(String[] args) {
		Teacher teacher =  new Teacher();
		while(true) {
			teacher.showMenu();
			int num = BookMain.sc.nextInt();  //static  ���� ����Ǿ� ����
			BookMain.sc.nextLine();
			switch(num) {
			case 1:teacher.inputData();break;
			case 2:teacher.viewData();break;
			case 3:System.out.println("����");
					System.exit(0);
			default : System.out.println("�Է¿���");		
			}
		}
	
	
	}

}
