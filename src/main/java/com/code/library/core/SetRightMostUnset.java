/**
 * Set the rightmost unset bit
Given a non-negative number n. The problem is to set the rightmost unset bit in the binary representation of n. If there are no unset bits, then just leave the number as it is.

Examples:

Input : 21
Output : 23
(21)10 = (10101)2
Rightmost unset bit is at position 2(from right) as 
highlighted in the binary representation of 21.
(23)10 = (10111)2
The bit at position 2 has been set.

Input : 15
Output : 15
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SetRightMostUnset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    System.out.print(setRightmostUnsetBit(n));

	}
	static int getPosOfRightmostSetBit(int n) 
	{
	    return (int)((Math.log10(n & -n)) / (Math.log10(2))) + 1;
	}
	 
	static int setRightmostUnsetBit(int n) 
	{
	    if (n == 0)
	    return 1;
	 
	    if ((n & (n + 1)) == 0)
	    return n;
	 
	    int pos = getPosOfRightmostSetBit(~n);
	 
	    return ((1 << (pos - 1)) | n);
	}
	 

}

/*Approach: Following are the steps:

If n = 0, return 1.
If all bits of n are set, return n. Refer this post.
Else perform bitwise not on the given number(operation equivalent to 1’s complement). Let it be num = ~n.
Get the position of rightmost set bit of num. Let the position be pos.
Return (1 << (pos – 1)) | n.
*/
