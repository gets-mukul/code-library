package com.dataStructure.java;

public class TreeNode {
	
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int info) {
		data = info;
		left = null;
		right = null;
	}
	
	// inorder traversal [LNR]
	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data+"->");
			inOrder(root.right);
		}
	}
	
	// preorder traversall [NLR]
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.print(root.data+"->");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	// postorder traversall [LRN]
		public void postorder(TreeNode root) {
			if(root != null) {
				preorder(root.left);
				preorder(root.right);
				System.out.print(root.data+"->");
			}
		}
	

	
}
