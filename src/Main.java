import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // you can insert your custom maze below

        int[][] horizontalWalls = {


        };

        int[][] verticalWalls = {


        };

        if ((horizontalWalls.length == 0) || (verticalWalls.length == 0)) {
            System.err.println("Please insert array representation of the maze into the source code, then compile and run the code.");
            return;
        }


        Graph maze = new Graph(horizontalWalls.length-1, verticalWalls.length);

        maze.generate(horizontalWalls, verticalWalls);

        maze.display();

        ArrayList<GraphNode> pathToSolution;

        pathToSolution = DFSSolver.solve(maze);

        System.out.println("Length of the path to the solution (DFS Generated): " + pathToSolution.size());

        Graph.displayPath(pathToSolution);

        pathToSolution = BFSSolver.solve(maze);

        System.out.println("Length of the path to the solution (BFS Generated): " + pathToSolution.size());

        Graph.displayPath(pathToSolution);


    }




}
