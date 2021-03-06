import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    private T data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(T data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void addNeighbour(Vertex vertex) {
        neighbourList.add(vertex);
    }

    @Override
    public String toString() {
        return data + "";
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }
}
