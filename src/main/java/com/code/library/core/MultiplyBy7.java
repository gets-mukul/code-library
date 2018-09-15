/**
 * Efficient way to multiply with 7
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class MultiplyBy7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n+" multiply by 7 is "+multiplyBySeven(n));
	}
	static int multiplyBySeven(int n) {
//		return ((n << 2) + (n << 1) + n);
		return ((n << 3) - (n));
	}
}

/*to solve this problem we have two  solutions
 * 1] break 7x into 4x + 2x + x
 * 2] break 7x into 8x -  x
 * */
