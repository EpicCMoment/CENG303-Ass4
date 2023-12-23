import java.util.ArrayList;

public class Graph {

    //Saves the location of nodes in the graph.
    private final GraphNode[][] mazeGraph;

    //Acts as a root of a graph because it stores the neighboring nodes in itself.
    private GraphNode startNode;

    //Shows the location of the end of the maze.
    private GraphNode finishNode;

    public Graph(int height, int width){
        this.mazeGraph = new GraphNode[height][width];
    }

    public GraphNode getStartNode() {
        return startNode;
    }

    public GraphNode getFinishNode() {
        return finishNode;
    }
    public void generate(int[][] horizontal, int[][] vertical){

        int xposNode1;
        int xposNode2;
        int yposNode1;
        int yposNode2;

        //Counts the elements in the arrays
        int counter =  horizontal[0].length;

        //Traversal of horizontal array

        //Traverses from 1st row to penultimate row since 0th and last row show the frame of maze.
        for(int i = 1; i < horizontal.length - 1; i++){

            for(int j = 0; j < horizontal[0].length; j++){

                //Shows that there is a vertical way to connect nodes.
                if(horizontal[i][j] == 0){

                    //Saves possible positions for nodes that will be under each other.
                    xposNode1 = counter / horizontal[0].length - 1;
                    yposNode1 = counter % horizontal[0].length;

                    xposNode2 = xposNode1 + 1;


                    //Checks only upper position. Lower position is already null because it traverses from up to down.
                    if(mazeGraph[xposNode1][yposNode1] == null){

                        //Creates two new nodes since both the positions are free.
                        GraphNode newNode1 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode1, yposNode1);
                        GraphNode newNode2 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode2, yposNode1);

                        addEdge(newNode1, newNode2);

                        mazeGraph[xposNode1][yposNode1] = newNode1;
                        mazeGraph[xposNode2][yposNode1] = newNode2;
                    }

                    else{

                        //Creates a new node for lower position since the upper node exists.
                        GraphNode existentNode = mazeGraph[xposNode1][yposNode1];
                        GraphNode newNode2 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode2, yposNode1);

                        addEdge(existentNode, newNode2);

                        mazeGraph[xposNode2][yposNode1] = newNode2;
                    }
                }

