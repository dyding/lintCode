package com.lintCode.easy;

public class Solution5 {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 5;
		a[1] = 4;
		a[2] = 3;
		a[3] = 2;
		a[4] = 1;
		new Solution5().sortIntegers(a);
	}
	
	public void sortIntegers(int[] A) {
		// write your code here
		bubbleSort(A);
		System.out.println(times);
	}

	int times = 0;
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
			times ++;
		}
	}

}
