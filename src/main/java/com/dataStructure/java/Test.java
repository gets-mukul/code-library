package com.dataStructure.java;

public class Test {
	
	public static void getAlternateValue(int[] arr, int index) {
		//check if the value of index is out of arraybound 
		
		if(index >= arr.length) {
			//if index is out of bound then return
			return;
		}
		
		//print the current value of index
		System.out.println(arr[index]);
		
		//recursive call for a alternate index
		getAlternateValue(arr, index + 2);
	}

	public static void main(String[] args) {
		
		// int array with 5 elements
		int[] arr = new int[] {1,2,3,4,5};
		
		//method which print alternate values from array starts with 0th index
		getAlternateValue(arr, 0);

	}

}
