import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        int[][] horizontal1 = {
                {1,1,1,1,1},
                {0,1,1,0,0},
                {1,1,1,1,0},
                {0,1,0,0,1},
                {1,0,0,0,0},
                {1,1,1,1,1}
        };

        int[][] vertical1 = {
                {1,1,0,0,0,1},
                {1,1,0,0,1,1},
                {1,0,0,1,0,1},
                {1,0,1,1,1,1},
                {1,0,1,0,0,1},
        };


        int[][] horizontal2 = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,0,0,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0},
                {0,0,1,0,0,1,1,0,1,0,0,1,0,0,0,0,0,1,0,0},
                {0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,1,0,0,1,1},
                {1,1,0,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0},
                {0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,0,0,0},
                {1,0,0,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0},
                {0,1,0,0,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,0},
                {1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,1,0,0,1,0},
                {0,1,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,0,0,0},
                {0,1,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,0,0,0},
                {1,0,0,0,0,1,0,0,1,1,0,1,1,0,1,1,1,1,1,0},
                {1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1},
                {0,0,0,1,0,1,1,1,1,0,1,1,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,0,0,0},
                {0,0,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1,0,0},
                {0,0,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1,0,0},
                {0,1,0,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0},
                {0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,1,1,0,0},
                {1,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,1,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };

        int[][] vertical2 = {
                {1,0,0,0,1,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,1},
                {1,1,0,1,1,1,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1},
                {1,1,0,0,1,1,0,0,1,0,1,1,0,1,1,1,0,1,0,1,1},
                {1,0,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,0,1},
                {1,0,1,0,0,0,1,1,1,0,1,0,0,0,0,1,1,1,1,1,1},
                {1,0,1,0,1,0,1,1,0,0,1,0,1,0,0,0,1,0,1,0,1},
                {1,0,1,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,1},
                {1,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,0,1},
                {1,0,1,0,1,1,1,0,1,0,0,1,0,0,1,0,0,1,1,1,1},
                {1,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,1,0,1,1,1},
                {1,0,1,0,1,0,1,1,0,1,0,0,0,1,1,0,0,1,0,1,1},
                {1,0,1,1,1,1,0,1,1,0,0,1,0,1,1,0,0,0,1,0,1},
                {1,0,1,1,1,1,0,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
                {1,1,1,1,0,1,0,0,1,0,1,1,0,1,0,1,0,0,1,1,1},
                {1,1,1,0,1,0,0,1,0,0,1,1,0,1,0,0,0,1,1,1,1},
                {1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1},
                {1,0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,1,0,1,1},
                {1,1,1,0,1,1,0,1,1,1,0,0,1,0,1,0,0,0,1,1,1},
                {1,0,1,0,1,0,1,1,1,0,1,0,0,1,0,0,0,1,0,1,1},
                {1,0,1,0,1,0,1,1,1,0,1,0,0,1,0,0,0,1,0,1,1}
        };


        int[][] vertical3 = {
                {1,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1},
                {1,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1},
                {1,1,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1},
                {1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,0,1,0,0,0,1},
                {1,1,1,0,1,1,0,1,1,0,0,0,1,1,0,1,0,1,0,1,1},
                {1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1},
                {1,1,0,1,0,1,0,1,1,0,1,0,0,0,0,1,1,1,1,0,1},
                {1,1,1,1,1,0,1,0,1,1,0,0,0,0,1,1,0,1,0,1,1},
                {1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,0,1,0,1},
                {1,1,0,1,1,0,0,1,1,1,1,1,0,1,1,0,1,1,0,0,1},
                {1,0,0,1,0,1,0,0,1,1,0,1,1,0,0,0,1,1,0,0,1},
                {1,1,1,0,1,1,0,1,0,1,1,0,1,0,0,0,0,1,1,0,1},
                {1,1,0,1,1,0,0,1,0,1,1,1,1,0,1,1,0,0,1,0,1},
                {1,1,1,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,0,1},
                {1,1,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1},
                {1,0,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,1},
                {1,0,0,1,0,1,1,0,0,0,1,1,1,1,0,1,0,1,0,1,1},
                {1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1},
                {1,0,0,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1},
                {1,0,0,0,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1},


        };

        int[][] horizontal3 = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,0,0,0,0},
                {0,0,0,1,0,1,0,1,1,0,1,0,1,1,0,1,1,0,0,0},
                {0,1,1,0,0,0,1,0,0,1,0,1,0,0,1,0,1,1,1,0},
                {0,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,1,0},
                {0,0,1,1,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,0},
                {0,1,0,0,1,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1},
                {0,0,0,1,0,0,0,1,0,1,1,1,1,1,0,1,0,0,1,0},
                {0,1,0,0,1,1,1,0,0,0,1,1,0,1,0,0,1,1,1,0},
                {1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
                {0,1,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,1,1,1},
                {0,0,1,0,0,0,1,1,0,0,1,1,0,1,1,1,0,0,1,0},
                {0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,1,1,0,0,1},
                {0,0,1,0,1,1,1,0,0,1,0,0,1,0,0,0,1,1,1,0},
                {0,0,1,1,0,1,0,0,1,1,1,1,0,1,1,1,0,0,1,0},
                {0,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,0,0},
                {0,1,1,0,0,1,1,1,1,1,0,1,0,1,0,1,1,1,0,0},
                {0,1,0,1,1,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0},
                {1,1,1,1,0,0,1,1,0,0,1,0,1,1,0,1,1,1,0,0},
                {0,1,1,1,1,0,0,0,0,0,1,1,1,0,1,0,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };





        // ######## TEST 1 ########

        System.out.println("######## RUNNING TEST CASE 1 ########\n\n");

        Graph graph1 = new Graph(5,5);
        graph1.generate(horizontal1, vertical1);


        graph1.display();

        ArrayList<GraphNode> path;

        path = DFSSolver.solve(graph1);

        System.out.println("Length of the path (DFS Generated): " + path.size());

        Graph.displayPath(path);

        path = BFSSolver.solve(graph1);

        System.out.println("Length of the path (BFS Generated): " + path.size());

        Graph.displayPath(path);

        // ######## TEST 2 ########


        System.out.println("######## RUNNING TEST CASE 2 ########\n\n");

        Graph graph2 = new Graph(20,20);
        graph2.generate(horizontal2, vertical2);


        graph2.display();

        path = DFSSolver.solve(graph2);

        System.out.println("Length of the path (DFS Generated): " + path.size());

        Graph.displayPath(path);

        path = BFSSolver.solve(graph2);

        System.out.println("Length of the path (BFS Generated): " + path.size());

        Graph.displayPath(path);

        // ######## TEST 3 ########


        System.out.println("######## RUNNING TEST CASE 2 ########\n\n");

        Graph graph3 = new Graph(20,20);
        graph3.generate(horizontal3, vertical3);


        graph3.display();

        path = DFSSolver.solve(graph3);

        System.out.println("Length of the path (DFS Generated): " + path.size());

        Graph.displayPath(path);

        path = BFSSolver.solve(graph3);

        System.out.println("Length of the path (BFS Generated): " + path.size());

        Graph.displayPath(path);


    }
}
