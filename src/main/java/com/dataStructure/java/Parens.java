package com.dataStructure.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parens {

	public static Set<String> getParens(int remaining) {
		Set<String> set = new HashSet<String>();

		if (remaining == 0) {
			set.add("");
		} else {
			Set<String> prev = getParens(remaining - 1);
			for (String str : prev) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()" + str);
			}
		}
		return set;
	}

	public static String insertInside(String str, int leftIndex) {
		String left = str.substring(0, leftIndex + 1);
		String right = str.substring(leftIndex + 1, str.length());
		return left + "()" + right;
	}

	public static void ssort() {
		List<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		{
			ArrayList<Integer> temp = new ArrayList();
			result.add(temp);
		}
{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(1);
	result.add(temp);	
		}
{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(1);
	temp.add(2);
	result.add(temp);	
}{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(1);
	temp.add(2);
	temp.add(3);
	result.add(temp);
}
{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(2);
	temp.add(3);
	result.add(temp);
}

{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(1);
	temp.add(3);
	result.add(temp);
}{
	ArrayList<Integer> temp = new ArrayList();
	///temp.add(1);
	temp.add(2);
	result.add(temp);
}{
	ArrayList<Integer> temp = new ArrayList();
	temp.add(3);
	result.add(temp);
}
		Collections.sort(result,new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
              int i=0;
              int sofar= 0;
              while(i<list1.size() && i<list2.size()){
                   sofar = list1.get(i)-list2.get(i);
                   if(sofar !=0){
                       return sofar;
                   }
                   i++;
              }
              if(list1.size()>list2.size()){
                  return 1;
              }
              else{
                  return -1;
              }
              
            }
        });
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ssort();
		
	}

}
