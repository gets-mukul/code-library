/**
 * Print ‘K’th least significant bit of a number
A number N is given. We need to print its ‘K’th Least Significant Bit.

Examples :

Input : num = 10, k = 4 
Output : 1
Explanation : Binary Representation 
of 10 is 1010. 4th LSB is 1.

Input : num = 16, k = 3
Output : 0
Explanation : Binary Representation 
of 16 is 10000. 3rd LSB is 0.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class LeastSignificantBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(findKthLeastSifnificantBit(n, k));
		

	}
	
	public static int findKthLeastSifnificantBit(int n, int k) {
		return((n >> k - 1) & 1);
	}

}
