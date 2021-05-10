package com.day04;

public class ArrayClass2 {
	int[] arr;
	public ArrayClass2(int[] arr) {
		this.arr=arr;
	}
	
	//�հ� ���ϴ� �޼ҵ� => sum
	public void sum() {
		int hap=0;
		for(int i=0;i<arr.length;i++) {
			hap += arr[i];
		}
		System.out.println("�հ�:"+hap);
	}
	//�ִ밪 ���ϴ� �޼ҵ� => max
	public int max () { //10,5,3,36,45,9
		int m=arr[0]; //10
		for(int i=1;i<arr.length;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
	//�ּҰ� ���ϴ� �޼ҵ� => min
	public int min() {
		int m=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(m>arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] arr= {10,5,3,36,45,9};
		ArrayClass2 ac=new ArrayClass2(arr);
		ac.sum();
		System.out.println("�ִ밪:"+ac.max());
		System.out.println("�ּҰ�:"+ac.min());
	}

}
