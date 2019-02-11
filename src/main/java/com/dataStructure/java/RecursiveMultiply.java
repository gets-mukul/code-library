package com.dataStructure.java;

public class RecursiveMultiply {

	public static int getMultiply(int smaller, int larger) {

		if (smaller == 0) {
			return 0;
		} else if (smaller == 1) {
			return larger;
		}

		int s = smaller >> 1;
		int half = getMultiply(s, larger);
		if (smaller % 2 == 0) {
			return half + half;
		} else {
			return half + half + larger;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMultiply(8, 9));

	}

}
