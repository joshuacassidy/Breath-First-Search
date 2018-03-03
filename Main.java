
public class Main {

    public static void main(String[] args) {

        BreathFirstSearch bfs = new BreathFirstSearch();
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex4);
        vertex3.addNeighbour(vertex5);
        System.out.println(bfs.search(vertex1));

    }

}
