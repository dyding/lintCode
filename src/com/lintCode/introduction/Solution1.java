package com.lintCode.introduction;

import java.util.Scanner;

/**
 * ��תһ��ֻ��3λ�������� ע������ ����Լ�������һ����һ��ֻ����λ��������������������ڵ���100��С��1000�� ������
 * 123��ת����321��900��ת����9
 * 
 * @author Rick
 *
 */
public class Solution1 {

	public int reverseInteger(int number) {
		int c = number / 1 % 10; // ��λ��
		int b = number / 10 % 10; // ʮλ��
		int a = number / 100 % 10; // ��λ��

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
