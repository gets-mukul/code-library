/*
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.
Sum Lists: You have two numbers represented by
EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.
FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
EXAMPLE
lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
Output: 9 -> 1 -> 2. That is, 912.
 * */
package com.dataStructure.java;

public class SumOfNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList result = new LinkedList();
		int carry = 0;

		l1.insert(7);
		l1.insert(2);
		l1.insert(6);

		l2.insert(5);
		l2.insert(9);
		l2.insert(2);

		Node n1 = l1.head;
		Node n2 = l2.head;
		int sum = 0;
		
		while (n1 != null || n2 != null) {

			sum = n1.data + n2.data + carry;
			if (sum > 9) {
				result.insert(sum % 10);
				carry = sum / 10;
			} else {
				result.insert(sum);
				carry = 0;
			}
			n1 = n1.next;
			n2 = n2.next;
		}

		l1.show();
		System.out.println();
		l2.show();
		System.out.println();
		result.show();

	}

}
