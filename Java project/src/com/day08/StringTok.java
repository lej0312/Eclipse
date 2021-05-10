package com.day08;

import java.util.StringTokenizer;

public class StringTok {

	public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("ȫ�浿,��ȭ/ȫ��/����/���ΰ�",",/");
	System.out.println(st.countTokens()); //5
	int len=st.countTokens();
	// ȫ�浿 ��ȭ ȫ�� ���� ���ΰ�
//	for(int i=0;i<len;i++) { //i=0 i<5
//		System.out.println("count:"+st.countTokens());
//		System.out.println(st.nextToken()); //ȫ�浿
//	}
	
	while(st.hasMoreTokens()) {
		System.out.println("count:"+st.countTokens());
		System.out.println(st.nextToken());
	}
	String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
	//stringTokenizer�� �̿��ؼ� 16���� 8���� 2���� ���
	StringTokenizer stk=new StringTokenizer(tmp);
	String hex="";
	String oct="";
	String bin="";
	while(stk.hasMoreTokens()) {
		//String value=stk.nextToken();//1
		int value=Integer.parseInt(stk.nextToken());
		hex += Integer.toString(value)+" ";
		oct += Integer.toOctalString(value)+" ";
		bin += Integer.toBinaryString(value)+" ";
	}
		System.out.println("16����:"+hex);
		System.out.println("2����:"+bin);
		System.out.println("8����:"+oct);
		
		
	}
	
	
	
	

}

