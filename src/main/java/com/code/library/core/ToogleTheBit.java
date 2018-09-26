/**
 *Toggle the last m bits
Given a non-negative number n. The problem is to toggle the last m bits in the binary representation of n. A toggle operation flips a bit 0 to 1 and a bit 1 to 0.

Constraint: 1 <= m <= n.

Examples:

Input : n = 21, m = 2
Output : 22
(21)10 = (10101)2
(22)10 = (10110)2
The last two bits in the binary
representation of 21 are toggled.

Input : n = 107, m = 4
Output : 100 
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class ToogleTheBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		n = toggleLastMBits(n, m);
		System.out.println(n);
	}

	public static int toggleLastMBits(int n, int m) {

		int num = (1 << m) - 1;

		return (n ^ num);
	}

}

/*
 * Calculate num = (1 << m) – 1. This will produce a number num having m number
 * of bits and all will be set. Now, perform n = n ^ num. This will toggle the
 * last m bits in n.
 */
