public class MazeNode {

    /*
    Stores the neighboring nodes of this node.
    0 => Top neighbor
    1 => Right neighbor
    2 => Bottom neighbor
    3 => Left neighbor
     */
    private final MazeNode[] neighbors = new MazeNode[4];

    // Identifies the type of the node 'start, finish or standard'
    private final MazeNodeType type;

    private MazeNode parent;

     public MazeNode(MazeNodeType type) {
         this.type = type;
     }

    public MazeNode(MazeNodeType type, MazeNode top, MazeNode right, MazeNode bottom, MazeNode left) {

         this.type = type;

        this.neighbors[0] = top;
        this.neighbors[1] = right;
        this.neighbors[2] = bottom;
        this.neighbors[3] = left;

    }

    public MazeNode[] getNeighbors() {
        return neighbors;
    }

    public MazeNodeType getType() {
        return type;
    }

    public MazeNode getParent() {
        return parent;
    }

    public void setParent(MazeNode parent) {
        this.parent = parent;
    }


}
