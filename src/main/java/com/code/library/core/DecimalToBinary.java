/**
 * Binary representation of a given number
Write a program to print Binary representation of a given number.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		decToBin(n);
	}
	static void decToBin(int n) {
		if (n > 1)
			decToBin(n>>1);
		     
		    System.out.println(n & 1);
	}
}
