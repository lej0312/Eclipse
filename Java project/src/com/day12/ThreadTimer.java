package com.day12;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimer extends JFrame {
	JLabel timerLabel;

	public ThreadTimer() {
		setTitle("timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		new ThreadTime().start(); // run() 실행
		add(timerLabel);

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreadTimer();

	}

	// 내부클래스
	class ThreadTime extends Thread {
		@Override
		public void run() {
			int n = 0;
			while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000); // 1000ms 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
