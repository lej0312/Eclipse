package com.day11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingFile2 extends JFrame implements ActionListener {
	private JTextField tf;
	private JTextArea ta;
	private JButton btn1, btn2;

	public SwingFile2() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1 = new JButton("�б�");
		btn2 = new JButton("����");
		tf = new JTextField(20);
		tf.setEditable(false); // �����Ұ���
		ta = new JTextArea(20, 40);
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(ta);

		add(tf);
		add(btn1);
		add(btn2);
		add(jsp);
		btn1.addActionListener(this); // ����
		btn2.addActionListener(this); // ����

		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();// ��ü�� ����
		if (b == btn1) {
			JFileChooser fc = new JFileChooser();
			// int sh=fc.showOpenDialog(SwingFile2.this);
			if (fc.showOpenDialog(SwingFile2.this) == JFileChooser.CANCEL_OPTION)
				return;

			File f = fc.getSelectedFile();
			// System.out.println(f);
			tf.setText(f.getName());
			try {
				Scanner sc = new Scanner(f);
				while (sc.hasNext()) {
					ta.append(sc.nextLine() + "\n");
				}
			} catch (FileNotFoundException e1) {
				System.out.println("���Ͽ���");
			}
		} else {
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(SwingFile2.this) == JFileChooser.CANCEL_OPTION)
				return;
			File f = fc.getSelectedFile();
			tf.setText(f.getName());
			try {
				FileWriter fw = new FileWriter(f);
				fw.write(ta.getText());
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new SwingFile2();

	}
}

/*�̺�Ʈ �ڵ鷯 �ۼ� ���
1.this
2.����(inner) Ŭ����
3.�͸� Ŭ����-���� ���� ��
*/