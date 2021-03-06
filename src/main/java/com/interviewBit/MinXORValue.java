/**
 * Given an array of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

Examples : 
Input 
0 2 5 7 
Output 
2 (0 XOR 2) 
Input 
0 4 7 9 
Output 
3 (4 XOR 7)

Constraints: 
2 <= N <= 100 000 
0 <= A[i] <= 1 000 000 000
 */
package com.interviewBit;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mukul
 *
 */
public class MinXORValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		  list.add(0); 
		  list.add(2);  
		  list.add(5);
		  list.add(7);
		  System.out.println(findMinXor(list));

	}
	
	public static int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<A.size()-1; i++) 
            min = Math.min(min,A.get(i)^A.get(i+1));
        return min;
    }

}
