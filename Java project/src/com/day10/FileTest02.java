package com.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("src\\com\\day10\\ExceptionTest01.java");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
