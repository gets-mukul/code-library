/**
 * Count set bits in an integer
Write an efficient program to count number of 1s in binary representation of an integer.

Examples :

Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 11 is 1101 and has 3 set bits
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CountSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println("number of set bit is "+findSetBit(x));
	}
	static int findSetBit(int x) {
		int count = 0;
		while(x>0) {
			x = x & (x-1);
			count ++;
		}
		return count;
	}
}
/*
 * Brian Kernighan’s Algorithm:
Subtraction of 1 from a number toggles all the bits (from right to left) till the rightmost set bit(including the rightmost set bit). So if we subtract a number by 1 and do bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If we do n & (n-1) in a loop and count the no of times loop executes we get the set bit count.
The beauty of this solution is the number of times it loops is equal to the number of set bits in a given integer.
 * */
