package com.dataStructure.java;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {

	}

}

class Vertex {
	char label;
	boolean visited;
	
	Vertex(char lab){
		label = lab;
		visited = false;
	}
}


class Graph {
	private final int max_vertex = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int n;
	private Queue<Integer> q;

	public Graph() {
		vertexList = new Vertex[max_vertex];
		adjMat = new int[max_vertex][max_vertex];
		n = 0;
		q = new LinkedList<Integer>();

	}
	
	public void addVertex(char lab){
		vertexList[n++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
}
