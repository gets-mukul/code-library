package com.dataStructure.java;

import java.util.HashMap;

public class RemoveDuplicateNodes {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(4);
		list.insert(6);
		list.insert(4);
		list.insert(7);
		list.insert(6);
		list.insert(9);
		list.insert(2);

		list.show();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		Node n = list.head;

		while (n != null) {
			if (map.containsKey(n.data)) {
				list.removeNode(n.data);

			} else {
				map.put(n.data, 1);
			}
			n = n.next;
		}

		System.out.println();
		list.show();
	}
}
