/*
 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
		*/

package com.dataStructure.java;

import java.util.HashMap;
import java.util.Scanner;

public class CheckForUnique {

	static Boolean isUniqueFast(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && i != j) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isUniqueFaster(String str) {
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				return false;
			} else {
				map.put(str.charAt(i), true);
			}
		}
		return true;
	}

	static boolean isUniqueFastest(String str) {
		// this method only work for lower case letters [a, b, c, d, ..................,
		// z]
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) < 95 || str.charAt(i) > 122) {
				System.out.println("Enter the lower case string");
				return false;
			} else {
				int val = str.charAt(i) - 'a';
				if ((val & (1 << val)) > 0) {
					return false;
				} else {
					checker = checker | (1 << val);
				}
			}

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");

		String str = sc.nextLine();
//		System.out.println(isUniqueFast(str));
//		System.out.println(isUniqueFaster(str));
		System.out.println(isUniqueFastest(str));

	}

}
