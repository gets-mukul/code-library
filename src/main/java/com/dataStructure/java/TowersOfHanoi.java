package com.dataStructure.java;

import java.util.Stack;

class Tower {
	Stack<Integer> disks;
	int index;

	Tower(int i) {
		disks = new Stack<>();
		index = i;
	}

	public int index() {
		return index;
	}

	public void add(int d) {
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk" + d);
		} else {
			disks.push(d);
		}
	}

	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if(n >0) {
			moveDisks(n-1,buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this	);
		}
	}
	
	public void  moveDisks(int n, Tower origin, Tower destination, Tower buffer) {
		if(n <= 0) {
			return ;
		}
		moveDisks(n-1, origin, buffer, destination);
//		moveTop(origin, destination);
		moveDisks(n-1, buffer, destination, origin);
		
	}

}

public class TowersOfHanoi {

}
