package com.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest05 {
//�� �پ� �о� ��ȣ �ٿ��� ����ϱ�
	public static void main(String[] args) throws IOException {
		BufferedReader br 
		= new BufferedReader(new FileReader("src\\com\\day10\\Gugudan.java"));
		String str;
		int cnt=1;
		while((str=br.readLine())!=null) {
			System.out.println(cnt+":"+str);
			cnt++;
		}
		br.close();
	}

}
