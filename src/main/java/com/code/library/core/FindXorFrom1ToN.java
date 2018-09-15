/**
 * Calculate XOR from 1 to n.
Given a number n, the task is to find the XOR from 1 to n.

Examples :

Input : n = 6
Output : 7
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  = 7

Input : n = 7
Output : 0
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindXorFrom1ToN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("XOR from 0 to "+x+" is "+getXor(x));
	}
	static int getXor(int x) {
		if(x <= 0) {
			return 0;
		}
		else {
			return x ^ getXor(x-1);
		}
	}
}
