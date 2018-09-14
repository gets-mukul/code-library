/**
 * Write a function subtract(x, y) that returns x-y where x and y are integers. 
 * 			The function should not use any of the arithmetic operators (+, ++, –, -, .. etc).
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SubtractionWithoutUsingOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("difference is "+diff(x,y));

	}
	static int diff(int x, int y) {
		int borrow;
		while(y!=0) {
			borrow = (~x)&y;
			x = x^y;
			y = borrow << 1;
		}
		return x;
	}

}
