import java.util.ArrayList;
import java.util.Stack;

public class BFSolver {

    // Bu algoritma labirenti çözebiliyorsa başlangıçtan bitişe olan yolu döndürür,
    // çözüm bulamazsa null döndürür.
    public static ArrayList<GraphNode> solve(Graph host) {

        // Ziyaret edilen düğümleri depolayan liste
        ArrayList<GraphNode> visitedNodes = new ArrayList<>();

        // Keşfedilmeyi bekleyen düğümleri depolayan yığın
        Stack<GraphNode> toBeVisitedNodes = new Stack<>();

        // BFS bitiş düğümünü bulursa, yolu geri izlemek için bu değişkeni atar
        GraphNode finishNode = null;

        // Algoritmayı başlatmak için bu basmakalıp
        toBeVisitedNodes.push(host.getStartNode());

        // Keşfedilmeyi bekleyen düğüm kalmayana kadar devam eder
        while (!toBeVisitedNodes.isEmpty()) {

            // Yığından bir düğüm al
            GraphNode currentNode = toBeVisitedNodes.pop();

            // Bu düğümü ziyaret edilen düğümler arasına ekle
            visitedNodes.add(currentNode);

            // Eğer bu düğüm bitiş düğümü ise
            if (currentNode.getType() == GraphNodeType.FINISH_NODE) {
                finishNode = currentNode;
                break;
            }

            // Düğümün komşuları üzerinde dön
            for (GraphNode node : currentNode.getNeighbors()) {

                // Eğer düğüm bu yönde bir komşuya sahip değilse
                if (node == null) {
                    continue;
                }

                // Eğer komşu daha önce ziyaret edilmemişse
                if (!visitedNodes.contains(node)) {

                    // Bu düğümü komşusuna parent olarak ata
                    node.setParent(currentNode);

                    // Bu düğümü keşfetmek üzere işaretle
                    toBeVisitedNodes.push(node);
                }

            }

        }

        // Yolu depolamak için bir liste oluştur
        ArrayList<GraphNode> path = new ArrayList<>();
        GraphNode iteratorNode = finishNode;

        // Iterator düğüm null olana kadar devam et
        while (iteratorNode != null) {

            // Yolu geri izlemek için iteratorNode'u listeye ekle
            path.add(iteratorNode);

            // Geri izlemeye devam etmek için parent düğümü al
            iteratorNode = iteratorNode.getParent();

        }

        // Bulunan yolu döndür
        return path;
    }
}
