package com.dataStructure.java;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		
		queue.enQueue(23);
		queue.enQueue(33);
		queue.enQueue(45);
		
		queue.deQueue();
		
		System.out.println(queue.peek());
		
	}
}
		
