package com.dataStructure.java;

public class PathsWithSum {

	public static int countPathsWithSumFromNode(TreeNode node, int targetSum, int currentSum) {
		if (node == null) {

			return 0;
		}
		currentSum = currentSum + node.data;
		int totalPaths = 0;
		if (currentSum == targetSum) {
			totalPaths++;
		}

		totalPaths = totalPaths + countPathsWithSumFromNode(node.left, targetSum, currentSum);
		totalPaths = totalPaths + countPathsWithSumFromNode(node.right, targetSum, currentSum);

		return totalPaths;
	}

	public static int countPathsWithSum(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}

		int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);

		int pathsOnLeft = countPathsWithSum(root.left, targetSum);
		int pathsOnRight = countPathsWithSum(root.right, targetSum);

		return pathsFromRoot + pathsOnLeft + pathsOnRight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(10);

		root.right = new TreeNode(-3);
		root.right.right = new TreeNode(11);

		root.left = new TreeNode(5);

		root.left.right = new TreeNode(2);
		root.left.left = new TreeNode(3);

		root.left.right.right = new TreeNode(1);

		root.left.left.right = new TreeNode(-2);

		root.left.left.left = new TreeNode(3);

		int targetSum = 8;

		int result = countPathsWithSum(root, targetSum);
		
		System.out.println(result);

	}

}
