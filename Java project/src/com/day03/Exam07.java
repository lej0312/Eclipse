package com.day03;

public class Exam07 {

	public static void main(String[] args) {
		//로또 번호 생성기
		//1~45 사이 수 6개 발생
		//중복허용 안됨
		
		//로또 번호 6개 출력하기
		int[] lotto=new int[6];
		int n=0;//배열에 들어간 로또번호 갯수
		while(n<lotto.length){
			int r=(int)(Math.random()*45)+1;//난수발생
			lotto[n]=r; ////난수를 배열에 저장
			for(int i=0;i<n;i++) {//중복확인
				if(r==lotto[i]) {
					n--;
					break;
				}
			}
			n++; //배열에 로또번호 들어갔으니 1증가
		}
		//로또 번호 6개 출력하기
		System.out.println();
		System.out.println("=======");
		for(int num:lotto) {
			System.out.println(num+"\t");
		}
		
		
		

	}

}
