package com.interviewBit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SubSet {
	public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public static void subset(ArrayList<Integer> A, ArrayList<Integer> subSet) {

		if (A.size() == 0) {

//			result.add(temp);
		} else {
			for (int i = 0; i < A.size(); i++) {

				int num = A.get(i);

				subSet.add(num);

				System.out.println("subset : " + subSet);

				ArrayList<Integer> temp = new ArrayList<Integer>(subSet);

				result.add(temp);

				subset(new ArrayList<Integer>(A.subList(i + 1, A.size())), subSet);

				subSet.remove(subSet.size() - 1);

//				subset(A, subSet);

			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		Collections.sort(A);
		ArrayList<Integer> subSet = new ArrayList<Integer>();

		// first empty subset
		result.add(subSet);

		subset(A, subSet);

		System.out.println("result : " + result);
	}

}
