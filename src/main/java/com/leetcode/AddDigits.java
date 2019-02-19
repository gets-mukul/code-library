/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
 * */

package com.leetcode;

public class AddDigits {

	public static int addDigits(int num) {
		if (num < 10) {
			return num;
		} else {
			return addDigits(addAllDigits(num));
		}
	}

	public static int addAllDigits(int num) {
		int sum = 0;

		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.println(addDigits(38));

	}

}
