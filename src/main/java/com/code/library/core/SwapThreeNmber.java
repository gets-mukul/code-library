/**
 * Swap three variables without using temporary variable
Given three variables, a, b and c, swap them without temporary variable.

Example :

Input  : a = 10, b = 20 and c = 30
Output : a = 30, b = 10 and c = 20
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SwapThreeNmber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Before swaping a = "+a+", b = "+b+", c = "+c);
		a = a ^ b ^ c;
		b = a ^ b ^ c;
		c = a ^ b ^ c;
		a = a ^ b ^ c;
		System.out.println("After swaping a = "+a+", b = "+b+", c = "+c);
	}
	
}
