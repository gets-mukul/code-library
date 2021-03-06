/**
 * Reverse bits of an 32 bit unsigned integer

Example 1:

x = 0,

          00000000000000000000000000000000  
=>        00000000000000000000000000000000
return 0

Example 2:

x = 3,

          00000000000000000000000000000011 
=>        11000000000000000000000000000000
return 3221225472
 */
package com.code.library.core;

/**
 * @author mukul
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(3));
	}
	
	public static Long reverse(long a) {
		Long rev = 0L;
        while(a > 0){
            if((a & 1) == 1 ){
                rev = rev ^ 1;
                if(a != 1){              // this check is to avoid the lats bit of result  (left shift) 
                	rev = rev << 1;
                }
                
            }
            else{
                rev= rev << 1;
            }
            a = a >> 1;
            
        }
        return rev;
	}
}
