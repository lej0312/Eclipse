package Project;

import java.util.Scanner;



public class p {

	public static String[][] seat = new String[5][9];

	public void resetSeat(){

		for(int i=1; i<5; i++){

			for(int j=1; j<9; j++){

				seat[i][j]="___";

			}

		}

	}//resetSeat

	public void reference(){

		char row = 'A';

		for(int i=1; i<5; i++){

			System.out.print("\n"+row+"열  ");row++;

			for(int j=1; j<9; j++){

				String seat = (this.seat[i][j].equals("___"))?"◻︎":"◼︎";

				System.out.print((j)+seat+"  ");

			}

		}

		System.out.println();

	}//reference

 public static void main(String[] args){

	p cr = new p();

	 cr.resetSeat();

	 int selectNum, row, col;

	 String user;

	 boolean flag = true;

	 boolean exit = true;

	 Scanner scan = new Scanner(System.in);

	 System.out.print("이름을 입력해주세요->");

	 user = scan.nextLine();

	 do{

		 System.out.println("\n1.조회 2.예약 3.예약자취소 4.관리자취소 5.종료(기능) 6.로그인("+user+")");

		 System.out.print("원하시는 서비스를 선택해주세요->");

		 selectNum = scan.nextInt();

		 if(selectNum==1){

			 System.out.println("좌석조회 서비스 입니다.");

			 cr.reference();		 

		 }else if(selectNum==2){

			do{

				 System.out.print("열을 선택하세요->");

				 row = scan.nextInt();

				 System.out.print("행을 선택하세요->");

				 col = scan.nextInt();

				 if(seat[row][col].equals("___")){

					seat[row][col] = user;

					System.out.println(row+"열"+col+"행 좌석이 예약되었습니다.");

					flag = false;

				 }else{

					System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");

				 }

				 cr.reference();

			}while(flag);

		 }else if(selectNum==3){

			 for(int i=1; i<5; i++){

				 for(int j=1; j<9; j++)

					 if(seat[i][j].equals(user)){

						 String yn;

						 System.out.println("예약하신 좌석은 "+i+"열"+j+"행 입니다.");

						 System.out.print("예약취소 하시겠습니다?(y/n)");

						 yn = new Scanner(System.in).nextLine();

						 if(yn.equals("y")){

							 seat[i][j]="___";

							 System.out.println("예약이 취소되었습니다.");

						 }else{

							 System.out.println("예약이 취소되지 않았습니다.");

						 }cr.reference();

					 }

			 }

		 }else if(selectNum==4){

			 do{

				 System.out.print("열을 선택하세요->");

				 row = scan.nextInt();

				 System.out.print("행을 선택하세요->");

				 col = scan.nextInt();

				 if(seat[row][col].equals(user)){				 

					 seat[row][col]="___";

					 System.out.println("삭제완료");

					 flag = false;

				 }else{

					 System.out.println("예약되지않은 좌석입니다. 새롭게 선택하세요!");

				 }

			 }while(flag);

			 cr.reference();

		 }else if(selectNum==5){

			 System.out.println("서비스를 종료합니다.");break;

		 	}

	 }while(exit);

 }//main


}//class

