/**
 * Find whether a given number is a power of 4 or not
Given an integer n, find whether it is a power of 4 or not.

Example :

Input : 16
Output : 16 is a power of 4

Input : 20
Output : 20 is not a power of 4
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class IsNumPowerOf4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			checkForPower(x);
	}
		static void checkForPower(int x) {
			int count = 0;
			while(x > 1) 
		     { 
		       x  >>= 1;
		       count += 1; 
		     }       
		  
		    if(count%2 == 0) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
		}
}

/*
 * key to rememberr is every number power to 4 have always 1 set bit in its binary form so and of n and n-1 should be 0
 * also abter set bit all the count of zero will be even*/
