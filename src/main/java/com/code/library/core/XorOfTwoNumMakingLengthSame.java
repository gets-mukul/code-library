/**
 * XOR of two numbers after making length of their binary representations equal
Given two numbers say a and b. Print their XOR after making the lengths of their binary representation equal by adding trailing zeros to the binary representation of smaller one.

Examples :

Input : a = 13, b = 5 
Output : 7
Explanation : Binary representation of 13 is 1101 and 
of 5 is 101. As the length of "101" is smaller,
so add a '0' to it making it "1010', to make 
the length of binary representations equal. 
XOR of 1010 and 1101 gives 0111 which is 7.

Input : a = 7, b = 5 
Output : 2
Explanation : Since the length of binary representations
of 7 i.e, 111 and 5 i.e, 101 are same, hence simply
print XOR of a and b.
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class XorOfTwoNumMakingLengthSame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        System.out.println(XOR(a, b));

	}
	static int XOR(int a, int b)
    {
        int c = Math.min(a, b);
        int d = Math.max(a, b);
         
        if (count(c) < count(d))
        c = c << ( count(d) - count(c) ); 
         
        return (c ^ d); 
    }
	static int count(int n)
    {
        int c = 0;
         
        while (n != 0)
        {
            c++;
             
            n = n >> 1;
        }
        return c;
    }
}

/*
 * Count the number of bits in binary representation of smaller number out of a and b.
 *  If the number of bits in smaller number(say a) exceeds to that of larger number(say b), 
 *  then apply left shift to the smaller number by the number of exceeding bits, i.e, a = a<<(exceeding bits). 
 *  After applying left shift, trailing zeroes will be added at the end of binary representation of smaller number to make the
 *   number of bits in binary representation of both the numbers equal. XOR both the binary representations to get the final result.
 * */
