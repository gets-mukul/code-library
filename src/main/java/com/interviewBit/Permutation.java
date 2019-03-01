/*
 Given a collection of numbers, return all possible permutations.

Example:

[1,2,3] will have the following permutations:

[1,2,3]
[1,3,2]
[2,1,3] 
[2,3,1] 
[3,1,2] 
[3,2,1]
 * */

package com.interviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

	public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public static void permute(int start, ArrayList<Integer> A) {

		if (start == A.size()) {
			return;
		}
		ArrayList<Integer> permutation = new ArrayList<Integer>();

		permutation.add(A.get(start));

		for (int i = 0; i < A.size(); i++) {

			if (!permutation.contains(A.get(i))) {
				permutation.add(A.get(i));
			}
			if (permutation.size() == A.size()) {
				result.add(new ArrayList<Integer>(permutation));
			}
		}

		System.out.println(permutation);
		permute(start + 1, A);
	}

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);

		Collections.sort(A);

		permute(0, A);

		System.out.println(result);

	}

}
