package com.dataStructure.java;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);

		root.right = new TreeNode(3);
		root.left = new TreeNode(2);

		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);

		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(4);

		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();

		q1.add(root);
		int count = 0;

		ArrayList<LinkedList<Integer>> array = new ArrayList<LinkedList<Integer>>();

		while (true) {

			while (!q1.isEmpty()) {
				TreeNode temp;
				temp = q1.peek();
				if (temp.left != null) {
					q2.add(temp.left);
				}
				if (temp.right != null) {
					q2.add(temp.right);
				}
//				array.get(count).add(temp.data);
				System.out.print(temp.data + ", ");
//				array.add(count, element);

				q1.remove();
			}

			count++;
			System.out.println();

			while (!q2.isEmpty()) {
				TreeNode temp;
				temp = q2.peek();
				if (temp.left != null) {
					q1.add(temp.left);
				}
				if (temp.right != null) {
					q1.add(temp.right);
				}
//				array.get(count).add(temp.data);
				System.out.print(temp.data + ",");
				q2.remove();
			}
			System.out.println();

			if (q1.isEmpty() && q2.isEmpty()) {
				break;
			}

		}

	}

}