                counter++;
            }
        }

        //Traversal of vertical array

        counter = 1;

        for(int i = 0; i < vertical.length; i++){

            //Traverses from 1st column to penultimate column since 0th and last columns show the frame of maze.
            for(int j = 1; j < vertical[0].length - 1; j++){

                //Shows that there is a horizontal way to connect nodes
                if(vertical[i][j] == 0){

                    //Saves possible positions for nodes that will be next to each other.
                    xposNode1 = counter / vertical[0].length;
                    yposNode1 = counter % vertical[0].length - 1;

                    yposNode2 = yposNode1 + 1;

                    if(mazeGraph[xposNode1][yposNode1] != null && mazeGraph[xposNode1][yposNode2] == null){

                        //Creates a new node for right position since the left node exists.
                        GraphNode existentNode = mazeGraph[xposNode1][yposNode1];
                        GraphNode newNode2 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode1,yposNode2);

                        addEdge(existentNode, newNode2);

                        mazeGraph[xposNode1][yposNode2] = newNode2;

                    }
                    else if(mazeGraph[xposNode1][yposNode1] == null && mazeGraph[xposNode1][yposNode2] != null){

                        //Creates a new node for left position since the right node exists.
                        GraphNode existentNode = mazeGraph[xposNode1][yposNode2];
                        GraphNode newNode2 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode1, yposNode1);

                        addEdge(existentNode, newNode2);

                        mazeGraph[xposNode1][yposNode1] = newNode2;
                    }

                    else if(mazeGraph[xposNode1][yposNode1] != null && mazeGraph[xposNode1][yposNode2] != null){

                        //Connects the nodes that are already exist
                        GraphNode existentNode1 = mazeGraph[xposNode1][yposNode1];
                        GraphNode existentNode2 = mazeGraph[xposNode1][yposNode2];

                        addEdge(existentNode1, existentNode2);
                    }
                    else {

                        //Creates two new nodes since both the positions are free.
                        GraphNode newNode1 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode1, yposNode1);
                        GraphNode newNode2 = new GraphNode(GraphNodeType.STANDARD_NODE, xposNode1, yposNode2);

                        addEdge(newNode1, newNode2);

                        mazeGraph[xposNode1][yposNode1] = newNode1;
                        mazeGraph[xposNode1][yposNode2] = newNode2;

                    }
                }
                //Increments counter by elements that are passed.
                if(j == vertical[0].length - 2){
                    counter += 3;
                }
                else{
                    counter++;
                }
            }
        }
        this.startNode = mazeGraph[0][0];
        this.finishNode = mazeGraph[mazeGraph.length - 1][mazeGraph.length -1];

        startNode.setType(GraphNodeType.START_NODE);
        finishNode.setType(GraphNodeType.FINISH_NODE);
    }

    private void addEdge(GraphNode node1, GraphNode node2){

        node1.setNeighbors(node2);
        node2.setNeighbors(node1);

    }

    public void display() {


        System.out.println("\033[34;1;1m" + "########## Topology of The Maze ##########\n" + "\033[0m");

        String[] verticalLines = new String[mazeGraph.length];

        for (int i = 0; i < mazeGraph.length; i++){

            for(int j = 0; j < mazeGraph.length; j++){

                if(mazeGraph[i][j] != null){

                    if (i == 0 && j == 0) {
                        System.out.print("\033[92;2;1m");
                    } else if ((i == mazeGraph.length - 1) && (j == mazeGraph.length - 1)) {
                        System.out.print("\033[91;2;1m");
                    }

                    if(i + 1 < mazeGraph[0].length && mazeGraph[i][j].getNeighbors().contains(mazeGraph[i+1][j])){
                        verticalLines[j] = "| ";
                    } 
                    else {
                        verticalLines[j] = "  ";
                    }

                    if(j + 1 < mazeGraph[0].length && mazeGraph[i][j].getNeighbors().contains(mazeGraph[i][j+1])){
                        System.out.print("o-");
                    }

                    else{
                        System.out.print("o ");
                    }
                } 
                else {
                    System.out.print("  ");
                }

                System.out.print("\033[0m");

            }
            System.out.println();

            for (var ch : verticalLines) {

                System.out.print(ch);

            }
            System.out.println();
        }


        System.out.println("\033[34;1;1m" + "##########################################\n" + "\033[0m");
    }


    public static void displayPath(ArrayList<GraphNode> path) {

        if (path.isEmpty()) {
            System.out.println("\033[31;1;1m" + "THERE IS NO SOLUTION FOR THIS MAZE!!" + "\033[0m" + "\n\n");
            return;
        }

        int prevXIndex = path.getFirst().x_index;
        int prevYIndex = path.getFirst().y_index;

        String[] colors = {
                "\033[31;1;1m",
                "\033[32;1;1m",
                "\033[33;1;1m",
                "\033[34;1;1m",
                "\033[35;1;1m",
                "\033[36;1;1m",
        };

        for (int i = 0; i < path.size(); i++) {


            GraphNode currentNode = path.get(i);


            if (currentNode.x_index < prevXIndex) {
                System.out.println(" ← ");
            } else if (currentNode.x_index > prevXIndex) {
                System.out.println(" → ");
            } else if (currentNode.y_index < prevYIndex) {
                System.out.println(" ↑ ");
            } else if (currentNode.y_index > prevYIndex) {
                System.out.println(" ↓ ");
            } else {
                System.out.println();
            }


            System.out.print(colors[(i / 5) % colors.length]);


            System.out.print(i+1 + ") ");

            System.out.print(currentNode);


            prevXIndex = currentNode.x_index;;
            prevYIndex = currentNode.y_index;

        }

        System.out.println("\033[0m\n\n");


    }
}
