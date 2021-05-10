package com.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("src\\com\\day10\\Gugudan.java");
			int i;
			while ((i = fis.read()) != -1) { //-1은 파일의 끝
				System.out.println((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
