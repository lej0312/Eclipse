package com.day13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test3 extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JTextArea ta;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JLabel lblNewLabel_1;
	private JTextField tfHeight;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JComboBox cb;
	private JButton btnInsert;
	private JButton btnView;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
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
	public Test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getSplitPane(), BorderLayout.CENTER);
	}

	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setRightComponent(getScrollPane());
			splitPane.setLeftComponent(getPanel());
			splitPane.setDividerLocation(200);
		}
		return splitPane;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTa());
		}
		return scrollPane;
	}
	private JTextArea getTa() {
		if (ta == null) {
			ta = new JTextArea();
		}
		return ta;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTfName());
			panel.add(getLblNewLabel_1());
			panel.add(getTfHeight());
			panel.add(getLblNewLabel_2());
			panel.add(getTextField());
			panel.add(getCb());
			panel.add(getBtnInsert());
			panel.add(getBtnView());
			panel.add(getComboBox());
			panel.add(getComboBox_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC774\uB984");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setBounds(12, 41, 33, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(57, 38, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD0A4");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setBounds(12, 87, 30, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfHeight() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.setBounds(57, 84, 116, 21);
			tfHeight.setColumns(10);
		}
		return tfHeight;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBAB8\uBB34\uAC8C");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_2.setBounds(0, 144, 47, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(57, 141, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JComboBox getCb() {
		if (cb == null) {
			cb = new JComboBox();
			cb.setModel(new DefaultComboBoxModel(new String[] {"\uC57C\uAD6C", "\uCD95\uAD6C", "\uB18D\uAD6C", "\uAE30\uD0C0"}));
			cb.setBounds(32, 188, 86, 21);
		}
		return cb;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("\uCD94\uAC00");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			btnInsert.setBounds(12, 269, 76, 23);
		}
		return btnInsert;
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("\uBCF4\uAE30");
			btnView.setBounds(100, 269, 78, 23);
		}
		return btnView;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB538\uAE30", "\uC0AC\uACFC", "\uD3EC\uB3C4", "\uBC14\uB098\uB098"}));
			comboBox.setBounds(39, 325, 79, 21);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(39, 356, 79, 21);
			comboBox_1.addItem("자바");
			comboBox_1.addItem("오라클");
			comboBox_1.addItem("자바1");
			comboBox_1.addItem("자바2");
		}
		return comboBox_1;
	}
}
