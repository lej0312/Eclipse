package com.day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest2 extends JFrame {

	public PannelTest2() {
		setTitle("���� Ŭ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		add(b1);
		add(b2);
		add(b3);
		ActionH ah = new ActionH(); // ���� Ŭ������ �����ϴ� ��� (��ü�� ����)
		b1.addActionListener(ah);
		b2.addActionListener(ah);
		b3.addActionListener(ah);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PannelTest2();
	}

	// ���� Ŭ����
	class ActionH implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if (str.equals("��ư1")) {
				getContentPane().setBackground(Color.YELLOW);
			} else if (str.equals("��ư2")) {
				getContentPane().setBackground(Color.PINK);
			} else {
				getContentPane().setBackground(Color.RED);
			}

		}

	}// ActionH

}// PannelTest2
