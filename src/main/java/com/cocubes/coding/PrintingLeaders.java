/**
 * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.

And the rightmost element is always a leader. For example int the array {16, 19, 4, 3, 8, 3}, leaders are 19, 8 and 3?

http://prepinsta.com/cocubes-programming-question-1/
 */
package com.cocubes.coding;

import java.awt.geom.Area;

/**
 * @author mukul
 *
 */
public class PrintingLeaders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 19, 4, 3, 8, 3};
		getLeader(arr);
	}
	
	public static void getLeader(int[] arr) {
		int max = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				System.out.println(max);
				
			}
		}
		
	}

}

/*Approach is traverse the  array from right to left an keep track of max value whenever the mx value change print the previous max value
 * */
