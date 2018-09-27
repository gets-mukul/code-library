/**
 * Print numbers having first and last bits as the only set bits
Given a positive integer n. The problem is to print numbers in the range 1 to n having first and last bits as the only set bits.

Examples:

Input : n = 10
Output : 1 3 5 9
(1)10 = (1)2.
(3)10 = (11)2.
(5)10 = (101)2.
(9)10 = (1001)2
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindSetBitAtStartAndEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		findAnagram(num);

	}
	
	public static void findAnagram(int num) {
		int temp = 1;
		System.out.println(temp);
		while(true) {
			temp <<= 1;
			if((temp + 1) <= num) {
				System.out.println(temp+1);
			}
			else {
				break;
			}
		}
	}

}

/*
 * solution is very simple as bby the pater we get to know that exact power of 2 + 1 are the only one having start and end bit as set bit.
 * so just left shift ont bit and keep adding one to it till it reaches to the given number 
 * */
