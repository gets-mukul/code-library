/*Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.*/

package com.dataStructure.java;

import java.util.HashMap;

public class Zeromatrix {

	static void makeRowZero(int mat[][], int i) {
		for (int j = 0; j < 3; j++) {
			mat[i][j] = 0;
		}
	}

	static void makeColZero(int mat[][], int i) {
		for (int j = 0; j < 5; j++) {
			mat[j][i] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[5][3];
		mat[0][0] = 2;
		mat[0][1] = 4;
		mat[0][2] = 2;
		mat[1][0] = 0;
		mat[1][1] = 0;
		mat[1][2] = 3;
		mat[2][0] = 9;
		mat[2][1] = 2;
		mat[2][2] = 9;
		mat[3][0] = 3;
		mat[3][1] = 5;
		mat[3][2] = 7;
		mat[4][0] = 9;
		mat[4][1] = 5;
		mat[4][2] = 3;

		boolean row[] = new boolean[5];
		boolean col[] = new boolean[3];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}

		}

		for (int i = 0; i < row.length; i++) {
			if (row[i] == true) {
				makeRowZero(mat, i);
			}
		}

		for (int i = 0; i < col.length; i++) {
			if (col[i] == true) {
				makeColZero(mat, i);
			}
		}
System.out.println("--------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
