package Graph;

public class Graph {
    int vertex;
    DoubleLinkedList list[];
    Node right;
    boolean isDirected; // variabel untuk menentukan jenis graph

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        if (!isDirected) {
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size);

        if (isDirected) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == source) {
                        totalIn++;
                    }
                }
                totalOut += list[source].size;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }
    }
    public void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        if (!isDirected) {
            list[destination].remove(source);
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print(list[i].get(j) +" ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public boolean graphType() {
        return isDirected;
    }
}
