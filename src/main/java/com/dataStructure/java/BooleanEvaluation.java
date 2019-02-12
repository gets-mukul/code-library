package com.dataStructure.java;

public class BooleanEvaluation {

	public static int countEval(String str, Boolean result) {

		if (str.length() == 0) {
			return 0;
		}
		if (str.length() == 1) {
			if (Integer.parseInt(str) == 1) {
				return 1;
			} else {
				return 0;
			}
		}

		int ways = 0;

		for (int i = 1; i < str.length(); i = i + 2) {

			Character c = str.charAt(i);

			String left = str.substring(0, i);
			String right = str.substring(i + 1, str.length());

			int leftTrue = countEval(left, true);
			int leftFalse = countEval(left, false);
			int rightFalse = countEval(right, false);
			int rightTrue = countEval(right, true);

			int total = (leftTrue + leftFalse) * (rightTrue + rightFalse);
			int totalTrue = 0;

			if (c == '^') {
				totalTrue = leftTrue * rightFalse + leftFalse + rightTrue;
			} else if (c == '&') {
				totalTrue = leftTrue * rightTrue;
			} else if (c == '|') {
				totalTrue = leftTrue * rightFalse + leftFalse * rightTrue + leftTrue * rightTrue;
			}

			int subWays = result ? totalTrue : total - totalTrue;

			ways += subWays;

		}
		return ways;
	}

	public static void main(String[] args) {

		String str = "0^0&0^1|1";
		Boolean result = true;

		System.out.println(countEval(str, result));

	}

}
