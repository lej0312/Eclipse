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
		// 왼쪽화면

		// 첫번째 라인
		JPanel p1 = new JPanel();
		p1.add(new JLabel("이름"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName);

		// 두번째 라인
		JPanel p2 = new JPanel();
		p2.add(new JLabel("키"));
		JTextField tfHeight = new JTextField(15);
		p2.add(tfHeight);

		// 세번째 라인
		JPanel p3 = new JPanel();
		p3.add(new JLabel("몸무게"));
		JTextField tfWeight = new JTextField(15);
		p3.add(tfWeight);

		// 네번째 라인
		JPanel p4 = new JPanel();
		JComboBox<String> cb = new JComboBox<>();
		cb.addItem("종목");
		cb.addItem("축구");
		cb.addItem("농구");
		cb.addItem("야구");
		cb.addItem("기타");

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

		// 다섯번째 라인
		JPanel p5 = new JPanel();
		JButton btnInsert = new JButton("추가");
		JButton btnView = new JButton("보기");
		// 추가
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				int height = Integer.parseInt(tfHeight.getText());
				// double height= Double.parseDouble(tfHeight.getText());
				int weight = Integer.parseInt(tfWeight.getText());
				String kind = (String) cb.getSelectedItem();
				Player p = new Player(name, height, weight, kind);
				dba.playerInsert(p); // 추가 insert ***인자값 주는 것
				btnView.doClick();

			}
		});
		// 오른쪽화면
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		// 보기
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				ArrayList<Player> arr = dba.playerView(); // 전체보기 select ***리턴값 받아오는 것
				// System.out.println(arr.size());
				for (Player p : arr) {
					ta.append("번호 : " + p.getNum() + "\n");
					ta.append("이름 : " + p.getName() + "\n");
					ta.append("키 : " + p.getHeight() + "\n");
					ta.append("몸무게 : " + p.getWeight() + "\n");
					ta.append("종목 : " + p.getKind() + "\n\n");

				}

			}
		});
		p5.add(btnInsert);
		p5.add(btnView);

		// JFrame에 왼쪽 , 오른쪽 화면 넣기
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
