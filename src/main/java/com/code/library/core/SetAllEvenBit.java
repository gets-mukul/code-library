/**
 * Set all even bits of a number
Given a number, the task is to set all even bit of a number. Positions of bits are counted from LSB (least significant bit) to MSB (Most significant bit). Position of LSB is considered as 1.

Examples :

Input : 20 
Output : 30
Binary representation of 20 is
10100. After setting
even bits, we get 11110

Input : 10
Output : 10
 */
package com.code.library.core;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SetAllEvenBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(evenbitsetnumber(n)); 
	}
	
	static int evenbitsetnumber(int n) 
    { 
        int count = 0, res = 0; 
        for (int temp = n; temp > 0; temp >>= 1) { 
             
            if (count % 2 == 1) 
            res |= (1 << count); 
  
        count++; 
        } 
          
        return (n | res); 
          
    }

}

/*
 * 1. First generate a number that contains even position bits.
2. Take OR with the original number. Note that 1 | 1 = 1 and 1 | 0 = 1.
 * */
