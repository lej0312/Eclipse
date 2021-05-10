package com.day08;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp길이
		System.out.println("tmp 길이:"+tmp.length());
		System.out.println("tmp 마지막 숫자:"+tmp.charAt(tmp.length()-1));
		//숫자의 합
		String[]arr = tmp.split(" ");//공백으로 구분하여 배열에 담는다
		System.out.println("arr 길이:"+arr.length);
		System.out.println("마지막 숫자:"+arr[arr.length-1]);
		//숫자의 합
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		//	sum += arr[i]; //문자=>숫자
			sum += Integer.parseInt(arr[i]); 
		}
		System.out.println("숫자 합계:"+sum);	
		//sum을 16진수로 표현
		System.out.println("sum 16진수:"+Integer.toHexString(sum)); //
		//16진수 대문자로 표현
		System.out.println("sum 16진수 대문자:"+Integer.toHexString(sum).toUpperCase());
		String hex="";
		String oct="";
		String bin="";
		//arr의 값을 16,8,2 진수 표현하기
		for(int i=0;i<arr.length;i++) {
			int v=Integer.parseInt(arr[i]); //문자->숫자
			hex +=Integer.toHexString(v)+" ";
			oct +=Integer.toOctalString(v)+" ";
			bin +=Integer.toBinaryString(v)+" ";
		}
		System.out.println("16진수:"+hex); //16진수
		System.out.println("8진수:"+oct); //8진수
		System.out.println("2진수:"+bin); //2진수
		//           012345678
		String test="abce test hi java";
		System.out.println(test.substring(3,8)); //문자 추출 3~8까지 위치
		System.out.println(test.substring(3));
		//substring 사용하여 java추출
		int i=test.indexOf('j');
		System.out.println(test.substring(i,i+4));
		
	}

}
