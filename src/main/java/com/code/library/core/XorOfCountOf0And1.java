/**
 * XOR counts of 0s and 1s in binary representation
Given a number, the task is to find XOR of count of 0s and count of 1s in binary representation of a given number.
Examples:

Input  : 5
Output : 3
Binary representation : 101
Count of 0s = 1, 
Count of 1s = 2
1 XOR 2 = 3.

Input  : 7
Output : 3
Binary representation : 111
Count of 0s = 0
Count of 1s = 3
0 XOR 3 = 3.

 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class XorOfCountOf0And1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Xor is "+getXorOfCount(x));
	}
	static int getXorOfCount(int x) {
		int one = 0;
		int zero = 0;
		while(x > 0) {
			if((x & 1) == 1) {
				one++;
			}
			else {
				zero++;
			}
			x >>= 1;
		}
		return one ^ zero;
	}
	
}
