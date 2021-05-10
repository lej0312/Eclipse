package com.day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest2 extends JFrame {

	public PannelTest2() {
		setTitle("내부 클래스로 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		add(b1);
		add(b2);
		add(b3);
		ActionH ah = new ActionH(); // 내부 클래스로 연결하는 방법 (객체를 만들어서)
		b1.addActionListener(ah);
		b2.addActionListener(ah);
		b3.addActionListener(ah);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PannelTest2();
	}

	// 내부 클래스
	class ActionH implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if (str.equals("버튼1")) {
				getContentPane().setBackground(Color.YELLOW);
			} else if (str.equals("버튼2")) {
				getContentPane().setBackground(Color.PINK);
			} else {
				getContentPane().setBackground(Color.RED);
			}

		}

	}// ActionH

}// PannelTest2
