package com.day13;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlayerViewMain extends JFrame {
	PlayerDBA dba = new PlayerDBA();

	public PlayerViewMain() {
		setTitle(" PlayerView");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 2));
		// ����ȭ��

		// ù��° ����
		JPanel p1 = new JPanel();
		p1.add(new JLabel("�̸�"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName);

		// �ι�° ����
		JPanel p2 = new JPanel();
		p2.add(new JLabel("Ű"));
		JTextField tfHeight = new JTextField(15);
		p2.add(tfHeight);

		// ����° ����
		JPanel p3 = new JPanel();
		p3.add(new JLabel("������"));
		JTextField tfWeight = new JTextField(15);
		p3.add(tfWeight);

		// �׹�° ����
		JPanel p4 = new JPanel();
		JComboBox<String> cb = new JComboBox<>();
		cb.addItem("����");
		cb.addItem("�౸");
		cb.addItem("��");
		cb.addItem("�߱�");
		cb.addItem("��Ÿ");

		p4.add(cb);
		JTextField tfKind = new JTextField(10);
		tfKind.setEditable(false);
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String kind = (String) cb.getSelectedItem();
				tfKind.setText(kind);

			}
		});
		p4.add(tfKind);

		// �ټ���° ����
		JPanel p5 = new JPanel();
		JButton btnInsert = new JButton("�߰�");
		JButton btnView = new JButton("����");
		// �߰�
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				int height = Integer.parseInt(tfHeight.getText());
				// double height= Double.parseDouble(tfHeight.getText());
				int weight = Integer.parseInt(tfWeight.getText());
				String kind = (String) cb.getSelectedItem();
				Player p = new Player(name, height, weight, kind);
				dba.playerInsert(p); // �߰� insert ***���ڰ� �ִ� ��
				btnView.doClick();

			}
		});
		// ������ȭ��
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		// ����
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				ArrayList<Player> arr = dba.playerView(); // ��ü���� select ***���ϰ� �޾ƿ��� ��
				// System.out.println(arr.size());
				for (Player p : arr) {
					ta.append("��ȣ : " + p.getNum() + "\n");
					ta.append("�̸� : " + p.getName() + "\n");
					ta.append("Ű : " + p.getHeight() + "\n");
					ta.append("������ : " + p.getWeight() + "\n");
					ta.append("���� : " + p.getKind() + "\n\n");

				}

			}
		});
		p5.add(btnInsert);
		p5.add(btnView);

		// JFrame�� ���� , ������ ȭ�� �ֱ�
		JPanel leftP = new JPanel();
		leftP.add(p1);
		leftP.add(p2);
		leftP.add(p3);
		leftP.add(p4);
		leftP.add(p5);

		add(leftP);
		add(jsp);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new PlayerViewMain();

	}

}
