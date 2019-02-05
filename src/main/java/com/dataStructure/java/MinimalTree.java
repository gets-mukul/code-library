/*
 * Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an algorithm
 *  to create a binary search tree with minimal height
*/
package com.dataStructure.java;

public class MinimalTree {

	public static void main(String[] args) {

		int array[] = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int mid = (array.length / 2);

		TreeNode root = new TreeNode(array[mid]);

		TreeNode temp = root;

		for (int i = mid - 1; i >= 0; i--) {
			temp.left = new TreeNode(array[i]);
			temp = temp.left;
		}

		temp = root;
		for (int i = mid + 1; i < array.length; i++) {
			temp.right = new TreeNode(array[i]);
			temp = temp.right;
		}

		temp = root;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.left;
		}

		System.out.println();

		temp = root;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.right;
		}

	}
}
