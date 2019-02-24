package com.interviewBit;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetterPhone {

	public final static HashMap map = new HashMap();
	static {
		map.put("0", "0");
		map.put("1", "1");
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");

	}

	static ArrayList<String> result = new ArrayList<String>();

	public static ArrayList<String> letterCombination(String temp, String num) {
		System.out.print("Current temp value :" + temp);
		System.out.println();
		System.out.println();
		System.out.print("new num value : " + num);
		System.out.print("new num length : " + num.length());
		System.out.println();

		if (num.length() == 0) {
			result.add(temp);
			System.out.println("---");
			for(int i=0; i<result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			System.out.println("--");
			return null;
		} else {
			char currentChar = num.charAt(0);
			System.out.print("current start Character is : " + currentChar);
			System.out.println();
			String currentString = (String) map.get(Character.toString(currentChar));
			System.out.print("Current value for " + currentChar + " is " + currentString);
			System.out.println();

			for (int i = 0; i < currentString.length(); i++) {
				temp = temp + currentString.charAt(i);
				System.out.println("added temp value : " + temp);
				if (num.length() > 0) {
					letterCombination(temp, num.substring(1, num.length()));
				}
				temp = temp.substring(0, temp.length() - 1);
				System.out.print("removed temp value : " + temp);
				System.out.println();

			}
		}

		return result;
	}

	public static void main(String[] args) {

		String num = "23";
		String temp = "";

		letterCombination(temp, num);

		
	}

}
