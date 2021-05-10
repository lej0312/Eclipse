package com.day03;

public class Exam05 {

	public static void main(String[] args) {
		/*
		 * 크기가 10인 배열을 만들고
		 * 0~50 사이 난수를 발생해서 배열에 넣기
		 * 단, 0이 아닌 값을 넣기
		 * 배열에 같은 값(중복) 허용
		 * 
		 */
		
		int[] arr=new int[10];
		int n=0; //배열에 넣은 수
		while(n<arr.length) {//1<10
			int r=(int)(Math.random()*50);//14 0
			if(r==0) continue;
			arr[n]=r; //eg)arr[0]=14;
			n++;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"\t");
//		}
		
		//for-each문 (위와 같은 결과)
		for(int num:arr) {
			System.out.println(num+"\t");
		}
		
		
		
	}
}
