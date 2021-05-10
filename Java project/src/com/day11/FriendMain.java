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

	public FriendMain() throws IOException, ClassNotFoundException { // 파일을 읽어서 arr 추가
		dir = new File("src\\com\\day11");
		file = new File(dir, "myfriend.txt");

		if (file.exists()) { // 파일을 읽어서 arr 추가
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr = (ArrayList<Friend>) ois.readObject();
			ois.close();
		} else { // 파일 없음
			file.createNewFile();// 파일 새로 만들기
		}
	}

	private void fileUse() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.친구 추가 2.친구 리스트 보기 3.저장/종료");
			int choice = sc.nextInt(); // 1엔터
			sc.nextLine(); // 위 35번에서 번호 입력 후 생긴 엔터 처리
			if (choice == 1) { // 1.친구 추가
				System.out.println("이름>>");
				String name = sc.nextLine();
				System.out.println("생일>>");
				String birth = sc.nextLine();
				System.out.println("주소>>");
				String addr = sc.nextLine();
				System.out.println("전화번호>>");
				String tel = sc.nextLine();
				Friend f = new Friend();
				f.setAddress(addr);
				f.setBirth(birth);
				f.setName(name);
				f.setTel(tel);
				arr.add(f);// ArrayList에 친구 추가

			} else if (choice == 2) { // 2.친구 리스트 보기
				for (Friend f : arr) {
					System.out.println("이름:" + f.getName());
					System.out.println("생일:" + f.getBirth());
					System.out.println("주소:" + f.getAddress());
					System.out.println("전화번호:" + f.getTel());
					System.out.println();
				}

			} else if (choice == 3) { // 3.저장/종료 arr==>file(myfriend.txt)로 내보내기
				// 저장
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(arr);
				// 종료
				System.out.println("종료");
				System.exit(0);

			} else { // 입력 오류
				System.out.println("입력 오류");

			}

		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FriendMain fm = new FriendMain();
		fm.fileUse();

	}

}
