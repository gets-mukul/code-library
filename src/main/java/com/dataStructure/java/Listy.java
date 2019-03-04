/*You are given an array-like data structure Listy which lacks a size
method. It does, however, have an elementAt ( i) method that returns the element at index i in
0( 1) time. If i is beyond the bounds of the data structure, it returns -1. (For this reason, the data
structure only supports positive integers.) Given a Listy which contains sorted, positive integers,
find the index at which an element x occurs. If x occurs multiple times, you may return any index*/

package com.dataStructure.java;

public class Listy {

	static int[] array = new int[] { 2, 4, 6, 7, 9, 23, 26, 29, 45 };

	public static int getElementAt(int i) {
		if (i >= array.length || i < 0) {
			return -1;
		} else {
			return array[i];

		}

	}

	public static void binarySearch(int[] array, int start, int end, int x) {

		int mid = (start + end) / 2;
		if (getElementAt(start) == -1 && getElementAt(end) == -1) {
			System.out.println("404 not found");
			return;
		}

		if (getElementAt(mid) < x) {
			if (getElementAt(end) == -1) {
				binarySearch(array, start, mid, x);
			} else {
				binarySearch(array, mid + 1, end * 2, x);

			}
		} else if (getElementAt(mid) > x) {
			if (getElementAt(mid) == -1) {

			}
			binarySearch(array, start, mid, x);
		} else {
			System.out.println(mid);
		}
	}

	public static void main(String[] args) {
		int x = 2400;

		if (array[0] == x) {
			System.out.println("0");
		} else {
			binarySearch(array, 0, 2, x);
		}

	}
}
