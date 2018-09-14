/**
 * Turn off the rightmost set bit
Write a program that unsets the rightmost set bit of an integer.

Examples :

Input:  12 (00...01100)
Output: 8 (00...01000)

Input:  7 (00...00111)
Output: 6 (00...00110)
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class TurnOffSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(turnOff(x));
	}
	static int turnOff(int x) {
		
		return ((x) & (x-1));
	}
}

/*here we know that right most bit after the rightmost on bit of decimal is all oppisite in its one preceding decimal number
 * Example : 8--> 1 0 0 0
	         7--> 0 1 1 1	
   here all the bit after the 4th position in 8 is opposite in 7.
   then making and of n and n-1 we got the answer 
	          */
