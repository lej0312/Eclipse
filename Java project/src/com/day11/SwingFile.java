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
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingFile extends JFrame implements ActionListener {
	private JTextField tf;
	private JTextArea ta;
	public SwingFile() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1=new JButton("읽기");
		JButton btn2=new JButton("쓰기");
		tf=new JTextField(20);
		ta=new JTextArea(20, 40);
		JScrollPane jsp=new JScrollPane();
		jsp.setViewportView(ta);
		
		add(tf);
		add(btn1);
		add(btn2);
		add(jsp);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingFile();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		if(str.equals("읽기")) { // src\\com\\day11\\CalTest.java
			try {
				ta.setText("");
				Scanner sc=new Scanner(new File(tf.getText()));
				while(sc.hasNext()) {
					ta.append(sc.nextLine()+"\n"); //콘솔이 아니라 textarea에
				}
				sc.close();
			} catch (FileNotFoundException e1) {
				ta.setText("파일 없음");
			}
		}else { //쓰기(저장)
			try {
				FileWriter fw=new FileWriter(tf.getText());
				fw.write(ta.getText());
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}

}
