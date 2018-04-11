package com.lintCode.easy;

/**
 * 二叉树找到最大值的节点：
 * 分别找出左右子树最大的节点，再和root比较
 * @author Rick
 *
 */
public class Solution8 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		TreeNode node = new Solution8().maxNode(node1);
		System.out.println(node.val);
		
	}
	
	public TreeNode maxNode(TreeNode root) {
		if(root == null){
			return null;
		}
		TreeNode leftMaxNode = root.left != null ? maxNode(root.left) : null;
		TreeNode rightMaxNode = root.right != null ? maxNode(root.right) : null;
		if(leftMaxNode != null && rightMaxNode != null){
			TreeNode tempNode = leftMaxNode.val > rightMaxNode.val ? leftMaxNode : rightMaxNode;
			return tempNode.val > root.val ? tempNode : root;
		}else if(leftMaxNode != null){
			return leftMaxNode.val > root.val ? leftMaxNode : root;
		}else if(rightMaxNode != null){
			return rightMaxNode.val > root.val ? rightMaxNode : root;
		}
		return root;
		
    }

	
	
	
}
