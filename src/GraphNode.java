import java.util.LinkedList;

public class GraphNode {

    private final LinkedList<GraphNode> neighbors;

    // Identifies the type of the node 'start, finish or standard'
    private GraphNodeType type;

    private GraphNode parent;

     public GraphNode(GraphNodeType type) {
         this.neighbors = new LinkedList<>();
         this.type = type;
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


}
