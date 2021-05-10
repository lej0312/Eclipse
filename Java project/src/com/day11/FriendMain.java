package com.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendMain {
	private ArrayList<Friend> arr = new ArrayList<>();
	File dir, file;

	public FriendMain() throws IOException, ClassNotFoundException { // ������ �о arr �߰�
		dir = new File("src\\com\\day11");
		file = new File(dir, "myfriend.txt");

		if (file.exists()) { // ������ �о arr �߰�
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr = (ArrayList<Friend>) ois.readObject();
			ois.close();
		} else { // ���� ����
			file.createNewFile();// ���� ���� �����
		}
	}

	private void fileUse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ģ�� �߰� 2.ģ�� ����Ʈ ���� 3.����/����");
			int choice = sc.nextInt(); // 1����
			sc.nextLine(); // �� 35������ ��ȣ �Է� �� ���� ���� ó��
			if (choice == 1) { // 1.ģ�� �߰�
				System.out.println("�̸�>>");
				String name = sc.nextLine();
				System.out.println("����>>");
				String birth = sc.nextLine();
				System.out.println("�ּ�>>");
				String addr = sc.nextLine();
				System.out.println("��ȭ��ȣ>>");
				String tel = sc.nextLine();
				Friend f = new Friend();
				f.setAddress(addr);
				f.setBirth(birth);
				f.setName(name);
				f.setTel(tel);
				arr.add(f);// ArrayList�� ģ�� �߰�

			} else if (choice == 2) { // 2.ģ�� ����Ʈ ����
				for (Friend f : arr) {
					System.out.println("�̸�:" + f.getName());
					System.out.println("����:" + f.getBirth());
					System.out.println("�ּ�:" + f.getAddress());
					System.out.println("��ȭ��ȣ:" + f.getTel());
					System.out.println();
				}

			} else if (choice == 3) { // 3.����/���� arr==>file(myfriend.txt)�� ��������
				// ����
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(arr);
				// ����
				System.out.println("����");
				System.exit(0);

			} else { // �Է� ����
				System.out.println("�Է� ����");

			}

		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FriendMain fm = new FriendMain();
		fm.fileUse();

	}

}
