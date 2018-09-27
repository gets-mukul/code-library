/**
 *Multiples of 4 (An Interesting Method)
Given a number n, the task is to check whether this number is a multiple of 4 or not without using +, -, * ,/ and % operators.

Examples :

Input: n = 4  Output - Yes
       n = 20 Output - Yes
       n = 19 Output - No 
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class MultipleOfFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkForMultipleOfFour(n);
	}
	
	public static void checkForMultipleOfFour(int n) {
		int temp = 0;
		for(int i = 1; i<=n; i++) {
			temp = temp ^ i;
		}
		if(temp == n) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}

/*When we do XOR of numbers, we get 0 as XOR value just before a multiple of 4. This keeps repeating before every multiple of 4.
 * */
