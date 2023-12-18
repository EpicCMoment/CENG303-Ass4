/*
    Virtual representation of a maze. Only stores the start and finish of the maze.
    startNode acts as a root of a graph because it stores the neighboring nodes in itself.
    finishNode shows the location of the end of the maze.
 */
public class Maze {

    private MazeNode startNode;
    private MazeNode finishNode;


    public MazeNode getStartNode() {
        return startNode;
    }

    public MazeNode getFinishNode() {
        return finishNode;
    }

}
