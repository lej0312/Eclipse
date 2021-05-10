package Project;

import java.util.Scanner;

public class Q2 {
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];

	String name = ""; // 영화관 이름
	int cnt = 0; // 예매 수
	int money = 0; // 매출액

	void showMenu() {
		System.out.println("=====" + name + "=====");
		System.out.println("1.영화예매");
		System.out.println("2. 종료");
		
	}

	void showSeat() {
		for (int c = 0; c < seat.length; c++) {
			System.out.print((c + 1) + " ");
		}
		System.out.println();
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print(seat[i] + " ");
			} else if (seat[i] == 1) {
				System.out.print(seat[i] + " ");
			}
		
		}
		System.out.println();
	}

	void choiceSeat() {
		System.out.println("얘매하실 좌석번호를 입력하세요");
		int seatNum = scan.nextInt();
		seatNum -= 1;
		
		if (seat[seatNum] == 0) {
			seat[seatNum] = 1;
			cnt += 1;
		}
		
		System.out.println("총 얘매한 좌석수 " + cnt);
		
	}

	void showSales() {
		money = cnt * 12000;
		System.out.println("총 매출액 " + money + "원");
	}

	void run() {
		
		while (true) {
			showMenu();
			
			System.out.println("번호를 선택하세요");
			int num = scan.nextInt();
			if (num == 1) {
				showSeat();
				choiceSeat();
				
			} else {
				System.out.println("프로그램을 종료합니다");
				showSales();
				break;
			}
		}
		
		
	}

}

