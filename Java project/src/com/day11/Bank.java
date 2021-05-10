package com.day11;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bank  extends JFrame{
	private HashMap<String,Integer> hm = new HashMap<>();  //�̸�, �ܾ�
	private String name;
	private File dir, file;
	private List list;

	public Bank() {
		setTitle("BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));  //1��2��
		//���� ȭ��
		JPanel p1 = new JPanel();  //�̸� �ִ� ����(1��°)
		p1.add(new JLabel("�̸�"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName) ;
		
		JButton newBtn = new JButton("���»���"); //2��° ����
		
		JPanel p2 = new JPanel(); //�ܾ� �ִ� ����(3��° ����)
		p2.add(new JLabel("�ܾ�"));
		JTextField tfBalance = new JTextField(15);
		tfBalance.setEditable(false);
		p2.add(tfBalance);
		
		
		JPanel p3 = new JPanel(); //����� �� �Է� ����(4��° ����)
		JTextField tfMoney = new JTextField(15);
		p3.add(tfMoney);
		p3.add(new JLabel("��"));
		
		JPanel p4 =new JPanel();// �Ա�, ��� ��ư �ִ� ����(5��° ����)
		JButton inputBtn = new JButton("�Ա�");
		JButton outBtn = new JButton("���");
		JButton fileBtn = new JButton("���Ϸ� ����");
		p4.add(inputBtn);
		p4.add(outBtn);
		p4.add(fileBtn);
		
		JPanel leftPannel = new JPanel();  //JPanel�� �⺻ ���̾ƿ��� FlowLayout
		leftPannel.add(p1);
		leftPannel.add(newBtn);
		leftPannel.add(p2);
		leftPannel.add(p3);
		leftPannel.add(p4);
		
		// ������ ȭ��
		 list = new List();
		
		add(leftPannel);
		add(list);
		//���Ϸ� ����(��==>����)
		fileBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				       try {
						FileWriter fw = new FileWriter(file);
						Set<String> set = hm.keySet();
						Iterator<String> it = set.iterator();
						while(it.hasNext()) {
							String name = it.next(); // �̸�
							fw.write(name +" ");  //�̸�  ��������
							fw.write(hm.get(name)+"\n"); // �ܾ� ��������
						}
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
			}
		});
		
		//���»���  => ����Ʈ�� �߰�, �ʿ� �߰�
		newBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfName.getText().isEmpty()) return; //��������� ����
				list.add(tfName.getText().trim());  //����Ʈ�� �߰� trim()��  ��������
				hm.put(tfName.getText().trim(), 0);   //�� �߰�
				tfName.setText("");
			}
		});
		//�Աݹ�ư
		inputBtn.addActionListener(new ActionListener() {
			/*
			 * 1. ����Ʈ�� ���õ� ���� �ܾ׿� �Ա��� �ݾ��� ���ؼ�
			 *  2. �ܾ��� �����ϰ� �ʿ� �߰�
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//����Ʈ���� ���õ� ����
					 name =list.getSelectedItem().trim();
					//�Աݱݾ�
					int money =Integer.parseInt(tfMoney.getText());   
					//�ܾ� = �����ܾ� + �Ա� ��
					int balance = hm.get(name) + money;
					//�ܾ�ǥ��
					tfBalance.setText(balance+"");
					//�ʵ� ����
					hm.put(name, balance);
					tfMoney.setText("");  //�Աݱݾ� �����
				}catch(NumberFormatException n) {
					new MessageBox("�Է¿���!!!", "���ڸ� �Է��ϼ���");
				}catch(NullPointerException n1) {
					new MessageBox("����!!!", "���¸� �����ϼ���");
				}
			   
			}
		});
		
		//��ݹ�ư
		outBtn.addActionListener(new ActionListener() {
			/*
			 * 1. ����Ʈ�� ���õ� ���� �ܾ׿� ����� �ݾ��� ����
			 *  2. �ܾ��� �����ϰ� �ʿ� ����
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					name =list.getSelectedItem().trim();
					int money =Integer.parseInt(tfMoney.getText());  // 
					//�ܾ� = �����ܾ� + ��� ��
					int balance = hm.get(name) - money;
					tfMoney.setText("");  //��ݱݾ� �����
					if(balance<0) {
						new MessageBox("�ܾ׺���!!", name + " ���� �ܾ��� �����մϴ�.");
						//System.out.println("�ܾ��� �����մϴ�.");
						return;
					}
					tfBalance.setText(balance+"");
					hm.put(name, balance);
				}catch(NumberFormatException n) {
					new MessageBox("��ݿ���!!!", "���ڸ� �Է��ϼ���");
				}catch(NullPointerException n1) {
					new MessageBox("����!!!", "��ݰ��¸� �����ϼ���");
				
				}
			
			}
		});
		
		//����Ʈ�� Ŭ���� �� �߻��ϴ� �̺�Ʈ
		list.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			  //�̸�, �ܾ� �ֱ�
				 name = list.getSelectedItem().trim();
				tfName.setText(name);//�̸�
				tfBalance.setText(hm.get(name)+""); //�ܾ�
			}
		});
		setSize(500, 300);
		setVisible(true);
		load() ; // ���Ϸ� ���� �о�ͼ� �ʿ� �߰�
	}
	
     private void load() {
		hm.clear();
		dir = new File("src\\com\\day11");
		file = new File(dir, "mybank.txt");
		try {
				if(!file.exists()) {
					file.createNewFile();
					return;
				}
				Scanner sc = new Scanner(file);
				while(sc.hasNext()) {
					String name = sc.next().trim();// �̸�
					int balance = sc.nextInt(); // �ܾ�
				//	System.out.println("name :"+name.length());
				//	System.out.println("balance : " + balance);
					hm.put(name, balance); //�ʿ� �߰�
					list.add(name +"\n");
				}
				sc.close();
	 	} catch (IOException e) {
				e.printStackTrace();
		}
		
	
		
	}


	public static void main(String[] args) {
		 new Bank();

	}

}
