package com.day05_object;

public class Teacher {
	Student[] arr = new Student[20];
	private int cnt;

	// menu
	public void showMenu() {
		System.out.println("1.성적입력");
		System.out.println("2.성적 전체보기");
		System.out.println("3.종료");
		System.out.println("선택하세요>>");
	}

	// 성적입력
	public void inputData() {
		// 이름, 국어, 영어, 수학 점수 입력받기
		System.out.println("성적입력...");
		System.out.println("이름 >>");
		String name = BookMain.sc.next();
		System.out.println("국어 >>");
		int kor = BookMain.sc.nextInt();
		System.out.println("영어 >>");
		int eng = BookMain.sc.nextInt();
		System.out.println("수학 >>");
		int math = BookMain.sc.nextInt();
		arr[cnt++] = new Student(name, kor, eng, math);

	}

	// 성적리스트
	public void viewData() {
		rankMethod(); // 석차 구하는 메소드
		int sum = 0;
		for (Student s : arr) { // for-each
			if (s == null)
				break;
			System.out.println("이름 : " + s.getName());
			System.out.println("총점 : " + s.getTotal());
			System.out.println("평균 : " + s.getAverage());
			System.out.println("석차 : " + s.getRank());
			System.out.println();
			sum += s.getTotal();
		}
		System.out.println("학급총점 : " + sum);
		System.out.println("학급평균 : " + sum / cnt);
	}

	private void rankMethod() { // 석차 구하는 메소드
		for (int i = 0; i < cnt - 1; i++) { // -1은 마지막 석차는 for 할 필요 없음
			for (int j = i + 1; j < cnt; j++) {
				if (arr[i].getTotal() > arr[j].getTotal()) {
					arr[j].setRank();
				} else if (arr[i].getTotal() < arr[j].getTotal()) {
					arr[i].setRank();
				}
			}
		}
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		while (true) {
			teacher.showMenu();
			int num = BookMain.sc.nextInt(); // BookMain에 scanner에 static을 사용해서 여기서 사용가능 static으로 선언되어 있음
			BookMain.sc.nextLine();
			switch (num) {
			case 1:
				teacher.inputData();
				break;
			case 2:
				teacher.viewData();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("입력오류");
			}
		}

	}

}
