package com.day13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Color;

public class Test2 extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
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
	public Test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("\uCCAB\uBC88\uC9F8", null, getPanel(), null);
			tabbedPane.setBackgroundAt(0, Color.RED);
			tabbedPane.addTab("New tab2", null, getPanel_1(), null);
			tabbedPane.addTab("New tab3", null, getPanel_2(), null);
			tabbedPane.addTab("New tab4", null, getPanel_3(), null);
		}
		return tabbedPane;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getBtnNewButton());
		}
		return panel;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getComboBox());
		}
		return panel_1;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getTf());
		}
		return panel_2;
	}

	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
		}
		return panel_3;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText("µÉ±î?");
					tabbedPane.setSelectedIndex(2);
				}

			});
			btnNewButton.setBounds(88, 77, 97, 23);
		}
		return btnNewButton;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(141, 73, 30, 21);
		}
		return comboBox;
	}

	private JTextField getTf() {
		if (tf == null) {
			tf = new JTextField();
			tf.setBounds(126, 92, 116, 21);
			tf.setColumns(10);
		}
		return tf;
	}
}
