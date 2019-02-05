package com.dataStructure.java;

import java.util.Scanner;

public class GraphRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of vertices and number of Edges: ");
		int num_of_vertices = sc.nextInt();
		int num_of_edges = sc.nextInt();
		GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(num_of_vertices);

		
		// connecting the nodes with edges
		for (int i = 1; i <= num_of_edges; i++) {
			System.out.print("Enter the source and destination of the node: ");
			int source = sc.nextInt();
			int des = sc.nextInt();
			graph.addEdge(source, des);
			System.out.println();
		}
		
		

		// printing the graph
		graph.show(num_of_vertices);

	}
}
