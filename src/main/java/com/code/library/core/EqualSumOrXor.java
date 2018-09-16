/**
 * Equal Sum and XOR
Given a positive integer n, find count of positive integers i such that 0 <= i <= n and n+i = n^i
Examples :

Input  : n = 7
Output : 1
Explanation:
7^i = 7+i holds only for only for i = 0
7+0 = 7^0 = 7


Input n = 12
Output: 4
12^i = 12+i hold only for i = 0, 1, 2, 3
for i=0, 12+0 = 12^0 = 12
for i=1, 12+1 = 12^1 = 13
for i=2, 12+2 = 12^2 = 14
for i=3, 12+3 = 12^3 = 15
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class EqualSumOrXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countValues(n));
	}
	public static int countValues(int n)
    {
      
        int unset_bits=0;
        while (n > 0)
        {
            if ((n & 1) == 0)
                unset_bits++;
            n=n>>1;
        }
      
        return 1 << unset_bits;
    }
}

/*
 * Since we know a + b = a ^ b + 2 * (a & b)

We can write, n + i = n ^ i + 2 * (n & i)

So n + i = n ^ i implies n & i = 0
 * */
