/**
 * Rotate bits of a number
Bit Rotation: A rotation (or circular shift) is an operation similar to shift except that the bits that fall off at one end are put back to the 
other end.

In left rotation, the bits that fall off at left end are put back at right end.

In right rotation, the bits that fall off at right end are put back at left end.

Output :
Left Rotation of 16 by 2 is 64
Right Rotation of 16 by 2 is 4
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class BitRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int d = sc.nextInt();
			System.out.println("Left rotation : "+leftRotation(x, d));
			System.out.println("RightRotation : "+rightRotation(x, d));
	}
	static int leftRotation(int x, int d) {
		int BIT = 32;
		return ((x << d) | (x >> (BIT - d)));
	}
	
	static int rightRotation(int x, int d) {
		int BIT = 32;
		
		return ((x >> d) | (x << (BIT - d)));
	}

}
/*
 * Rotation is quite similar to the shift operator the difference is that in shift operator we lost the bit which goes out of the bit range.
 * but in bit rotation bit get added to the opposite direction.
 * to solve this problem
 * lets say 
 * n  = 9-->1 0 0 1 
 * d = 2
 * a = n << 2 (0 1 0 0)
 * b = n >> 2 (0 0 1 0 ) [right shift by number of bit -d (4-2)]
 * a | b = 0 1 1 0--> answer
 * */
 