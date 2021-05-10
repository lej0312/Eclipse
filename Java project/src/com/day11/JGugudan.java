package com.day11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener {
	private JTextField tf;
	private JTextArea ta;

	public JGugudan() {
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		tf = new JTextField(15); // ��������� ����
		JButton btn = new JButton("����");
		ta = new JTextArea(10, 15); // ��������� ����
		JScrollPane jsp = new JScrollPane(ta);
		btn.addActionListener(this); // ����
		add(tf);
		add(btn);
		add(jsp);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JGugudan();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println(tf.getText());
		ta.setText("");
		int dan = Integer.parseInt(tf.getText());
		for (int i = 1; i < 10; i++) {
			// System.out.println(dan+"*"+i+"="+dan*i);
			ta.append(dan + "*" + i + "=" + dan * i + "\n"); // append ������
		}

	}

}
