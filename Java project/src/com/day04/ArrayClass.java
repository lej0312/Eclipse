package com.day04;

public class ArrayClass {
	
	//�հ� ���ϴ� �޼ҵ� => sum
	public void sum(int[] arr) {
		int hap=0;
		for(int i=0;i<arr.length;i++) {
			hap +=arr[i];
		}
		System.out.println("�հ�:"+hap);
	}

	//�ִ밪 ���ϴ� �޼ҵ� => max
	public int max(int[] arr) {//10,5,3,36,45,9
		int m=arr[0]; //m=10
		for (int i=1;i<arr.length;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
	
	//�ּҰ� ���ϴ� �޼ҵ� => min
	public int min(int[]arr) {//10,5,3,36,45,9
		int n=arr[0]; //n=10
		for(int i=1;i<arr.length;i++) {
			if(n>arr[i]) {
				n=arr[i]; //3
			}
		}
		return n;//3
	}
	public static void main(String[] args) {
		int[] arr= {10,5,3,36,45,9};
		ArrayClass ac=new ArrayClass();
		ac.sum(arr);
		System.out.println("�ִ밪:"+ac.max(arr));
		System.out.println("�ּҰ�:"+ac.min(arr));
	}

}
