/**
 * Find One’s Complement of an Integer
Given an integer n, find the one’s complement of the integer.

Examples:

Input  : n = 5
Output : 2

Input  : n = 255
Output : 0

Input  : n = 26
Output : 5
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class OnesComplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(getOnesComplement(num));
	}

	public static int getOnesComplement(int n) {

		int number_of_bits = (int) (Math.floor(Math.log(n) / Math.log(2))) + 1;
		return ((1 << number_of_bits) - 1) ^ n;
	}

}

/*
 * An efficient approach to this problem is as follows:
1. Find the number of bits in the given integer
2. XOR the given integer with 2^number_of_bits-1


 * */
