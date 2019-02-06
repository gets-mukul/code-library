
/*Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
4.4
this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
node never differ by more than one.*/
package com.dataStructure.java;

public class CheckBalance {
	public static int checkHeight(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return (Math.max(checkHeight(node.left), checkHeight(node.right)) + 1);
	
	}
	
	public static boolean isBalanced(TreeNode node) {
		if(node == null) {
			return true;
		}
		
		int lh,rh;
		
		lh = checkHeight(node.left);
		rh = checkHeight(node.right);
		
		if(Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);

		root.right = new TreeNode(3);
		root.left = new TreeNode(2);

		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);

		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(4);
		
		System.out.println(isBalanced(root));
		

	}

}
