/**
 * How to turn off a particular bit in a number?
Difficulty Level: Rookie

Given a number n and a value k, turn of the k’th bit in n.

Examples:

Input:  n = 15, k = 1
Output: 14

Input:  n = 15, k = 2
Output: 13

Input:  n = 15, k = 3
Output: 11

Input:  n = 15, k = 4
Output: 7

Input:  n = 15, k >= 5
Output: 15 
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class TurnOffKthBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int  k = sc.nextInt();
		System.out.println(turnOffBit(x, k));

	}
	static int turnOffBit(int x, int k) {
		return ((1 << k) ^ x);
	}
}

/**
 * left shift of 1 by k operating AND operator with n gives the answer
 */