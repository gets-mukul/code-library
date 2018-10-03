/**
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

https://www.interviewbit.com/problems/number-of-1-bits/
 */
package com.interviewBit;

/**
 * @author mukul
 *
 */
public class NumberOf1Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSetBits(198));

	}
	
	public static int numSetBits(long a) {
        return Long.bitCount(a);
    }

}
