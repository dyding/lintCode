package com.lintCode.introduction;
/**
 * 小写字母转成大写字母
 * @author Rick
 *
 */
public class Solution2 {

	public char lowercaseToUppercase(char character) {
		// write your code here
		return (char)(character + ('A' - 'a'));
	}

	public static void main(String[] args){
		System.out.println(new Solution2().lowercaseToUppercase('v'));
	}
	
}
