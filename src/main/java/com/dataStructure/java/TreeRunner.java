package com.dataStructure.java;

public class TreeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);

		root.right = new TreeNode(3);
		root.left = new TreeNode(2);

		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);

		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(4);
		
/*
                              1
                             / \				
                            2   3
	                       / \ / \
                         7   65   4
*/	
			root.postorder(root);
		
		
	}

}
