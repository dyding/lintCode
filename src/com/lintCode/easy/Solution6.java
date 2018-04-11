package com.lintCode.easy;

public class Solution6 {
	
	public int countNodes(ListNode head) {
        int count = 0;
        while(head != null){
        	count ++;
        	head = head.next;
        }
        return count;
    }
	
	

}

