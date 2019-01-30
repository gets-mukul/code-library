package com.dataStructure.java;

import java.util.Scanner;

public class PartitionOfList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(3);
		list.insert(2);
		list.insert(8);
		list.insert(5);
		list.insert(10);
		list.insert(2);
		list.insert(1);

		list.show();

		System.out.println();

		System.out.print("Enter partetion value P: ");

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		LinkedList small = new LinkedList();
		LinkedList large = new LinkedList();

		Node n = list.head;

		while (n != null) {
			if (n.data < p) {
				small.insert(n.data);
			} else {
				large.insert(n.data);
			}
			n = n.next;
		}

		Node temp = small.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = large.head;
		small.show();
	}
}
