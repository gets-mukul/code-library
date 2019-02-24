/**
 * Maximum difference between two elements such that larger element appears after the smaller number
Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the 
smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ] then 
returned value should be 2 (Diff between 7 and 9)
 */
package com.cocubes.coding;

/**
 * @author mukul
 *
 */
public class MaximumDiffBetweenTwoElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 9, 5, 6, 3, 2};
		System.out.println(getDiff(arr));

	}
	
	public static int getDiff(int[] arr) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		int i, index = 0;
		for(i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
			
		}

		for(i=index; i>=0;i--) {
			if(arr[i] < min) {
				min = arr[i];
				
			}
			
		}
		return Math.abs(max-min);
	}

}
/*find the max and min vale from array just keep in mind you have to fing hte max value first*/