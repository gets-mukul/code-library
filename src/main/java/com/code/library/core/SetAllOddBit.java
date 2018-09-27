/**
 * Set all odd bits of a number
Given a number, the task is to set all odd bits of a number. Positions of bits are counted from LSB (least significant bit) to MSB (Most significant bit). Position of LSB is considered as 1.

Examples :

Input : 20
Output : 21
Explanation : Binary representation of 20
is 10100. Setting all odd
bits make the number 10101 which is binary
representation of 21.

Input : 10
Output : 15

 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SetAllOddBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(oddbitsetnumber(n));

	}

	static int oddbitsetnumber(int n) {
		int count = 0;

		int res = 0;

		for (int temp = n; temp > 0; temp >>= 1) {

			if (count % 2 == 0)
				res |= (1 << count);

			count++;
		}

		return (n | res);
	}

}

/*1. First generate a number that contains odd position bits.
2. Take OR with the original number. Note that 1 | 1 = 1 and 1 | 0 = 1.
 * */
