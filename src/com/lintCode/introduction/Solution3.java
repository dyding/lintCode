package com.lintCode.introduction;

/**
 * ì³²¨ÄÇÆõÊýÁÐ
 * 
 * @author Rick
 *
 */
public class Solution3 {

	// µÝ¹é
	public int fibonacci(int n) {
		// write your code here
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// ·ÇµÝ¹é
	public int fibonacci1(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println(new Solution3().fibonacci1(41));
	}

}
