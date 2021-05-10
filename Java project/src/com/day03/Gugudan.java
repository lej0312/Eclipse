package com.day03;
//***gugudan sachik 체크
public class Gugudan {
	int dan;
	public Gugudan() {//생성자 ***오버로딩(인자가 다르게 접근하는 것?)

	}
	public Gugudan(int dan) {//***생성자
		this.dan=dan;
	}
	public void print() {
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	public static void main(String[] args) {
		//생성자는 클래스 이름이며 void가 없음 => 멤버변수 초기값 설정
		Gugudan g1=new Gugudan(5);//생성자
		g1.print();
		
		Gugudan g2=new Gugudan(6);
		g2.print();
	
		Gugudan g3=new Gugudan();//디폴트 생성자:생략 가능하지만 다른 생성자가 있을 경우 생략 불가->5번 줄 참고
		g3.dan=8;
		g3.print();
	}

}
