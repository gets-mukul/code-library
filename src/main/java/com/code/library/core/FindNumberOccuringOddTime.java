/**
 * Find the Number Occurring Odd Number of Times
Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.

Examples :

Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3

Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindNumberOccuringOddTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		System.out.println("Odd occuring number is " +oddOccuring(arr));
	}
	static int oddOccuring(int []arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp = temp ^ arr[i];
		}
		return temp;
	}

}
