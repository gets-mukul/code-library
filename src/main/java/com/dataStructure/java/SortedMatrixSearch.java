package com.dataStructure.java;

public class SortedMatrixSearch {

	public static void main(String[] args) {
		int[][] array = { { 15, 20, 40, 85 }, { 20, 35, 80, 95 }, { 30, 55, 95, 105 }, { 40, 80, 100, 120 } };

		int m = array.length;
		int n = array[0].length;

		int i, x = 40;

		for (i = 0; i < m; i++) {
			if (array[i][n - 1] > x) {
				break;
			}
			if (array[i][n - 1] == x) {
				System.out.println(i + ":" + (n - 1));
				break;
			}
		}

		for (int j = 0; j < n; j++) {
			if (array[i][j] == x) {
				System.out.println(i + ":" + j);
				break;
			}
		}

	}

}
