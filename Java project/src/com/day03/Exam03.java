package com.day03;

public class Exam03 {

	public static void main(String[] args) {
		//int�� 5���� ������ �迭
		int[] arr=new int[5]; //5���� int�� ������ �迭 arr ����
			System.out.println("arr:"+arr);//�迭�� �ּҰ��� ����
			arr[3]=100;
				for(int i=0;i<5;i++) {
					System.out.println(arr[i]);//arr[0] arr[1] arr[2] arr[3] arr[4]
				}
				//arr[5]=200; 4������ ������ ������
				
		//ũ�Ⱑ 5�� �迭 tmp�� �����
		//tmp ���� 1 2 3 4 5
		int[] tmp=new int[5];
//		tmp[0]=1;
//		tmp[1]=2;
//		tmp[2]=3;
//		tmp[3]=4;
//		tmp[4]=5;
		for(int i=0; i<tmp.length;i++) {
			tmp[i]=i+1;
		}
		for(int i=0; i<tmp.length;i++) {
			System.out.println(tmp[i]);
		}
		System.out.println("===========");
		//���� 100 200 300�� ������ �迭ũ�Ⱑ 3�� str ����
		int[]str={100,200,300};//ũ�Ⱑ 3�� �迭
		// str[3]=400; �����߻� -> 3�� �ڸ��� �̹� 300�� �־?
		
//		int[]str=new int[3];
//		str[0]=100;
//		str[1]=200;
//		str[2]=300;
		
		String[] st= {"one","two","three","four"};//���ڿ� �迭
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		
		
				
	}

}
