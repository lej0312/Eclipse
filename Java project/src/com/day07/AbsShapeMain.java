package com.day07;

public class AbsShapeMain {

	public static void main(String[] args) {
		//�߻� Ŭ������ ��ü ���� ����(new �ȵ�)
		//AbsShape as=new AbsShape(); 
		
		AbsCircle ac=new AbsCircle();
		ac.move();
		
		AbsShape as=new AbsCircle();
		as.draw();
		AbsShape asq=new AbsSquare();
		asq.draw();
		asq.print();
		asq.move();
	}

}
