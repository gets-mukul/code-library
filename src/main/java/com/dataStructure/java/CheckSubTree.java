package com.dataStructure.java;

public class CheckSubTree {

	public static boolean subTree(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null) {
			return false;
		} else if (tree1.data == tree2.data && matchTree(tree1, tree2)) {
			return true;
		}
		return subTree(tree1.left, tree2) || subTree(tree1.right, tree2);
	}

	public static boolean matchTree(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		} else if (tree1 == null || tree2 == null) {
			return false;
		} else if (tree1.data != tree2.data) {
			return false;
		} else {
			return matchTree(tree1.left, tree2.left) && matchTree(tree1.right, tree2.right);
		}
	}

	public boolean containsTree(TreeNode tree1, TreeNode tree2) {
		if (tree2 == null) {
			return true;
		}
		return subTree(tree1, tree2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree1 = new TreeNode(10);

		tree1.right = new TreeNode(-3);
		tree1.right.right = new TreeNode(11);
		tree1.left = new TreeNode(5);
		tree1.left.right = new TreeNode(2);
		tree1.left.left = new TreeNode(3);
		tree1.left.right.right = new TreeNode(1);
		tree1.left.left.right = new TreeNode(-2);
		tree1.left.left.left = new TreeNode(3);

		TreeNode tree2 = new TreeNode(10);

		tree2.right = new TreeNode(-3);
		tree2.right.right = new TreeNode(11);
		tree2.left = new TreeNode(5);
		tree2.left.right = new TreeNode(2);
		tree2.left.left = new TreeNode(3);
		tree2.left.right.right = new TreeNode(1);
		tree2.left.left.right = new TreeNode(-2);
		tree2.left.left.left = new TreeNode(3);

		System.out.println(subTree(tree1, tree2));

	}

}
