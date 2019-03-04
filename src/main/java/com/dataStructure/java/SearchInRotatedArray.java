package com.dataStructure.java;

public class SearchInRotatedArray {
	public static int rotatedBinarySearch(int[] array, int start, int end, int x) {
		if (start < end) {
			int mid = (start + end) / 2;
			if (array[mid] == x) {
				return mid;
			}
			if (array[start] < array[mid]) {
				if (x >= array[start] && x < array[mid]) {
					return rotatedBinarySearch(array, start, mid - 1, x);
				} else {
					return rotatedBinarySearch(array, start, mid - 1, x);
				}
			} else if (array[mid] < array[start]) {
				if (x > array[mid] && x <= array[end]) {
					return rotatedBinarySearch(array, mid + 1, end, x);
				} else {
					return rotatedBinarySearch(array, start, mid - 1, x);
				}
			} else if (array[start] == array[mid]) {
				if (array[mid] != array[end]) {
					return rotatedBinarySearch(array, mid + 1, end, x);
				} else {
					int result = rotatedBinarySearch(array, start, mid - 1, x);
					if (result == -1) {
						return rotatedBinarySearch(array, mid + 1, end, x);
					} else {
						return result;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };

		int x = 15;

		System.out.println(rotatedBinarySearch(array, 0, array.length - 1, x));
	}

}
