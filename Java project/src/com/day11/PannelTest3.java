package com.day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelTest3 extends JFrame {

	public PannelTest3() {
		setTitle("���� Ŭ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLACK);
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.GRAY);
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.DARK_GRAY);
			}
		});
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PannelTest3();
	}

}// PannelTest3