package com.day11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalTest extends JFrame implements ActionListener {
	private JTextField tf1, tf2, result;

	public CalTest() {
		setTitle("사칙연산");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new JLabel("숫자 1"));
		tf1 = new JTextField(5);
		add(tf1);
		add(new JLabel("숫자 2"));
		tf2 = new JTextField(5);
		add(tf2);
		JButton btnSum = new JButton("+");
		JButton btnSub = new JButton("-");
		JButton btnMul = new JButton("*");
		JButton btnDiv = new JButton("/");
		add(btnSum);
		add(btnSub);
		add(btnMul);
		add(btnDiv);
		btnSum.addActionListener(this);
		btnSub.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
		add(new JLabel("결과"));
		result = new JTextField(10);
		add(result);
		setSize(250, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CalTest();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		try {
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			switch(str) {
			case "+": result.setText(num1 + num2 + ""); break;
			case "-": result.setText(num1 - num2 + ""); break;
			case "*": result.setText(num1 * num2 + ""); break;
			case "/": result.setText(num1 / num2 + ""); break;
			}
//			if (str.equals("+")) {
//				result.setText(num1 + num2 + "");
//			} else if (str.equals("-")) {
//				result.setText(num1 - num2 + "");
//			} else if (str.equals("*")) {
//				result.setText(num1 * num2 + "");
//			} else {
//				result.setText(String.valueOf(num1 / num2));
//				// result.setText(num1/num2+"");
//			}
		} catch (NumberFormatException n) {
			result.setText("숫자를 입력하세요.");
		} catch (ArithmeticException a) {
			result.setText("0으로 나눌 수 없음.");
		}

	}
}
