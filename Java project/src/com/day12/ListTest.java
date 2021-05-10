package com.day12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListTest extends JFrame {
	public ListTest() {
		setTitle("List BoardLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // 생략가능
		// 위쪽화면
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout()); // 생략가능
		JTextField tf = new JTextField(15);
		JButton btn = new JButton("추가");
		JCheckBox cb = new JCheckBox("다중선택");
		p1.add(tf);
		p1.add(btn);
		p1.add(cb);
		// 아래쪽화면
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 2));
		List list = new List();
		JTextArea ta = new JTextArea();
		p2.add(list);
		p2.add(ta);

		// 루트에 위쪽, 아래쪽 화면 붙이기
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf.getText().isEmpty())
					return;
				list.add(tf.getText());
				tf.setText("");
				// btn.doClick();
			}
		});
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf.getText().isEmpty())
					return;
				list.add(tf.getText());
				tf.setText("");
			}
		});
		// 체크박스 이벤트
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (cb.isSelected()) { // 체크박스 선택
					list.setMultipleMode(true); // list를 다중모드로
				} else { // 체크박스 선택 해제
					list.setMultipleMode(false); // list를 단일모드로
				}
			}
		});
		// 리스트 클릭 이벤트
		list.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.setText("");
				if (list.isMultipleMode()) { // 다중모드
					String[] arr = list.getSelectedItems();
					for (int i = 0; i < arr.length; i++) {
						ta.append(arr[i] + "\n");
					}
				} else { // 단일모드
					ta.setText(list.getSelectedItem());
				}

			}
		});

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListTest();

	}

}
