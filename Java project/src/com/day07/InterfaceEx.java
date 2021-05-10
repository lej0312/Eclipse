package com.day07;

interface PhoneInterface{
	int TIMEOUT=100000;
	void sendCall();
	void recieveCall();
}

interface MobileInterface extends PhoneInterface{//extends 사용하는것 체크
	void sendSMS();
	void recieveSMS();
}

interface MP3Interface extends PhoneInterface{
	void play();
	void stop();
}

class PDA{
	public int calculate (int x, int y) {
		return x+y;
	}
}
//SmartPhone 클래스 작성
//단, 이클래스는 PDA를 상속받고
//MobileInterface,MP3Interface 인터페이스 기능을 갖는다.

class SmartPhone extends PDA implements MobileInterface,MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("sendCall");
		
	}

	@Override
	public void recieveCall() {
		System.out.println("recieveCall");
		
	}

	@Override
	public void play() {
		System.out.println("play");
		
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("sendSMS");
		
	}

	@Override
	public void recieveSMS() {
		System.out.println("recieveSMS");
		
	}
	
}


public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.sendSMS();
		s.sendSMS();
		s.play();
		System.out.println("3+5"+s.calculate(3, 5));
	}

}
