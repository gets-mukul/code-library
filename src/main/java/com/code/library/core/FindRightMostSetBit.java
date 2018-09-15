/**
 * Position of rightmost set bit
Write a  function to return position of first 1 from right to left, in binary representation of an Integer.

I/P    18,   Binary Representation 010010
O/P   2
I/P    19,   Binary Representation 010011
O/P   1
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindRightMostSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println("Position  of rightmost set bit is "+findPosition(n));
	}
	static int findPosition(int n) {
		int m = 1;
		int count = 1;
		while((n & m) == 0 ) {
			m <<=  1;
			count ++;
		}
		return count;
	}
}

/*
 * keep  doing AND operation on n with left shift of 1, till it reaches to 0
 * */
