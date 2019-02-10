package com.dataStructure.java;

import java.util.Scanner;

public class TripleStep {
public static int countWays(int n) {
	if(n < 0) {
		return 0;
	}
	else if(n == 0) {
		return 1;
	}
	else {
		return (countWays(n - 1) + countWays(n - 2) + countWays(n - 3));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of steps: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(countWays(n));

	}

}
