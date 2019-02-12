package com.dataStructure.java;

import java.util.HashSet;
import java.util.Set;

public class Parens {

	public static Set<String> getParens(int remaining) {
		Set<String> set = new HashSet<String>();

		if (remaining == 0) {
			set.add("");
		} else {
			Set<String> prev = getParens(remaining - 1);
			for (String str : prev) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()" + str);
			}
		}
		return set;
	}

	public static String insertInside(String str, int leftIndex) {
		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1, str.length());
		return left + "()" + right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set = getParens(5);
		for (String x : set) {
			System.out.println(x);
		}

	}

}
