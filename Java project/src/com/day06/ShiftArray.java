package com.day06;

public class ShiftArray {
	public static void showArray(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//이동(shift)메소드
	public static void shiftArray(int[][]arr) {
		int[]tmp=arr[arr.length-1]; //tmp=arr[2] 7 8 9
		for(int i=arr.length-2; i>=0; i--) {//i=1 i=0
			arr[i+1]=arr[i]; //a[2]=a[1] a[1]=a[0]
		}
		arr[0]=tmp; //a[0]=tmp(7 8 9)
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};//3행 3열
		ShiftArray.showArray(arr);
		System.out.println("1차 이동...");
		ShiftArray.shiftArray(arr);
		ShiftArray.showArray(arr);
	}

}
