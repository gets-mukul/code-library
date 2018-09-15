/**
 * How to swap two numbers without using a temporary variable?
Given two variables, x and y, swap two variables without using a third variable.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SwapingOfTwoNumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("old a is "+a+" and old b is "+b);
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			System.out.println("new a is "+a+" and new b is "+b);
	}

}
