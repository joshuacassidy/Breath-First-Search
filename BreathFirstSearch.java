import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public String search(Vertex root) {
        String searchResults= "";
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            searchResults+=actualVertex+ " ";
            for (Vertex v: actualVertex.getNeighbourList()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
        return searchResults;
    }


}
