package com.interviewBit;

import java.util.ArrayList;

public class Combinations {
	public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	public static void combination(int num, int k, int n) {
		ArrayList<Integer> comb = new ArrayList<Integer>();
		comb.add(num);
		
		for(int i=1; i<=n; i++) {
			if(num > n) {
				return;
			}
			if(num != i) {
				comb.add(i);
			}
			if(comb.size() == k) {
				System.out.println("comb : "+comb);
				ArrayList<Integer> temp = new ArrayList<Integer>(comb);
				result.add(temp);
				comb.remove(comb.size()-1);
			}
		}
		
		combination(num+1, k, n);
	}
	public static void main(String[] args) {
		
		int n=3, k=3;
		 combination(1,k,n);
		 
		 System.out.println(result);
	}

}
