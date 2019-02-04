package com.dataStructure.java;

import java.util.ArrayList;

public class StackOfPlates {

	ArrayList<Stack> array_of_stack = new ArrayList<Stack>();
	int max_size = 4;

	public void push(int data) {
		boolean stackAvailable = false;
		// if array does not contain any of the stack
		if (array_of_stack.isEmpty()) {
			array_of_stack.add(new Stack());
		}

		for (int i = 0; i < array_of_stack.size(); i++) {
			if (array_of_stack.get(i).top != max_size) {
				array_of_stack.get(i).push(data);

				break;
			}
		}

		// checking for the availability of the stack
		for (int i = 0; i < array_of_stack.size(); i++) {
			if (array_of_stack.get(i).top != max_size) {
				stackAvailable = true;

				break;
			}

			// only when array have one stack and that is also full
			if (array_of_stack.size() == 1 && array_of_stack.get(0).top == max_size) {
				stackAvailable = false;

				break;
			}
		}

		if (!stackAvailable) {
			// create new stack at the next index of array
			array_of_stack.add(array_of_stack.size(), new Stack());

		}

	}

	public void pop() {

		
		if (array_of_stack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			for(int i=0; i<array_of_stack.size(); i++) {
				
			}
		}
	}

	public void show() {
		for (Stack x : array_of_stack) {
			x.show();
			System.out.println();
		}
	}
}
