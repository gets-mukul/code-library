package com.dataStructure.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphAdjacencyList {
	HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();

	public GraphAdjacencyList(int verices) {
		for (int i = 1; i <= verices; i++) {
			ArrayList<Integer> neighbours = new ArrayList<Integer>();
			neighbours.add(23);
			adjList.put(i, neighbours);
		}
	}

	public void addEdge(int v, int w) {
		if (v > adjList.size() || w > adjList.size()) {
			return;
		}
		(adjList.get(v)).add(w);
		(adjList.get(w)).add(v);
	}

	public ArrayList<Integer> getNeighbour(int v) {
		if (v > adjList.size()) {
			return null;
		} else {

			return (ArrayList<Integer>) adjList.get(v);
		}
	}

	public static void main(String[] args) {
		int count = 1, source, dest;
		System.out.print("Enter the number of vertices and edges: ");
		Scanner sc = new Scanner(System.in);
		int num_of_vertices = sc.nextInt();
		int num_of_edges = sc.nextInt();

		GraphAdjacencyList adjlist = new GraphAdjacencyList(num_of_vertices);

		System.out.println("Enter the edges in format <source> <destination>");

		while (count <= num_of_edges) {
			source = sc.nextInt();
			dest = sc.nextInt();
			adjlist.addEdge(source, dest);
			count++;
		}
		System.out.println("The given adjacency list for the graph");

		for (int i = 1; i <= num_of_vertices; i++) {
			System.out.println(i + "->");
			ArrayList<Integer> edgeList = adjlist.getNeighbour(i);
			for (int j = 1;; j++) {
				if (j != edgeList.size()) {
					System.out.println(edgeList.get(j - 1) + " ->");
				} else {
					System.out.println(edgeList.get(j - 1));
					break;
				}
			}
			System.out.println();
		}

	}
}
