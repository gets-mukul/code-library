/*
 * String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
  */

package com.dataStructure.java;

import java.util.Scanner;

public class StringCompression {

	static String stringCompression(String str) {
		
		String result = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				result = result + str.charAt(i) + count;
				count = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = sc.nextLine();
		System.out.println(stringCompression(str));
	}

}
