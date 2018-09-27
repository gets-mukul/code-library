/**
 * Check if binary representations of two numbers are anagram
Given two numbers you are required to check whether they are anagrams of each other or not in binary representation.

Examples:

Input : a = 8, b = 4 
Output : Yes
Binary representations of both
numbers have same 0s and 1s.

Input : a = 4, b = 5
Output : No
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long x = sc.nextLong();
		Long y = sc.nextLong();
		
		if(checkForAnagram(x) == checkForAnagram(y)) {
			System.out.println("ANAGFRAM");
		}
		else {
			System.out.println("NOT AN ANAGRAM");
		}

	}
	public static int checkForAnagram(Long a) {
		return Long.bitCount(a);
	}

}

/*
 * solution of this problem is just simplle count the number if set bit in both the numbers
 * */
