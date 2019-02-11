/*Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
The robot can only move in two directions, right and down, but certain cells are "off limits" such that
the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
the bottom right.*/

package com.dataStructure.java;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
	int row;
	int col;

	Point(int row, int col) {
		row = row;
		col = col;
	}
}

public class RobotInAGrid {

	public static boolean checkForPath(int i, int j, ArrayList<Point> path, boolean[][] grid) {

		if (i < 0 || j < 0 || !grid[i][j]) {
			return false;
		}

		else if (checkForPath(i, j - 1, path, grid) || checkForPath(i - 1, j, path, grid)) {
			Point point = new Point(i, j);
			path.add(point);
			return true;
		}
		return false;
	}

	public static ArrayList<Point> checkForPath(boolean[][] grid) {
		if (grid == null || grid.length == 0) {
			return null;
		}
		ArrayList<Point> path = new ArrayList<Point>();
		if (checkForPath(grid.length - 1, grid[0].length - 1, path, grid)) {
			System.out.println("---------------------");
			return path;
		}
		return null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][] grid;

		System.out.print("Enter the number of rows and columns for a grid: ");
		int r = sc.nextInt();
		int c = sc.nextInt();

		grid = new boolean[r][c];

		System.out.println("Enter number of off-set cell:");
		int n = sc.nextInt();

		if (n != 0) {
			System.out.println("Enter location of off-set cell");
			for (int i = 1; i <= n; i++) {
				int row = sc.nextInt();
				int col = sc.nextInt();
				grid[row][col] = true;

			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		ArrayList<Point> path = checkForPath(grid);

		System.out.println(path);

	}
}
