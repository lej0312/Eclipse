package com.day08;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp="1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp����
		System.out.println("tmp ����:"+tmp.length());
		System.out.println("tmp ������ ����:"+tmp.charAt(tmp.length()-1));
		//������ ��
		String[]arr = tmp.split(" ");//�������� �����Ͽ� �迭�� ��´�
		System.out.println("arr ����:"+arr.length);
		System.out.println("������ ����:"+arr[arr.length-1]);
		//������ ��
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		//	sum += arr[i]; //����=>����
			sum += Integer.parseInt(arr[i]); 
		}
		System.out.println("���� �հ�:"+sum);	
		//sum�� 16������ ǥ��
		System.out.println("sum 16����:"+Integer.toHexString(sum)); //
		//16���� �빮�ڷ� ǥ��
		System.out.println("sum 16���� �빮��:"+Integer.toHexString(sum).toUpperCase());
		String hex="";
		String oct="";
		String bin="";
		//arr�� ���� 16,8,2 ���� ǥ���ϱ�
		for(int i=0;i<arr.length;i++) {
			int v=Integer.parseInt(arr[i]); //����->����
			hex +=Integer.toHexString(v)+" ";
			oct +=Integer.toOctalString(v)+" ";
			bin +=Integer.toBinaryString(v)+" ";
		}
		System.out.println("16����:"+hex); //16����
		System.out.println("8����:"+oct); //8����
		System.out.println("2����:"+bin); //2����
		//           012345678
		String test="abce test hi java";
		System.out.println(test.substring(3,8)); //���� ���� 3~8���� ��ġ
		System.out.println(test.substring(3));
		//substring ����Ͽ� java����
		int i=test.indexOf('j');
		System.out.println(test.substring(i,i+4));
		
	}

}
