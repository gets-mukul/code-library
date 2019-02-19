package com.leetcode;

public class StudentAttendenceRecord {
	static int absent = 0;
	static boolean present = false;
	public static boolean checkRecord(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'P') {
				present = true;
			}
			if (str.charAt(i) == 'A') {
				absent++;
			} else if (str.charAt(i) == 'L' && (i + 3) <= str.length()) {
				if (str.charAt(i) == 'L' && str.charAt(i + 1) == 'L' && str.charAt(i + 2) == 'L') {
					return false;
				}
			}
			if (absent > 2 ) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkRecord("ALL"));
	}

}
