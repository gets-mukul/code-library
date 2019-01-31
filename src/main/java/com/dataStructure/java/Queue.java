package com.dataStructure.java;

import java.util.LinkedList;

public class Queue {

	LinkedList<Integer> queue = new LinkedList<Integer>();
	int last = 0;

	public void enQueue(int data) {
		queue.add(data);
		last++;
	}

	public void deQueue() {
		if(!queue.isEmpty()) {
		queue.removeFirst();
		last--;
		}
		else {
			System.out.println("Queue is empty");
		}
	}

	public int peek() {
		return queue.peek();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void show() {
		for (int i = 0; i < queue.size(); i++) {
			System.out.print(queue.get(i) + "->");
		}
		System.out.println();
	}

}
