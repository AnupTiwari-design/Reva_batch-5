package graph;

import java.util.*;

public class Graph {
    int V; // number of vertices
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge to graph
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Remove this for directed graph
    }

    // Print adjacency list
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    // Breadth First Search
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS starting from node " + start + ": ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Depth First Search (Recursive)
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    void dfsUtil(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbor : adj.get(current)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
        g.BFS(0); // BFS from node 0
        g.DFS(0); // DFS from node 0
    }
}