package com.lintCode.introduction;

import java.util.Scanner;

/**
 * 反转一个只有3位数的整数 注意事项 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。 举例：
 * 123反转后是321；900反转后是9
 * 
 * @author Rick
 *
 */
public class Solution1 {

	public int reverseInteger(int number) {
		int c = number / 1 % 10; // 个位数
		int b = number / 10 % 10; // 十位数
		int a = number / 100 % 10; // 百位数

		if (c == 0) {
			if (b == 0) {
				return a;
			} else if (b != 0) {
				return b * 10 + a;
			}
		} else if (c != 0) {
			return a + b * 10 + c * 100;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			Integer integer = scanner.nextInt();
			System.out.println(new Solution1().reverseInteger(integer));
		}
	}

}
