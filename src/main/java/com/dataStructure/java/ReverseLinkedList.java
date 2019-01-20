/*
Reverse a linked list
Given pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing links between nodes.

Examples:

Input : Head of following linked list  
       1->2->3->4->NULL
Output : Linked list should be changed to,
       4->3->2->1->NULL

Input : Head of following linked list  
       1->2->3->4->5->NULL
Output : Linked list should be changed to,
       5->4->3->2->1->NULL

Input : NULL
Output : NULL

Input  : 1->NULL
Output : 1->NULL
*/



package com.dataStructure.java;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(2);
		ll.add(1);
		ll.add(7);
		ll.add(4);
		ll.add(9);
		
		reverseList(ll);
	}

	private static void reverseList(LinkedList<Integer> ll) {
		// TODO Auto-generated method stub
		System.out.print("Original Linked List:");
		System.out.println(ll);
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		while(!ll.isEmpty()) {
			result.add(ll.pollLast());
		}
		
		System.out.print("Reversed Linked List:");
		System.out.println(result);
	}

}
