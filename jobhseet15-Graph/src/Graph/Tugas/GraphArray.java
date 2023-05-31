package Graph.Tugas;

public class GraphArray<T> {
    private final int vertices;
    private Object[][] twoD_array;

    public GraphArray(int vertices) {
        this.vertices = vertices;
        this.twoD_array = new Object[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, T edge) {
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    public T getEdge(int to, int from) {
        try {
            return (T) twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return null;
    }
}
