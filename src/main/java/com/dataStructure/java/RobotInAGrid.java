/*Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
The robot can only move in two directions, right and down, but certain cells are "off limits" such that
the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
the bottom right.*/

package com.dataStructure.java;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotInAGrid {
	public static void checkForPath(int i, int j, ArrayList<String> path, int grid[][]) {
		if (i == 0 && j == 0) {
			return;
		} else if (grid[i][j] != -1) {
			String str1 = Integer.toString(i);
			String str2 = Integer.toString(j);
			path.add(str1 + str2);
		}
		checkForPath(i - 1, j, path, grid);
		checkForPath(i, j - 1, path, grid);

		for (String x : path) {
			System.out.println(x);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns for a grid: ");
		int r = sc.nextInt();
		int c = sc.nextInt();

		ArrayList<String> path = new ArrayList<>();
		int grid[][] = new int[r][c];

		System.out.println("Enter number of off-set cell:");
		int n = sc.nextInt();

		if (n != 0) {
			System.out.println("Enter location of off-set cell");
			for (int i = 1; i <= n; i++) {
				int row = sc.nextInt();
				int col = sc.nextInt();
				grid[row][col] = -1;

			}
		}

		checkForPath(r - 1, c - 1, path, grid);

	}

}
