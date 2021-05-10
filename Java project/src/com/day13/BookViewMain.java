package com.day13; //276줄 아래로 선생님이 추가하신것

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BookViewMain extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JSplitPane splitPane_1;
	private JSplitPane splitPane_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTextArea taView;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfTitle;
	private JTextField tfWriter;
	private JTextField tfIndate;
	private JTextField tfOutdate;
	private JTextField tfPrice;
	private JTextField tfGubun;
	private JButton btnInsert;
	private JButton btnView;
	private JPanel panel_1;
	private JComboBox combo;
	private JTextField tfSearch;
	private JButton btnSearch;
	BookDBA dba = new BookDBA();
	private ArrayList<Book> arr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookViewMain frame = new BookViewMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getSplitPane(), BorderLayout.CENTER);
	}

	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setLeftComponent(getSplitPane_1());
			splitPane.setRightComponent(getSplitPane_2());
			splitPane.setDividerLocation(200);
		}
		return splitPane;
	}
	private JSplitPane getSplitPane_1() {
		if (splitPane_1 == null) {
			splitPane_1 = new JSplitPane();
			splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_1.setLeftComponent(getScrollPane());
			splitPane_1.setRightComponent(getPanel());
			splitPane_1.setDividerLocation(180);
		}
		return splitPane_1;
	}
	private JSplitPane getSplitPane_2() {
		if (splitPane_2 == null) {
			splitPane_2 = new JSplitPane();
			splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane_2.setLeftComponent(getScrollPane_1());
			splitPane_2.setRightComponent(getPanel_1());
			splitPane_2.setDividerLocation(300);
		}
		return splitPane_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					taView.setText("");
					int i = table.getSelectedRow(); //테이블 선택된 행이  ArrayList의 위치
					taView.append("번호 :  "+ arr.get(i).getNum()+"\n");
					taView.append("제목 :  "+ arr.get(i).getTitle()+"\n");
					taView.append("저자 :  "+ arr.get(i).getWriter()+"\n");
					taView.append("입고일 :  "+ arr.get(i).getIndate()+"\n");
					taView.append("출고일 :  "+ arr.get(i).getOutdate()+"\n");
					taView.append("가격 :  "+ arr.get(i).getPrice()+"\n");
					taView.append("구분 :  "+ arr.get(i).getGubun());
					
				}
			});
	
			String[] cols = {"TITLE","WRITER","OUTDATE","PRICE"};
			DefaultTableModel dt = new DefaultTableModel(cols,0);
			table.setModel(dt);
			
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTaView());
		}
		return scrollPane_1;
	}
	private JTextArea getTaView() {
		if (taView == null) {
			taView = new JTextArea();
		}
		return taView;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_5());
			panel.add(getTfTitle());
			panel.add(getTfWriter());
			panel.add(getTfIndate());
			panel.add(getTfOutdate());
			panel.add(getTfPrice());
			panel.add(getTfGubun());
			panel.add(getBtnInsert());
			panel.add(getBtnView());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uBAA9");
			lblNewLabel.setBounds(0, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC800\uC790");
			lblNewLabel_1.setBounds(0, 46, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC785\uACE0\uB0A0\uC9DC");
			lblNewLabel_2.setBounds(0, 81, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD9C\uACE0\uB0A0\uC9DC");
			lblNewLabel_3.setBounds(0, 116, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uAC00\uACA9");
			lblNewLabel_4.setBounds(0, 146, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uAD6C\uBD84");
			lblNewLabel_5.setBounds(0, 171, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfTitle() {
		if (tfTitle == null) {
			tfTitle = new JTextField();
			tfTitle.setBounds(69, 10, 116, 21);
			tfTitle.setColumns(10);
		}
		return tfTitle;
	}
	private JTextField getTfWriter() {
		if (tfWriter == null) {
			tfWriter = new JTextField();
			tfWriter.setBounds(69, 43, 116, 21);
			tfWriter.setColumns(10);
		}
		return tfWriter;
	}
	private JTextField getTfIndate() {
		if (tfIndate == null) {
			tfIndate = new JTextField();
			tfIndate.setBounds(69, 78, 116, 21);
			tfIndate.setColumns(10);
		}
		return tfIndate;
	}
	private JTextField getTfOutdate() {
		if (tfOutdate == null) {
			tfOutdate = new JTextField();
			tfOutdate.setBounds(69, 116, 116, 21);
			tfOutdate.setColumns(10);
		}
		return tfOutdate;
	}
	private JTextField getTfPrice() {
		if (tfPrice == null) {
			tfPrice = new JTextField();
			tfPrice.setBounds(69, 143, 116, 21);
			tfPrice.setColumns(10);
		}
		return tfPrice;
	}
	private JTextField getTfGubun() {
		if (tfGubun == null) {
			tfGubun = new JTextField();
			tfGubun.setBounds(69, 171, 116, 21);
			tfGubun.setColumns(10);
		}
		return tfGubun;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("\uCD94\uAC00");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String title = tfTitle.getText();
					String writer = tfWriter.getText();
					String indate = tfIndate.getText();
					String outdate = tfOutdate.getText();
					int price =Integer.parseInt(tfPrice.getText());
					String gubun = tfGubun.getText();
					
					Book book
					  = new Book(title, writer,indate, outdate,price,gubun);
					 
					dba.bookInsert(book);
					
				}
			});
			btnInsert.setBounds(0, 216, 72, 23);
		}
		return btnInsert;
	}
	//전체보기 버튼 
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("\uC804\uCCB4\uBCF4\uAE30");
			btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				  arr =dba.bookView();
				 //table에 출력	
				 String[] cols = {"TITLE","WRITER","OUTDATE","PRICE"};
					DefaultTableModel dt = new DefaultTableModel(cols,arr.size());
					table.setModel(dt);
				 for(int i=0; i<arr.size();i++) {
					 dt.setValueAt(arr.get(i).getTitle(), i, 0);
					 dt.setValueAt(arr.get(i).getWriter(),i,1);
					 dt.setValueAt(arr.get(i).getOutdate(), i, 2);
					 dt.setValueAt(arr.get(i).getPrice(), i, 3);
				 }
				}
			});
			btnView.setBounds(88, 216, 97, 23);
		}
		return btnView;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getCombo());
			panel_1.add(getTfSearch());
			panel_1.add(getBtnSearch());
		}
		return panel_1;
	}
	private JComboBox getCombo() {
		if (combo == null) {
			combo = new JComboBox();
			combo.setModel(new DefaultComboBoxModel(new String[] {"\uC81C\uBAA9", "\uAD6C\uBD84"}));
			combo.setBounds(12, 51, 61, 21);
		}
		return combo;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(80, 51, 138, 21);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uAC80\uC0C9");
			btnSearch.setBounds(137, 98, 97, 23);
		}
		return btnSearch;
	}
}

