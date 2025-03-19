package cat2;

import java.util.*;


public class bellman_ford_algo {
    static int[] bellmanFord(int V, int[][] edges, int src) {

        // Initially distance from source to all other vertices 
        // is not known(Infinite).
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e8);
        dist[src] = 0;

        // Relaxation of all the edges V times, not (V - 1) as we  
        // need one additional relaxation to detect negative cycle
        for (int i = 0; i < V; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {

                    // If this is the Vth relaxation, then there is
                    // a negative cycle
                    if (i == V - 1)
                        return new int[] { -1 };

                    // Update shortest distance to node v
                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for vertices and edges
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        int[][] edges = new int[E][3]; // Edge list

        System.out.println("Enter edges (format: u v weight): ");
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt(); // Start vertex
            edges[i][1] = sc.nextInt(); // End vertex
            edges[i][2] = sc.nextInt(); // Weight
        }

        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        int[] ans = bellmanFord(V, edges, src);
        for (int dist : ans)
            System.out.print(dist + " ");
    }
}

    

