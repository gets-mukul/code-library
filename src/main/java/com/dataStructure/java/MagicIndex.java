package com.dataStructure.java;

public class MagicIndex {
	public static int getMagicIndex(int[] array, int start, int end) {

		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] > mid) {
			return getMagicIndex(array, start, mid - 1);
		} else {
			return getMagicIndex(array, mid + 1, end);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { -40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13 };

		System.out.println(getMagicIndex(array, 0, array.length - 1));

	}

}
