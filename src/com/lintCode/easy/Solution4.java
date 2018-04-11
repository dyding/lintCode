package com.lintCode.easy;

/**
 * ɾ�������е����е��ڸ���ֵ��Ԫ��
 * @author Rick
 *
 */
public class Solution4 {
	
	
	
	//����һ�����������ڵ�
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
	
	//��������
	public ListNode removeElements2(ListNode head, int val) {
		if(null == head){
			return null;
		}
		ListNode firstNode = head;
		ListNode lastNode = head.next;
		//�ӵڶ���Ԫ�ؿ��ǣ����ǵ��ڸ���ֵ�Ľڵ㣬ȫ��ɾ��
		while(lastNode != null){
			if(lastNode.val == val){
				firstNode.next = lastNode.next;
				lastNode = firstNode.next;
			}else if(lastNode.val != val){
				firstNode = firstNode.next;
				lastNode = lastNode.next;
			}
		}
		//���ǵ�һ��Ԫ���Ƿ���ڸ���ֵ
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




