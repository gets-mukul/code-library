// Implementation of stack using Linked List 

package com.dataStructure.java;

import java.util.LinkedList;

public class Stack {

	LinkedList<Integer> list = new LinkedList<Integer>();
	int top = -1;

	public void push(int data) {
		list.add(data);
		top++;
	}

	public void pop() {
		if (top >= 0) {
			list.removeLast();
			top--;
		} else {
			System.out.println("Stack Underflow");
		}
	}

	public int peek() {
		return list.get(list.size() - 1);
	}

	public void show() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "->");
		}
		System.out.println();
	}
}
