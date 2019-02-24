/*Implement a function to check if a binary tree is a binary search tree*/

package com.dataStructure.java;

import java.util.ArrayList;

public class VaidateBST {

	public static ArrayList<Integer> checkForBST(TreeNode node, ArrayList<Integer> array) {
		if (node != null) {
			checkForBST(node.left, array);
			array.add(node.data);
			checkForBST(node.right, array);
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(10);

		root.right = new TreeNode(15);
		root.left = new TreeNode(5);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(9);

		root.right.left = new TreeNode(14);
		root.right.right = new TreeNode(19);

		ArrayList<Integer> array = new ArrayList<Integer>();
		checkForBST(root, array);
		System.out.println(array);

		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i) > array.get(i + 1)) {
				System.out.println("Not a BST");
				break;
			}
		}

	}

}
