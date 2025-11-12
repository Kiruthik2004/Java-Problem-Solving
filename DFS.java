import java.util.*;
class Graph {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    Graph(int vertex) {
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
    void dfsUtil(int x, boolean[] visited) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int i : graph.get(x)) {
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    void dfs(int x) {
        boolean[] visited = new boolean[graph.size()];
        dfsUtil(x, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        g.dfs(0);
    }
}
