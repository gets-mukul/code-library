package com.dataStructure.java;

import java.util.Scanner;

public class GraphAdjacencyMatrix {

	int vertices;
	int adjMat[][];

	public GraphAdjacencyMatrix(int v) {
		vertices = v;
		adjMat = new int[vertices][vertices];
	}

	public void addEdge(int v, int w) {
		if (v > adjMat.length || w > adjMat.length) {
			return;
		}
		adjMat[v][w] = 1;
		adjMat[w][v] = 1;
	}

	public void getNeighbour(int v) {
		if (v > adjMat.length) {
			return;
		} else {
			for (int i = 0; i < vertices; i++) {
				if (adjMat[v][i] == 1) {
					System.out.print(i + "->");
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of vertices and number of Edges: ");
		int num_of_vertices = sc.nextInt();
		int num_of_edges = sc.nextInt();
		GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(num_of_vertices);

		for (int i = 1; i <= num_of_edges; i++) {
			System.out.print("Enter the source and destination of the node: ");
			int source = sc.nextInt();
			int des = sc.nextInt();
			graph.addEdge(source, des);
			System.out.println();
		}
		
		for(int i=0; i<num_of_vertices; i++) {
			System.out.print(i+"-->");
			for(int j=0; j<num_of_vertices; j++) {
				if(graph.adjMat[i][j] == 1) {
					System.out.print(j+",");
				}
			}
			System.out.println();
		}

	}

}
