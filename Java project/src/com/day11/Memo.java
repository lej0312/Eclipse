package com.day11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {
	private JTextArea ta;
	private String fileName;

	public Memo(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenu mfile = new JMenu("����");

		JMenuItem mOpen = new JMenuItem("����");
		JMenuItem mNew = new JMenuItem("�� ����");
		JMenuItem mSave = new JMenuItem("����");
		JMenuItem mSaveAs = new JMenuItem("�ٸ� �̸����� ����");
		JMenuItem mExit = new JMenuItem("������");

		mfile.add(mOpen);
		mfile.add(mNew);
		mfile.add(mSave);
		mfile.add(mSaveAs);
		mfile.addSeparator();
		mfile.add(mExit);

		JMenuBar mb = new JMenuBar();
		mb.add(mfile);

		setJMenuBar(mb); // JFrame�� �ֱ�
		ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp);

		// ������
		mNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				setTitle("�������");
			}
		});

		// ����
		mOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if (fc.showOpenDialog(Memo.this) == JFileChooser.CANCEL_OPTION)
					return;
				File f = fc.getSelectedFile();
				fileName = f.getPath();
				setTitle(f.getName());
				fileRead(fileName);
			}
		});

		// ����
		mSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (getTitle().equals("�������")) {
//					JFileChooser fc = new JFileChooser();
//					if (fc.showSaveDialog(Memo.this) == JFileChooser.CANCEL_OPTION)
//						return;
//					File f = fc.getSelectedFile();
//					fileName = f.getPath();
//					fileSave(fileName);
					mSaveAs.doClick();
				} else {
					fileSave(fileName);

				}

			}
		});

		// �ٸ� �̸����� ����
		mSaveAs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				if (fc.showSaveDialog(Memo.this) == JFileChooser.CANCEL_OPTION)
					return;
				File f = fc.getSelectedFile();
				fileName = f.getPath();
				setTitle(f.getName());
				fileSave(fileName);

			}
		});

		// ������
		mExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setSize(500, 400);
		setVisible(true);
	}

	// ���� ����
	private void fileSave(String fileName) {
		try {
			PrintStream ps = new PrintStream(fileName);
			ps.println(ta.getText());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ���� �б�
	private void fileRead(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			StringWriter sw = new StringWriter();
			while (true) {
				int ch = fr.read(); // ������ ���� -1 ����
				if (ch == -1)
					break;
				sw.write(ch);
			}
			ta.setText(sw.toString());
			sw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Memo("�������");

	}

}
