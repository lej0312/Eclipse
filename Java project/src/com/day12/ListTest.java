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
		setLayout(new BorderLayout()); // ��������
		// ����ȭ��
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout()); // ��������
		JTextField tf = new JTextField(15);
		JButton btn = new JButton("�߰�");
		JCheckBox cb = new JCheckBox("���߼���");
		p1.add(tf);
		p1.add(btn);
		p1.add(cb);
		// �Ʒ���ȭ��
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 2));
		List list = new List();
		JTextArea ta = new JTextArea();
		p2.add(list);
		p2.add(ta);

		// ��Ʈ�� ����, �Ʒ��� ȭ�� ���̱�
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
		// üũ�ڽ� �̺�Ʈ
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (cb.isSelected()) { // üũ�ڽ� ����
					list.setMultipleMode(true); // list�� ���߸���
				} else { // üũ�ڽ� ���� ����
					list.setMultipleMode(false); // list�� ���ϸ���
				}
			}
		});
		// ����Ʈ Ŭ�� �̺�Ʈ
		list.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.setText("");
				if (list.isMultipleMode()) { // ���߸��
					String[] arr = list.getSelectedItems();
					for (int i = 0; i < arr.length; i++) {
						ta.append(arr[i] + "\n");
					}
				} else { // ���ϸ��
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
