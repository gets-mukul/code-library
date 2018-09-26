/**
 * Write a function that returns 2 for input 1 and returns 1 for 2
Write a function which returns 1 that 2 is passed and return 2 when 1 is passed.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class RerurnOpposite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		 System.out.println(x ^ 1 ^ 2);
	}

}
