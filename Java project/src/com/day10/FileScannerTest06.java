package com.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileScannerTest06 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src\\com\\day10\\Gugudan.java"));
		PrintStream ps = new PrintStream(new File("output.txt"));

		int cnt = 1;
		while (sc.hasNext()) {
			// System.out.println(cnt +":" + sc.nextLine());
			ps.println(cnt + ":" + sc.nextLine());
			cnt++;
		}
		sc.close();
	}

}
