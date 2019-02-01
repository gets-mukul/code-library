package com.dataStructure.java;

public class SortStack {

	public static Stack sort(Stack stack) {

		Stack result = new Stack();
		int max = 0;

		for (int i = stack.top; i > 0; i--) {
			max = 0;

			while (!stack.isEmpty()) {
				int data = stack.peek();
				if (max < data) {
					max = data;
				}
				result.push(data);
				stack.pop();
			}

			int x = i;

			while (x >= 0) {
				int data = result.peek();
				if (data == max) {
					result.pop();
				} else {
					stack.push(data);
					result.pop();
				}
				x--;
			}
			result.push(max);

		}
		result.push(stack.peek());
		
		

		return result;
	}

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(8);
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(5);
		stack.push(10);
		stack.push(3);
		stack.push(6);
		stack.push(4);
		stack.push(9);

		stack.show();

		sort(stack).show();

	}

}
