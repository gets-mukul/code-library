/**
 * Check in binary array the number represented by a subarray is odd or even
Given a array such that all its terms is either 0 or 1.You need to tell the number represented by a subarray a[l..r] is odd or even

Examples :

Input : arr = {1, 1, 0, 1}
        l = 1, r = 3
Output : odd
        number represented by arr[l...r] is 
        101 which 5 in decimal form which is 
        odd

Input :  arr = {1, 1, 1, 1}
         l = 0, r = 3
Output : odd
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CheckBinaryEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the eelemnets of an array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the value of l and r");
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		cheakForEvenOdd(arr, l ,r);
			
	}
	public static void cheakForEvenOdd(int arr[], int l, int r) {
		if(arr[r] == 1) {
			System.out.println("ODD");
		}
		else {
			System.out.println("EVEN");
		}
	}
}

/*
 * here the trick is all the even number in the binary form contain 0 as
 * rightmost set bit, and odd contain 1 as r most set bit.
 * 
 */
