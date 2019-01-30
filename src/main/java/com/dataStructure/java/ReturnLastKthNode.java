//Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.

package com.dataStructure.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReturnLastKthNode {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(4);
		list.insert(8);
		list.insert(3);
		list.insert(7);
		list.insert(6);
		list.insert(9);
		list.insert(2);
		
		list.show();
		
		System.out.println();
		
		System.out.print("Enter the value of K: ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Node first = list.head;
		Node second = list.head;
		
		while(k != 1) {
			
			second = second.next;
			if(second == null) {
				break;
			}
			k--;
		}
		if(second == null) {
			System.out.println("K is grater than size of LinkedList");
		}else {
			while(second.next != null) {
				first = first.next;
				second = second.next;
			}
			System.out.println(first.data);

		}

	}

}
