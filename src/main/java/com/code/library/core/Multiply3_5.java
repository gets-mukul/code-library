/**
 * Multiply a given Integer with 3.5
Given a integer x, write a function that multiplies x with 3.5 and returns the integer result. You are not allowed to use %, /, *.

Examples :
Input: 2
Output: 7

Input: 5
Output: 17 (Ignore the digits after decimal point)
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class Multiply3_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("product is "+ product(x));
	}
		static int product(int x) {
			return((x << 1) + (x)  + (x >> 1));
		}
}

/*
 * Its just an simple mathamatics
 * we have to find 3.5*x
 * 3.5*x-->x*(35/10)-->x*(7/2)-->2*x + x + x/2
 * here we kknow that 
 * first right shift == 1/2^1
 * and first left shift == 2^1
 * 
 * */
