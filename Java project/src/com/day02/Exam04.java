package com.day02;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		 * 1~10까지의 합 55
		 * 11~20까지의 합 155
		 * 21~30까지의 합
		 * ......
		 * 91~100까지의 합 955
		 * Exam03과 비교해보기
		 */
		int sum=0;
		for(int i=1;i<101;i++) {
			sum += i;
			if(i%10==0) {//i=10 20 30
				System.out.println((i-9)+"부터"+i+"까지의 합"+sum);
				sum=0; //이 부분을 넣지 않으면 틀린 합계가 나옴
			}
		}
		/*
		 * 학생수와 한줄에 앉을 학생 수를 입력받아 출력하시오.
		 * eg)10(학생수) 3(한줄)
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 10	의 형태로
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수>>");
		int stuCnt=sc.nextInt();
		System.out.println("한 줄 인원 수>>");
		int lineCnt=sc.nextInt();
		for(int i=1;i<=stuCnt;i++) {
			System.out.println(i+"\t");
			if(i%lineCnt==0) {
				System.out.println();
			}
		}
		//총 몇줄인지 출력
		int row=0;
		if(stuCnt%lineCnt==0) {
			row = stuCnt/lineCnt;
		}else {
			row = (stuCnt/lineCnt)+1;
		}
		System.out.println("총 라인 수:"+row);
		//삼항연산자
		int r=(stuCnt%lineCnt==0) ? stuCnt/lineCnt : (stuCnt/lineCnt)+1; //?참인 조건: 형식
		System.out.println("총 라인 수:"+r);
		

		
	}

}
