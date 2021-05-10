package com.day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; //x->확장의 의미

public class PannelTest extends JFrame implements ActionListener {

	public PannelTest() { // 컨테이너..?
		// setTitle("스윙예제");
		super("스윙예제스윙예제"); // 11번과 같음
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("버튼1"); // 컴포넌트
		JButton b2 = new JButton("버튼2"); // 버튼을 눌렀을때 행위가 있는 것-이벤트
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		add(b1); // 부모-Frame
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this); //this-자기 자신의 객체
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String[] args) {
		new PannelTest(); // 익명의 객체
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		//System.out.println(str+" 이벤트 발생");
		if (str.equals("버튼1")) {
			System.out.println("버튼1 이벤트 발생");
			getContentPane().setBackground(Color.BLUE);
		} else if (str.equals("버튼2")) {
			System.out.println("버튼2 이벤트 발생");
			getContentPane().setBackground(Color.YELLOW);
		} else if (str.equals("버튼3")) {
			System.out.println("버튼3 이벤트 발생");
			getContentPane().setBackground(Color.DARK_GRAY);
		} else {
			System.out.println("버튼4 이벤트 발생");
			getContentPane().setBackground(Color.PINK);
		}
	}
}


/*
 * 스윙 
 * GUI 
 * 컴포넌트 
 * 배치관리자(컴포넌트 배치-컨테이너에 컴포넌트를 얹음) 
 * 컨테이너==>Frame JFrame
 * eg.1.JFrame:기본배치 관리-BorderLayout(동, 서, 남, 북, 센터) 
 * 2.FlowLayout:차례대로 배치(왼->오, 위->아래)
 * 
 * 이벤트 처리 절차 eg.PannelTest 
 * 1.컴포넌트 작성 (Jbutton) 
 * 2.이벤트 핸들러 작성 (이벤트 처리 메소드:actionPerformed) 
 * 3.1+2 연결
 */