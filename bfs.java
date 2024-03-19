import java.util.*;

public class bfs {

    // Function to perform Breadth First Search
    public static void BFS(int[][] graph, int start) {
        int vertices = graph.length;
        boolean[] visited = new boolean[vertices];
        
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();
        
        // Mark the current node as visited and enqueue it
        visited[start] = true;
        queue.add(start);
        
        while (queue.size() != 0) {
            // Dequeue a vertex from the queue and print it
            start = queue.poll();
            System.out.print(start + " ");
            
            // Get all adjacent vertices of the dequeued vertex
            // If an adjacent vertex has not been visited, mark it visited and enqueue it
            for (int i = 0; i < vertices; i++) {
                if (graph[start][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };
        
        System.out.println("Breadth First Traversal (starting from vertex 0):");
        BFS(graph, 0);
    }
}

// ```

// In this code:

// - We represent the graph as an adjacency matrix where `graph[i][j]` indicates whether there is an edge between vertex `i` and vertex `j`.
// - The `BFS` method performs the Breadth-First Search traversal starting from the specified vertex.
// - We use a boolean array `visited` to keep track of visited vertices to avoid revisiting them.
// - We use a `LinkedList` as a queue to implement the BFS algorithm.
// - The `main` method creates an example graph and demonstrates BFS traversal starting from vertex 0.