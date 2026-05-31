public class Prim {

    public void primMST(int[][] graph) {

        int vertices = graph.length;

        boolean[] selected = new boolean[vertices];

        selected[0] = true;

        int edges = 0;

        System.out.println("Minimum Spanning Tree:");

        while (edges < vertices - 1) {

            int min = Integer.MAX_VALUE;
            int x = 0;
            int y = 0;

            for (int i = 0; i < vertices; i++) {

                if (selected[i]) {

                    for (int j = 0; j < vertices; j++) {

                        if (!selected[j]
                                && graph[i][j] != 0
                                && graph[i][j] < min) {

                            min = graph[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }

            System.out.println(
                    x + " - " + y + " : " + min);

            selected[y] = true;
            edges++;
        }
    }
}