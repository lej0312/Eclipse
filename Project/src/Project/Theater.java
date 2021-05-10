package Project;

import java.util.Scanner;

public class Theater {
	static Scanner sc = new Scanner(System.in);
	static int[][] seat = new int[5][5];
	static int row; // 행-숫자
	static String col; // 열-영어
	static int seatCol = 0;

	static void Check() {
		System.out.println();
		System.out.println("────────SCREEN────────");
		System.out.println();

		for (int i = 0; i < seat.length; i++) {
			System.out.print("[" + (i + 1) + "]");
		}
		System.out.println("행");// 행 선택

		for (int i = 0; i < seat.length; i++) {
			System.out.println();
			for (int j = 0; j < seat[i].length; j++) {
				if (seat[i][j] == 0) {
					System.out.print("[□]");
				} else {
					System.out.print("[■]");
				}
			}
			System.out.println((char) (i + 65) + "열"); // 열 선택 char(65)=A
		}
		System.out.println("────────────────────");
		System.out.println();
		System.out.println("좌석 조회 서비스입니다.");
		System.out.println("예매를 계속 진행하시려면 2번, 프로그램을 종료하시려면 5번을 입력하세요.");
		System.out.println();
	}

	static void Book() {

		System.out.println("예매하실 좌석의 열을 입력하세요.(A~E, 대소문자 구분)");
		col = sc.next();
		char[] c = col.toCharArray();
		if (c[0] < 'A' || c[0] > 'E') {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			System.out.println();
			return;
		}
		switch (col.toUpperCase()) {
		case "A":
			seatCol = 0;
			break;
		case "B":
			seatCol = 1;
			break;
		case "C":
			seatCol = 2;
			break;
		case "D":
			seatCol = 3;
			break;
		case "E":
			seatCol = 4;
			break;
		}
		System.out.println("예매하실 좌석의 행을 입력하세요.(1~5)");
		row = sc.nextInt();
		if (row < 1 || row > 5) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			System.out.println();
			return;
		}

		if (seat[row - 1][seatCol] == 1) {
			System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요.");
			System.out.println();
			return;
		}
		seat[row - 1][seatCol] = 1;

		System.out.println(col + "열 " + row + "행 좌석이 예매되었습니다.");
		System.out.println();
	}

	static void View() {
		System.out.println();
		System.out.println("───────────SCREEN───────────");
		for (int i = 0; i < seat.length; i++) {
			System.out.print("[" + (i + 1) + "]");
		}
		System.out.println("행");// 행 선택

		for (int i = 0; i < seat.length; i++) {
			System.out.println();
			for (int j = 0; j < seat[i].length; j++) {
				if (seat[i][j] == 0) {
					System.out.print("[□]");
				} else {
					System.out.print("[■]");
				}
			}
			System.out.println((char) (i + 65) + "열"); // 열 선택 char(65)=A
		}
		System.out.println("──────────────────────────");
		System.out.println();
		System.out.println("예매 내용을 확인하였습니다.");
		System.out.println("고객님이 예매하신 좌석은 " + col + "열 " + row + "행 좌석입니다.");
		System.out.println();
	}

	static void Cancle() {
		String cc;

		System.out.println("고객님이 예매하신 좌석은 " + col + "열 " + row + "행 좌석입니다.");
		System.out.println("예매를 취소 하시겠습니까? (Y/N, 대소문자 구분)");
		cc = new Scanner(System.in).nextLine();
		if (cc.equals("Y")) {
			System.out.println("예매가 취소되었습니다.");
			System.out.println();
			seat[row - 1][seatCol] = 0;
		} else {
			System.out.println("예매가 취소되지 않았습니다.");
			System.out.println();
		}
	}

	static void Exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		boolean Service = true;
		while (Service) {
			System.out.println("*~*~영화 예매 프로그램~*~*");
			System.out.println("──────────────────────");
			System.out.println("1.좌석 조회");
			System.out.println("2.좌석 예매");
			System.out.println("3.예매 확인");
			System.out.println("4.예매 취소");
			System.out.println("5.프로그램 종료");
			System.out.println("──────────────────────");
			System.out.println("원하는 서비스를 선택하세요.");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				Theater.Check();
				break;
			case 2:
				Theater.Book();
				break;
			case 3:
				Theater.View();
				break;
			case 4:
				Theater.Cancle();
				break;
			case 5:
				Theater.Exit();
				Service = false;
				break;
			default:
				System.out.println("정확한 숫자를 입력하세요.");
				break;
			}
		}
	}
}