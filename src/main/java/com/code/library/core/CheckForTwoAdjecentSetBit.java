/**
 * Check if a number has two adjacent set bits
Given a number you have to check whether there is pair of adjacent set bit or not.

Examples :

Input : N = 67
Output : Yes
There is a pair of adjacent set bit
The binary representation is 100011

Input : N = 5
Output : No
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CheckForTwoAdjecentSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkForTwoAdjecentBit(num);

	}
	public static void checkForTwoAdjecentBit(int num) {
		while(num > 0) {
			int x = (num & (num >> 1)); 
	          
	        if(x == 1) {
	        	System.out.println("YES");
	        	break;
	        }
	        else {
	        	System.out.println("NO");
	        	break;
	        }
		}
	}

}
