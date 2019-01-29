
/*One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
->
pales, pale -> true
pale, bale ->true
pale, bake ->false
pale, ple ->true

*/

package com.dataStructure.java;

import java.util.Scanner;

public class OneWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter another string: ");
		String str2 = sc.nextLine();
		
		boolean update = true;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)!= str2.charAt(i)) {
				if(update = false) {
					break;
				}
				update = false;
			}
		}
		

	}

}
