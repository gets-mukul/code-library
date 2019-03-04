package com.dataStructure.java;

public class SparseSearch {

	public static void binarySparseSearch(String[] array, int start, int end, String str) {
		if (start < end) {
			int mid = (start + end) / 2;
			if (start == end && array[start] != str) {
				return;
			}
			if (start < 0 || start >= array.length) {
				return;
			}
			if (end >= array.length || end < 0) {
				return;
			}
			if (array[mid] == "") {

				binarySparseSearch(array, start, mid - 1, str);
				binarySparseSearch(array, mid + 1, end, str);
			} else if (array[mid].compareTo(str) < 0) {

				binarySparseSearch(array, start, mid - 1, str);
			} else if (array[mid].compareTo(str) > 0) {
				binarySparseSearch(array, mid + 1, end, str);
			} else if (start == end && array[start] != str) {
				return;
			} else {
				System.out.println(mid);
				return;
			}
		}
	}

	public static void main(String[] args) {
		String[] array = { "at", "", "", "", "", "", "ball", "", "", "car", "", "", "", "dad", "", "" };
		String str = "car";
		binarySparseSearch(array, 0, array.length - 1, str);
	}

}
