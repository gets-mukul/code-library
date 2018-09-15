/**
 * Find position of the only set bit
Given a number having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. Source: Microsoft Interview | 18
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FindPosOfSingleSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			findPos(n);
	}
	static void findPos(int n) {
		
		int count = 0;
		int temp2;
		boolean check = false;
		while (n > 0) {
			temp2 = n & 1;
			n = n >> 1;
			count++;
			if(temp2 == 1 && n != 0){
				System.out.println("NO");
				check = true;
				break;
				
				
			}
		}
		if(!check) {
			System.out.println("Position is "+ count);
		}
	}
}
