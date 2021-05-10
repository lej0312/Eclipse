package com.day04;

public class ArrayClass2 {
	int[] arr;
	public ArrayClass2(int[] arr) {
		this.arr=arr;
	}
	
	//합계 구하는 메소드 => sum
	public void sum() {
		int hap=0;
		for(int i=0;i<arr.length;i++) {
			hap += arr[i];
		}
		System.out.println("합계:"+hap);
	}
	//최대값 구하는 메소드 => max
	public int max () { //10,5,3,36,45,9
		int m=arr[0]; //10
		for(int i=1;i<arr.length;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
	//최소값 구하는 메소드 => min
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
		System.out.println("최대값:"+ac.max());
		System.out.println("최소값:"+ac.min());
	}

}
