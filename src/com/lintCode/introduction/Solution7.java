package com.lintCode.introduction;

public class Solution7 {

	public void swapIntegers(int[] A, int index1, int index2) {
        // write your code here
		if( index1 > A.length || index2 > A.length){
			return;
		}
		
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
    }
	
}
