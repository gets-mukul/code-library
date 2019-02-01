package com.dataStructure.java;

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWith2Stack queue = new QueueWith2Stack();

		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.enqueue(10);
		queue.enqueue(80);
		queue.enqueue(90);
		queue.enqueue(60);
		
		queue.show();
		
		queue.dequeue();
		queue.dequeue();
		queue.show();
		

	}
}
