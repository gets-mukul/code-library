package com.dataStructure.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PowerSet {
	
	public static ArrayList<ArrayList<Integer>> getSubet(ArrayList<Integer> set, int index){
		
		ArrayList<ArrayList<Integer>> allSubset;
		
		if(set.size() == index) {
			allSubset = new ArrayList<ArrayList<Integer>>();
			allSubset.add(new ArrayList<Integer>());
		}
		else {
			allSubset = getSubet(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset : allSubset) {
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(item);
				moreSubset.add(newSubset);
			}
			allSubset.addAll(moreSubset);
		}
		
		return allSubset;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		ArrayList<ArrayList<Integer>> allSubset = getSubet(set, 0);
		
		for(int j=0; j<allSubset.size(); j++) {
			for(int i=0; i<allSubset.get(j).size(); i++) {
				System.out.print(allSubset.get(j).get(i) + " ");
			}
			System.out.println();
		}
		

	}

}
