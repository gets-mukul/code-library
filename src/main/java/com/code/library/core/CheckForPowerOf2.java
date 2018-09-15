/**
 * Program to find whether a no is power of two
Given a positive integer, write a function to find if it is a power of two or not.

Examples :

Input : n = 4
Output : Yes
22 = 4

Input : n = 7
Output : No

Input : n = 32
Output : Yes
25 = 32
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CheckForPowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkForPowerOfTwo(n);
	}
	static void checkForPowerOfTwo(int n) {
		int sum  = n + (n - 1);
		int xor = n ^ (n - 1);
		if(xor == sum) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}

/*
 * by solving some mathematical concept we get to the conclusion that XOR of n and n-1 is equals to n + n-1
 * */
