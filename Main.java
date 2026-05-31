import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Segment Tree
        int[] traffic = {10,20,30,40,50};

        SegmentTree st = new SegmentTree(traffic);

        System.out.println("Traffic Sum (1-3): "
                + st.query(0,0,4,1,3));

        // Fenwick Tree
        FenwickTree ft = new FenwickTree(5);

        ft.update(1,10);
        ft.update(2,20);

        System.out.println("Prefix Sum: "
                + ft.query(2));

        // Graph for BFS and DFS
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<5;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        // BFS
        System.out.println("\nBFS Traversal:");
        BFS bfs = new BFS();
        bfs.bfs(graph,0);

        // DFS
        System.out.println("\n\nDFS Traversal:");
        DFS dfs = new DFS();
        dfs.dfs(graph,0,new boolean[5]);

        // Prim
        int[][] mstGraph = {
                {0,2,0,6},
                {2,0,3,8},
                {0,3,0,4},
                {6,8,4,0}
        };

        System.out.println("\n\nMinimum Spanning Tree:");

        Prim prim = new Prim();
        prim.primMST(mstGraph);

        System.out.println(
                "\nRoad Network Analysis Completed");
    }
}
