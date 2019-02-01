
/*Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linkedlist data structure.
 * */
package com.dataStructure.java;

import java.util.Scanner;

public class AnimalShelter {

	public static void main(String[] args) {

		Queue queue = new Queue();

		int cat = 0;
		int dog = 1;

		queue.enQueue(dog);
		queue.enQueue(cat);
		queue.enQueue(dog);
		queue.enQueue(cat);
		queue.enQueue(dog);
		queue.enQueue(cat);
		queue.enQueue(dog);
		queue.enQueue(dog);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter choice of animal: ");
		String choice = sc.nextLine();
		
		queue.show();
		
		//return the oldest animal when customer asked for any type of animal
		if (choice.equalsIgnoreCase("any")) {
			System.out.println(queue.peek());
		}
		else if(choice.equalsIgnoreCase("dog")) {
			
			while(queue.peek() != dog) {
				queue.deQueue();
			}
			System.out.println(queue.peek());
		}
		else if(choice.equalsIgnoreCase("cat")) {
			 
			while(queue.peek() != cat) {
				queue.deQueue();
			}
			System.out.println(queue.peek());
		}
		
		queue.show();

	}

}
