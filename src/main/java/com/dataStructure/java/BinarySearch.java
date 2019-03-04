package com.dataStructure.java;

public class BinarySearch {
	public static void binarySearch(int[] array, int start, int end, int element) {
		if (start > end) {
			System.out.println("404 : Element not found");
			return;
		}
		int mid = (start + end) / 2;

		if (element < array[mid]) {
			binarySearch(array, start, mid - 1, element);
		}
		if (element > array[mid]) {
			binarySearch(array, mid + 1, end, element);
		} else {
			System.out.println("200 : Element found");
			return;
		}

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		binarySearch(array, 0, array.length, 5);

	}

}
