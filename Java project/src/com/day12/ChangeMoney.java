package com.day12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.day11.MessageBox;

public class ChangeMoney extends JFrame {
	private int[] unit= {50000,10000,1000,500,100,50,10,1};
	private String[] text= {"������","����","õ��","�����","���ʿ�","�ʿ�","�Ͽ�"};
	private JTextField[] tf=new JTextField[8];
	private JCheckBox[] cb=new JCheckBox[7];
	
	
	public ChangeMoney() {
		setTitle("ChangeMoney");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); //null �Է�-> ���� ��ġ�� ����
		getContentPane().setBackground(Color.PINK);
		//�ݾ�
		JLabel la=new JLabel("�ݾ�");
		la.setSize(50, 20);
		la.setLocation(20, 20);
		add(la);
		
		JTextField won=new JTextField(30);
		won.setSize(100, 20);
		won.setLocation(100, 20);
		add(won);
		
		//��� ��ư
		JButton btn=new JButton("���");
		btn.setSize(70, 20);
		btn.setLocation(210, 20);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int money = Integer.parseInt(won.getText()); // eg.62345
					for (int i = 0; i < text.length-1; i++) {//�������� for�� ���� �ʿ� ���� txt.length-1
						if (cb[i].isSelected() == false) { // üũ�ڽ� üũ �ȵ�
							tf[i].setText("0");
							continue;
						} // if
						int result = money / unit[i]; // 62345/50000=1 12345/10000=1 2345/1000=2
						tf[i].setText(result + "");
						money = money % unit[i]; // 12345 2345
					} // for
					tf[text.length - 1].setText(money + ""); //������ ó��
				} catch (NumberFormatException n) {
					new MessageBox("����", "���ڸ� �Է��ϼ���");
				}
			}
		});
		add(btn);
		
		//�׼��� for
		for(int i=0; i<text.length; i++) {
			//text �迭
			la=new JLabel(text[i]);
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(50, 50+i*20);
			add(la);//text �迭 (���� ���)
			
			//JTextField
			tf[i]=new JTextField();
			tf[i].setEditable(false); //�����Ұ�
			tf[i].setSize(70,20);
			tf[i].setLocation(120, 50+i*20);
			add(tf[i]);
			
			//üũ�ڽ�
			if(i==text.length-1) break;
			cb[i]=new JCheckBox();
			cb[i].setBackground(Color.PINK);
			cb[i].setSelected(true);
			cb[i].setSize(30, 20);
			cb[i].setLocation(200, 50+i*20);
			cb[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					btn.setBackground(Color.YELLOW);
					//((JCheckBox)e.getSource()).setEnabled(false);
				}
			});
			add(cb[i]);
			
		}
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ChangeMoney();

	}

}
