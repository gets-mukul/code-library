/**
 * Count number of bits to be flipped to convert A to B
Given two numbers ‘a’ and b’. Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.

Example :

Input : a = 10, b = 20
Output : 4
Binary representation of a is 00001010
Binary representation of b is 00010100
We need to flip highlighted four bits in a
to make it b.

Input : a = 7, b = 10
Output : 3
Binary representation of a is 00000111
Binary representation of b is 00001010
We need to flip highlighted three bits in a
to make it b.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CountFlippedBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Number of flipped bit is "+countFlippedBit(a,b));
	}
	static int countFlippedBit(int a, int b) {
		int count = 0;
		while(a > 0 || b > 0) {
			if((a & 1) != (b & 1)) {
				count++;
			}
			a = a >> 1;
			b = b >> 1;
		}
		return count;
	}
}

/*
 * we lnow that by dont and operaton on any number with 1 we get to know that tha right most bit is 0 or 1
 * so by  compairing this method for both a adn b we can count number of flipped bits 
 * */
