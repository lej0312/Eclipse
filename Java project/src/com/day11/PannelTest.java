package com.day11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; //x->Ȯ���� �ǹ�

public class PannelTest extends JFrame implements ActionListener {

	public PannelTest() { // �����̳�..?
		// setTitle("��������");
		super("����������������"); // 11���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("��ư1"); // ������Ʈ
		JButton b2 = new JButton("��ư2"); // ��ư�� �������� ������ �ִ� ��-�̺�Ʈ
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		add(b1); // �θ�-Frame
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this); //this-�ڱ� �ڽ��� ��ü
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String[] args) {
		new PannelTest(); // �͸��� ��ü
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		//System.out.println(str+" �̺�Ʈ �߻�");
		if (str.equals("��ư1")) {
			System.out.println("��ư1 �̺�Ʈ �߻�");
			getContentPane().setBackground(Color.BLUE);
		} else if (str.equals("��ư2")) {
			System.out.println("��ư2 �̺�Ʈ �߻�");
			getContentPane().setBackground(Color.YELLOW);
		} else if (str.equals("��ư3")) {
			System.out.println("��ư3 �̺�Ʈ �߻�");
			getContentPane().setBackground(Color.DARK_GRAY);
		} else {
			System.out.println("��ư4 �̺�Ʈ �߻�");
			getContentPane().setBackground(Color.PINK);
		}
	}
}


/*
 * ���� 
 * GUI 
 * ������Ʈ 
 * ��ġ������(������Ʈ ��ġ-�����̳ʿ� ������Ʈ�� ����) 
 * �����̳�==>Frame JFrame
 * eg.1.JFrame:�⺻��ġ ����-BorderLayout(��, ��, ��, ��, ����) 
 * 2.FlowLayout:���ʴ�� ��ġ(��->��, ��->�Ʒ�)
 * 
 * �̺�Ʈ ó�� ���� eg.PannelTest 
 * 1.������Ʈ �ۼ� (Jbutton) 
 * 2.�̺�Ʈ �ڵ鷯 �ۼ� (�̺�Ʈ ó�� �޼ҵ�:actionPerformed) 
 * 3.1+2 ����
 */