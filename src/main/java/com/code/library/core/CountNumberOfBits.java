/**
 * Count total bits in a number
Given a positive number n, count total bit in it.

Examples:

Input : 13
Output : 4
Binary representation of 13 is 1001

Input  : 183
Output : 8

Input  : 4096
Output : 13
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CountNumberOfBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countNumberOfBit(n));
	}
	public static int countNumberOfBit(int n) {
		int count = 0;
		while(n > 0) {
			count ++;
			n >>= 1;
		}
		return count;
	}
}
