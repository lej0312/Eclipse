package com.day06;

public class ArrayTest {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5}; //1���� �迭
		int[]b= {6,7,8,9,10};
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+"\t");
		}
		System.out.println();
		System.out.println("=======");
		
		int[][]arr= {{1,2,3,4,5},{6,7,8,9,10}}; //2�� 5�� ���� 1���� �迭 �ΰ��� 2���� �迭�� ǥ���Ѱ�
		for(int i=0;i<arr.length;i++) {//��
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[0][4]:"+arr[0][4]); //5
		System.out.println("arr[1][3]:"+arr[1][3]); //8
		int[][]arr2=new int[2][3];
	}

}
