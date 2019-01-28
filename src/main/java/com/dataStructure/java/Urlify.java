/*
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE

Input: "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
*/
package com.dataStructure.java;

import java.util.Scanner;

public class Urlify {

	static StringBuffer urlify(String str, Integer size) {
		StringBuffer result = new StringBuffer("");
		for (int i = 0; i < size; i++) {
			if (str.charAt(i) == ' ') {
				result.append("%20");
			} else {
				result.append(str.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		System.out.print("Enter the actual size of string: ");
		int size = sc.nextInt();

		System.out.println("URLify: "+urlify(str, size));

	}

}
