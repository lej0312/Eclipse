package com.day01;

public class Exam01 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		//자바 한 줄 주석
		/*
		 	자바 여러 줄 주서
		 */
		int age=20; //age라는 변수에 20을 저장
		System.out.println(age);
		System.out.println("age");
		String addr="부산";
		System.out.println(addr);
		//나이:20
		System.out.println("나이 :"+age);
		//주소:부산
		System.out.println("주소 :"+addr);
		//이름 변수 name을 선언하고 홍길동을 할당
		//이름:홍길동
		String name="홍길동";
		System.out.println("이름 :"+name);
		//변수 a에 15를 할당
		int a=15;
		//변수 b에 8을 할당
		int b=8;
		System.out.println(a);
		System.out.println(b);
		//두 수의 합을 출력
		System.out.println(a+b);
		System.out.println("합계 :"+(a+b));
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+a*b);
		System.out.println("a/b:"+a/b); //몫
		System.out.println("a%b:"+a%b); //나머지
		
		//반지름 r을 5로 지정하고
		//원의 넓이를 출력하시오 (반지름*반지름*3.14)
		//원주율은 3.14
		int r=5; 
		//final double PI=3.14;
		final float PI=3.14f;
		// pi=3.15;
		System.out.println("원의 넓이 :"+r*r*3.14);
		System.out.println("원의 넓이 :"+r*r*PI);
		/*
		 * int: 4바이트(1바이트 => 8비트)
		 * double(실수):8바이트 ===>기본
		 * float(실수);4바이트 
		 */
		 
		//float 형 f변수에 5 할당
		float f=5f;
		int num=10;
		f=num; //float = int (4바이트/4바이트 실수>정수) ==>형변환(자동 형변환)
		System.out.println("f:"+f);
		num=(int)f; //정수<실수 ==>형변환(명시적 형변환)
		
		
	}
}
