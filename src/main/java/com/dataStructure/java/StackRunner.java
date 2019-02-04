package com.dataStructure.java;

import javax.swing.text.TabableView;

public class StackRunner {

	public static void main(String[] args) {

		StackOfPlates stack = new StackOfPlates();

		stack.push(12);
		stack.push(23);
		stack.push(56);
		stack.push(78);
		stack.push(88);
		
		stack.push(12);
		stack.push(23);
		stack.push(56);
		stack.push(78);
		stack.push(88);
		
		stack.show();
		
		System.out.println("--------------------------");

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.show();
	}
}
