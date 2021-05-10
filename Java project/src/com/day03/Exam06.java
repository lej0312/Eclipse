package com.day03;

public class Exam06 {

	public static void main(String[] args) {
		//로또 번호 생성기
		//1~45 사이 수 6개 발생
		//중복허용 안됨
		
		//로또 번호 6개 출력하기
		int[] lotto=new int[6];
		int n=0;//배열에 들어간 로또번호 갯수
		do {
			boolean flag=false;
			int r=(int)(Math.random()*45)+1;//난수발생
			//중복이면 배열에 못들어감
			for(int i=0;i<n;i++) {
				if(r==lotto[i]) {
					flag=true;
					break;
				}
			}
			if(flag==true)continue;
			lotto[n]=r; ////난수를 배열에 저장
			n++; //배열에 로또번호 들어갔으니 1증가
		}while(n<lotto.length);
		//로또 번호 6개 출력하기
		System.out.println();
		System.out.println("=======");
		for(int num:lotto) {
			System.out.println(num+"\t");
		}
		
		
		

	}

}
