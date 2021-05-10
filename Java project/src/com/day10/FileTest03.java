package com.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest03 {

	public static void main(String[] args) throws IOException {
		FileInputStream fs 
		= new FileInputStream("src\\com\\day10\\SynchEx.java");
		FileOutputStream fos = new FileOutputStream("result.txt");
		
		int i ;
		while((i=fs.read())!=-1) {
			System.out.print((char)i);
			fos.write(i);
		}
		fs.close();
		fos.close();
	}
}
