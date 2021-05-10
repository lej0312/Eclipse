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


/*�ܹ���
Input(�Է�)      Output(���)
��Ʈ�����========>Stream(����Ʈ �帧)

���ڱ��
reder           
ǥ���Է�-console
System.in

ǥ�����-�����
System.out
 */
