package com.dataStructure.java;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
	int adjMat[][];
	int num_of_vertices;
	Queue<Integer> queue;
	Vertex vertlist[];
	int MAX_VERT = 20;

	public Graph() {
		vertlist = new Vertex[MAX_VERT];
		adjMat = new int[MAX_VERT][MAX_VERT];
		num_of_vertices = 0;
		queue = new LinkedList<Integer>();
	}

	public void addVertex(char lab) {
		vertlist[num_of_vertices++] = new Vertex(lab);
	}
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void showVertex(int v) {
		System.out.println(vertlist[v].label + " ");
	}
	public int getAdjUnvisitedVerts(int v) {
		for(int j=0; j<num_of_vertices; j++) {
			if(adjMat[v][j] == 1 && vertlist[j].wasVisited == false) {
				return j;
			}
		}
		
		return -1;
	}
	
	public void bfs() {
		vertlist[0].wasVisited = true;
		showVertex(0);
		queue.add(0);
		int v2;
		
		while(!queue.isEmpty()) {
			int v1 = queue.remove();
			while((v2=getAdjUnvisitedVerts(v1)) != -1) {
				vertlist[v2].wasVisited = true;
				showVertex(v2);
				queue.add(v2);
			}
		}
		
	}

}

class Vertex {
	boolean wasVisited;
	char label;

	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}

}

public class BFSApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
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
		graph.bfs();
	}

}
