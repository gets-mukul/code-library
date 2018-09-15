/**
 * Find XOR of two number without using XOR operator
Given two integers, find XOR of them without using XOR operator, i.e., without using ^ in C/C++.

Examples :

Input:  x = 1, y = 2
Output: 3

Input:  x = 3, y = 5
Output: 6
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindXorWithoutUsingXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("XOR of "+x+" and "+y+ " is "+getXor(x, y));

	}
	static int getXor(int x, int y) {
		
		return (x | y) & (~x | ~y);
	}
}
