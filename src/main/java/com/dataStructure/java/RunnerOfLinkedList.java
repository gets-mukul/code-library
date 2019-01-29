package com.dataStructure.java;

public class RunnerOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(3);
		list.insert(6);
		list.insert(2);
		list.insert(8);
		list.show();
		
		System.out.println();
		
		list.removeNthNode(5);
		
		list.show();
		

	}

}
