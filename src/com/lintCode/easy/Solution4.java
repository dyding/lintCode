package com.lintCode.easy;

/**
 * 删除链表中的所有等于给定值的元素
 * @author Rick
 *
 */
public class Solution4 {
	
	
	
	//方法一：创建辅助节点
	public ListNode removeElements(ListNode head, int val) {

		ListNode root = new ListNode(1);
		root.next = head;
		ListNode prev = root;
		while(prev.next != null){
			if(prev.next.val == val){
				prev.next = prev.next.next;
			}else{
				prev = prev.next;
			}
		}
		return root.next;
	}
	
	//方法二：
	public ListNode removeElements2(ListNode head, int val) {
		if(null == head){
			return null;
		}
		ListNode firstNode = head;
		ListNode lastNode = head.next;
		//从第二个元素考虑，凡是等于给定值的节点，全都删除
		while(lastNode != null){
			if(lastNode.val == val){
				firstNode.next = lastNode.next;
				lastNode = firstNode.next;
			}else if(lastNode.val != val){
				firstNode = firstNode.next;
				lastNode = lastNode.next;
			}
		}
		//考虑第一个元素是否等于给定值
		if(head.val == val){
			head = head.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
		//ListNode node2 = new ListNode(1);
		//node1.next = node2;
		new Solution4().removeElements(node1, 1);
	}
	
	
}




