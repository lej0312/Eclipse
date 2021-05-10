package com.day10;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		while (true) {
			try {
				int i = System.in.read();
				if (i == -1)
					break;
				System.out.print((char) i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


/*단방향
Input(입력)      Output(출력)
스트림기반========>Stream(바이트 흐름)

문자기반
reder           
표준입력-console
System.in

표준출력-모니터
System.out
 */
