import java.util.LinkedList;

public class GraphNode {

    private final LinkedList<GraphNode> neighbors;

    // Identifies the type of the node 'start, finish or standard'
    private GraphNodeType type;

    private GraphNode parent;

    public int x_index;
    public int y_index;

     public GraphNode(GraphNodeType type, int x_index, int y_index) {
         this.neighbors = new LinkedList<>();
         this.type = type;

         this.x_index = y_index;
         this.y_index = x_index;

     }

    public void setNeighbors(GraphNode neighborNode){
        this.neighbors.add(neighborNode);
    }
    public LinkedList<GraphNode> getNeighbors() {
        return neighbors;
    }

    public void setType(GraphNodeType type){
         this.type = type;
    }
    public GraphNodeType getType() {
        return type;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }

    public String toString() {

         return String.format("[%d, %d]", x_index, y_index);

    }


}
