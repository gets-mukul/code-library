// Implement queue with two stack

package com.dataStructure.java;

public class QueueWith2Stack {

	Stack s1 = new Stack();
	Stack s2 = new Stack();

	public void enqueue(int data) {
		s1.push(data);
	}

	public void dequeue() {
		if (s1.isEmpty()) {
			System.out.println("Queue is already empty");
		} else {

			while (!s1.isEmpty()) {
				s2.push(s1.peek());
				s1.pop();
			}

			int data = s2.peek();
			s2.pop();

			while (!s2.isEmpty()) {
				s1.push(s2.peek());
				s2.pop();
			}
		}
	}

	public void show() {
		s1.show();

	}

}
