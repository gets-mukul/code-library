/*Given two signed integers, write a function that returns true if the signs of given integers are different, 
 * otherwise false. For example, the function should return true -1 and +100, and should return false for -100 and -200.
 *  The function should not use any of the arithmetic operators.*/

/**
 * 
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class DetectIfOppositeSigns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (oppositeSigns(x, y) == true)
            System.out.println("Signs are opposite");
        else
            System.out.println("Signs are not opposite");

	}
	
	static boolean oppositeSigns(int x, int y)
    {
        return ((x ^ y) < 0);
    }

}

/*
 * Let the given integers be x and y. The sign bit is 1 in negative numbers, and 0 in positive numbers.
 *  The XOR of x and y will have the sign bit as 1 iff they have opposite sign. 
 *  In other words, XOR of x and y will be negative number number iff x and y have opposite signs.  
 * */
