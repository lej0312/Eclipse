package Project;

import java.util.Scanner;

public class AAAAA {

	public static void main(String[] args) {
		String[][] seats = new String[6][10];  //6행 10열의 좌석 배열 생성
		int count = 0;            // 좌석번호 지정 1~60 위해 카운트

		// 좌석 만들기           //다중for 문을 이용해 6행 10열 좌석 만듬.(좌석 번호 매김)
		for (int i = 0; i < seats.length; i++) {       
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = "" + ++count;   //seats[][]좌석은 ++count로 값을 올려줌
			}
		}
		do {    //do를 이용해 우선 출력
			System.out.printf("%23s\n", "<< 영화관 좌석 예매 시스템 >>");
			System.out.println("===============================");
			// 좌석 출력
			for (int i = 0; i < seats.length; i++) {     
				for (int j = 0; j < seats[i].length; j++) {
					System.out.printf("%3s", seats[i][j]);   //3글자로해서 seats값 출력
				}
				System.out.println();     //다음 줄로 행 옮겨주는 역할.
			}
			System.out.println("===============================");
			System.out.println("영화관 좌석을 선택하세요(1~60), 종료:x");

			// 사용자로부터 키보드 입력을 받기위해 사용하는 클래스 선언, 생성
			Scanner scanner = new Scanner(System.in);

			// 사용자로부터 엔터입력전까지의 문자열 입력
			String tmp = scanner.nextLine();     //받은 입력값을 tmp에 저장
			if(tmp.toUpperCase().equals("X")) {    //tmp(입력값)의 문자열이 X와 같으면
				System.out.println("종료합니다!");   //실행문 실행 (종료합니다)
				System.exit(0);    //자바 프로그램 강제 종료
			}

			int mySeat = Integer.parseInt(tmp);    //tmp(입력값)을 mySeat int타입으로 변환
            
            // myRow(행)값은 0부터 5까지! 그래서 1~10은 0행, 11~20은 1행임
            // 1~9까지 모두 0행이나오기 위해서,10으로 나눈 나머지값이 0이면 결과는 1이기때문에
            // -1을 빼주고, 나머지가 0이 아니면, 그대로 10으로 나누어서 나눈 값으로 행값 지정
			int myRow = (mySeat % 10 == 0) ? (mySeat / 10) - 1 : (mySeat / 10);

			int myCol = (mySeat % 10 == 0) ? 9 : (mySeat % 10) - 1;


			if (seats[myRow][myCol].toUpperCase().equals("X")) {   //seats의 문자열이 X라면
				System.out.println("이미 예약된 좌석입니다.");     // 실행문 실행( 이미 예약)
			} else {       // X 가 아니라면 (종료 x)가 아니라면
				outter:   //보기 쉽게 라벨 달아줌
				while(true) {    //while 반복문통해 반복
					System.out.println(mySeat+"번 좌석을 예매하시겠습니까?(1.예약 2.취소)");
					tmp = scanner.nextLine();    //결과값 저장
					switch(tmp) {        //결과값을 통해 switch 조건문 실행
					case "1": //예약
						seats[myRow][myCol] = " X";    //예약하면 X표시
						System.out.println("고객님은 " + mySeat + "번 좌석을 예매하였습니다.");
						break outter;
					case "2": //취소
						System.out.println("고객님은 " + mySeat + "번 좌석을 취소하였습니다.");
						break outter;
					default:
						System.out.println("1.예약 2.취소 중 선택바랍니다.");
						break;
					}
				}
			}
		} while (true);
	}
}

