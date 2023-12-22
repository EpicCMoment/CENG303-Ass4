import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSSolver {

    // if this algorithm can solve the maze it returns the path from start to end
    // if it can't solve, returns null
    public static ArrayList<GraphNode> solve(Graph host) {

        // stores the nodes which are already visited
        ArrayList<GraphNode> visitedNodes = new ArrayList<>();

        // stores the nodes which are waiting to be explored
        Queue<GraphNode> toBeVisitedNodes = new LinkedList<>();

        // if DFS finds the finish, assign it to this variable to backtrack the path
        GraphNode finishNode = null;

        // boilerplate to kick-start the algorithm
        toBeVisitedNodes.add(host.getStartNode());

        // runs until there are no nodes to be explored
        while (!toBeVisitedNodes.isEmpty()) {

            // get a node from the queue
            GraphNode currentNode = toBeVisitedNodes.remove();

            // add this node among the visited nodes
            visitedNodes.add(currentNode);

            // if this node is the finish
            if (currentNode.getType() == GraphNodeType.FINISH_NODE) {
                finishNode = currentNode;
                break;
            }

            for (GraphNode node : currentNode.getNeighbors()) {

                // if node doesn't have a neighbor in this direction
                if (node == null) {
                    continue;
                }

                // if the neighbor is not already visited
                if ( !visitedNodes.contains(node) ) {

                    // assign currentNode as parent to the node
                    node.setParent(currentNode);

                    // mark this node to visit
                    toBeVisitedNodes.add(node);
                }

            }


        }

        ArrayList<GraphNode> path = new ArrayList<>();
        GraphNode iteratorNode = finishNode;

        while (iteratorNode != null) {

            path.addFirst(iteratorNode);

            // get parent to continue backtracking
            iteratorNode = iteratorNode.getParent();

        }

        return path;


    }

}
