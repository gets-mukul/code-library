/**
 * Add 1 to a given number
Write a program to add one to a given number. The use of operators like ‘+’, ‘-‘, ‘*’, ‘/’, ‘++’, ‘–‘ …etc are not allowed.
Examples:

Input:  12
Output: 13

Input:  6
Output: 7
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class Add1ToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println("Sum is "+addOne(x));
	}
		static int addOne(int x) {
			return(-(~x));
		}
}
/*Say, x is numerical value of a number, then

~x = -(x+1) [ ~ is for bitwise complement ]

(x + 1) is due to addition of 1 in 2’s complement conversion

To get (x + 1) apply negation once again. So, the final expression becomes (-(~x)).*/