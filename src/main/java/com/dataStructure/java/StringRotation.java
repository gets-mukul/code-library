/*String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring
of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").*/

package com.dataStructure.java;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter rotated string: ");
		String s2 = sc.nextLine();
		
		s2 = s2.concat(s2);
		
		System.out.println(s2.contains(s1));
		
	}

	

}
