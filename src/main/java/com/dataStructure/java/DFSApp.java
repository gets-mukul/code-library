package com.dataStructure.java;

import java.nio.file.WatchService;
import java.util.Stack;

class GraphAdjMat {

	final int MAX_VERTS = 20;
	Vertices vertixlist[];
	int adjMat[][];
	int num_of_vertx;
	Stack<Integer> stack;

	public GraphAdjMat() {
		vertixlist = new Vertices[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		num_of_vertx = 0;
		stack = new Stack<Integer>();
	}

	public void addVertex(char label) {
		vertixlist[num_of_vertx++] = new Vertices(label);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void showVertex(int v) {
		System.out.println(vertixlist[v].label + " ");
	}

	public int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < num_of_vertx; j++) {
			if (adjMat[v][j] == 1 && vertixlist[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public void dfs() {
		vertixlist[0].wasVisited = true;
		showVertex(0);
		stack.push(0);
		while (!stack.isEmpty()) {
			int v = getAdjUnvisitedVertex(stack.peek());

			if (v == -1) {
				stack.pop();
			} else {
				vertixlist[v].wasVisited = true;
				showVertex(v);
				stack.push(v);
			}
		}
	}
}

class Vertices {
	public char label;
	public boolean wasVisited;

	public Vertices(char lab) {
		label = lab;
		wasVisited = false;
	}
}

public class DFSApp {
	public static void main(String[] args) {
		GraphAdjMat graph = new GraphAdjMat();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 5);
		graph.addEdge(1, 3);

		System.out.println("Visits: ");
		graph.dfs();

	}
}
