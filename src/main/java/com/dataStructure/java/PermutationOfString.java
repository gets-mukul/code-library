/*Check if the two strings have identical character counts.*/
package com.dataStructure.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PermutationOfString {
	
	static Boolean checkPermutationFaster(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		 char temp1[] = str1.toCharArray();
		 char temp2[] = str2.toCharArray();
		 
		 Arrays.sort(temp1);
		 Arrays.sort(temp2);
		 
		 for(int i=0; i<temp1.length; i++) {
			 if(temp1[i] != temp2[i]) {
				 System.out.println("22");
				 return false;
			 }
		 }
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string");
		System.out.print("String one: ");
		String str1 = sc.nextLine();
		System.out.println();
		System.out.print("String two: ");
		String str2 = sc.nextLine();
		
		System.out.println(checkPermutationFaster(str1, str2));
	}

}
