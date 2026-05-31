import java.util.*;

class BFS {

    void bfs(List<List<Integer>> graph,
             int start) {

        boolean[] visited =
                new boolean[graph.size()];

        Queue<Integer> q =
                new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            for(int next :
                    graph.get(node)) {

                if(!visited[next]) {

                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
