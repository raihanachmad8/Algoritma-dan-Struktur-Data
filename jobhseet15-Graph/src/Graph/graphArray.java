package Graph;

public class graphArray<T> {
    private final int vertices;

    public T getList(int index) {
        return list[index];
    }

    private T[] list;
    private final int[][] twoD_array;

    public graphArray(int vertices) {
        this.vertices = vertices;
        this.list = (T[])new Object[vertices + 1];
        this.twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void addVertex(int index, T data) {
        this.list[index] = data;
    }

    public void makeEdge(T to, T from, int edge) {
        try {
            int indexTo = getIndex(to);
            int indexFrom = getIndex(from);
            twoD_array[indexTo][indexFrom] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    private int getIndex(T source) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] == source || list[i].equals(source)) {
                return i;
            }
        }
        return -1;
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return 0;
    }
}
