
public class Main {

    public static void main(String[] args) {

        BreathFirstSearch bfs = new BreathFirstSearch();
        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);
        Vertex<Integer> vertex5 = new Vertex<>(5);
        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex3);
        vertex2.addNeighbour(vertex4);
        vertex3.addNeighbour(vertex5);
        System.out.println(bfs.search(vertex1));

    }

}
