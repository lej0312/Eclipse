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
	private HashMap<String,Integer> hm = new HashMap<>();  //이름, 잔액
	private String name;
	private File dir, file;
	private List list;

	public Bank() {
		setTitle("BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));  //1행2열
		//왼쪽 화면
		JPanel p1 = new JPanel();  //이름 있는 라인(1번째)
		p1.add(new JLabel("이름"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName) ;
		
		JButton newBtn = new JButton("계좌생성"); //2번째 라인
		
		JPanel p2 = new JPanel(); //잔액 있는 라인(3번째 라인)
		p2.add(new JLabel("잔액"));
		JTextField tfBalance = new JTextField(15);
		tfBalance.setEditable(false);
		p2.add(tfBalance);
		
		
		JPanel p3 = new JPanel(); //입출금 돈 입력 라인(4번째 라인)
		JTextField tfMoney = new JTextField(15);
		p3.add(tfMoney);
		p3.add(new JLabel("원"));
		
		JPanel p4 =new JPanel();// 입금, 출금 버튼 있는 라인(5번째 라인)
		JButton inputBtn = new JButton("입금");
		JButton outBtn = new JButton("출금");
		JButton fileBtn = new JButton("파일로 저장");
		p4.add(inputBtn);
		p4.add(outBtn);
		p4.add(fileBtn);
		
		JPanel leftPannel = new JPanel();  //JPanel에 기본 레이아웃은 FlowLayout
		leftPannel.add(p1);
		leftPannel.add(newBtn);
		leftPannel.add(p2);
		leftPannel.add(p3);
		leftPannel.add(p4);
		
		// 오른쪽 화면
		 list = new List();
		
		add(leftPannel);
		add(list);
		//파일로 저장(맵==>파일)
		fileBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				       try {
						FileWriter fw = new FileWriter(file);
						Set<String> set = hm.keySet();
						Iterator<String> it = set.iterator();
						while(it.hasNext()) {
							String name = it.next(); // 이름
							fw.write(name +" ");  //이름  내보내기
							fw.write(hm.get(name)+"\n"); // 잔액 내보내기
						}
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
			}
		});
		
		//계좌생성  => 리스트에 추가, 맵에 추가
		newBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfName.getText().isEmpty()) return; //공백넣으면 종료
				list.add(tfName.getText().trim());  //리스트에 추가 trim()은  공백제거
				hm.put(tfName.getText().trim(), 0);   //맵 추가
				tfName.setText("");
			}
		});
		//입금버튼
		inputBtn.addActionListener(new ActionListener() {
			/*
			 * 1. 리스트에 선택된 계좌 잔액에 입금한 금액을 더해서
			 *  2. 잔액을 수정하고 맵에 추가
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//리스트에서 선택된 계좌
					 name =list.getSelectedItem().trim();
					//입금금액
					int money =Integer.parseInt(tfMoney.getText());   
					//잔액 = 원래잔액 + 입금 돈
					int balance = hm.get(name) + money;
					//잔액표시
					tfBalance.setText(balance+"");
					//맵도 변경
					hm.put(name, balance);
					tfMoney.setText("");  //입금금액 지우기
				}catch(NumberFormatException n) {
					new MessageBox("입력오류!!!", "숫자를 입력하세요");
				}catch(NullPointerException n1) {
					new MessageBox("오류!!!", "계좌를 선택하세요");
				}
			   
			}
		});
		
		//출금버튼
		outBtn.addActionListener(new ActionListener() {
			/*
			 * 1. 리스트에 선택된 계좌 잔액에 출금할 금액을 빼서
			 *  2. 잔액을 수정하고 맵에 변경
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					name =list.getSelectedItem().trim();
					int money =Integer.parseInt(tfMoney.getText());  // 
					//잔액 = 원래잔액 + 출금 돈
					int balance = hm.get(name) - money;
					tfMoney.setText("");  //출금금액 지우기
					if(balance<0) {
						new MessageBox("잔액부족!!", name + " 님의 잔액이 부족합니다.");
						//System.out.println("잔액이 부족합니다.");
						return;
					}
					tfBalance.setText(balance+"");
					hm.put(name, balance);
				}catch(NumberFormatException n) {
					new MessageBox("출금오류!!!", "숫자를 입력하세요");
				}catch(NullPointerException n1) {
					new MessageBox("오류!!!", "출금계좌를 선택하세요");
				
				}
			
			}
		});
		
		//리스트를 클릭할 때 발생하는 이벤트
		list.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
			  //이름, 잔액 넣기
				 name = list.getSelectedItem().trim();
				tfName.setText(name);//이름
				tfBalance.setText(hm.get(name)+""); //잔액
			}
		});
		setSize(500, 300);
		setVisible(true);
		load() ; // 파일로 부터 읽어와서 맵에 추가
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
					String name = sc.next().trim();// 이름
					int balance = sc.nextInt(); // 잔액
				//	System.out.println("name :"+name.length());
				//	System.out.println("balance : " + balance);
					hm.put(name, balance); //맵에 추가
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
