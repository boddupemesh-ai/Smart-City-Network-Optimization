import java.util.*;

class DFS {

    void dfs(List<List<Integer>> graph,
             int node,
             boolean[] visited) {

        visited[node] = true;

        System.out.print(node + " ");

        for(int next :
                graph.get(node)) {

            if(!visited[next])
                dfs(graph,
                        next,
                        visited);
        }
    }
}