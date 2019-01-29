package com.dataStructure.java;

public class LinkedList {

	Node head;

// insert node at the end of the list with the given data by the user
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	// display all the node of the linked list
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
	}

	// inserting node t any particular location
	public void insertAt(int location, int data) {
		Node node = new Node();
		node.data = data;

		if (head == null || location <= 0) {
			head = node;
		} else {
			location = location - 1;
			Node n = head;
			while (location != 1) {
				n = n.next;
				location--;
			}
			Node temp = n.next;
			n.next = node;
			node.next = temp;
		}
	}

	// remove the particular node containing the data given by the user
	public void removeNode(int data) {
		Node n = new Node();

		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			if (head.data == data) {
				head = head.next;
			} else {
				n = head;
				while (n.next.data != data) {
					n = n.next;
				}

				n.next = n.next.next;

			}
		}
	}

	// remove nth location node from the linked list
	public void removeNthNode(int location) {
		Node n = new Node();

		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			if (location == 1) {
				head = head.next;
			} else {
				location = location - 1;
				n = head;
				while (location != 1) {
					n = n.next;
					location--;
				}

				n.next = n.next.next;
			}
		}
	}
}
