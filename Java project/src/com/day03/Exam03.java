package com.day03;

public class Exam03 {

	public static void main(String[] args) {
		//int형 5개를 가지는 배열
		int[] arr=new int[5]; //5개의 int를 가지는 배열 arr 생성
			System.out.println("arr:"+arr);//배열은 주소값을 가짐
			arr[3]=100;
				for(int i=0;i<5;i++) {
					System.out.println(arr[i]);//arr[0] arr[1] arr[2] arr[3] arr[4]
				}
				//arr[5]=200; 4까지만 가져서 오류남
				
		//크기가 5인 배열 tmp를 만들고
		//tmp 값은 1 2 3 4 5
		int[] tmp=new int[5];
//		tmp[0]=1;
//		tmp[1]=2;
//		tmp[2]=3;
//		tmp[3]=4;
//		tmp[4]=5;
		for(int i=0; i<tmp.length;i++) {
			tmp[i]=i+1;
		}
		for(int i=0; i<tmp.length;i++) {
			System.out.println(tmp[i]);
		}
		System.out.println("===========");
		//값을 100 200 300을 가지는 배열크기가 3인 str 생성
		int[]str={100,200,300};//크기가 3인 배열
		// str[3]=400; 오류발생 -> 3의 자리에 이미 300이 있어서?
		
//		int[]str=new int[3];
//		str[0]=100;
//		str[1]=200;
//		str[2]=300;
		
		String[] st= {"one","two","three","four"};//문자열 배열
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		
		
				
	}

}
