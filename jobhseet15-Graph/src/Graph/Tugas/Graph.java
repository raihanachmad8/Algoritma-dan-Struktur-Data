package Graph.Tugas;

public class Graph<T> {
    int vertex;
    DoubleLinkedList<T>[] list;
    Node right;
    boolean isDirected; // variable to determine the type of graph

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList<>();
        }
        this.isDirected = isDirected;
    }

    public void addVertex(int index, T data) {
        DoubleLinkedList<T> newLink = new DoubleLinkedList<>();
        newLink.addFirst(data);
        list[index] = newLink;
    };

    public void addEdge(T source, T destination) throws Exception {
        int sourceIndex = getIndex(source);
        int destinationIndex = getIndex(destination);
        list[sourceIndex].add(destination, 1);
        if (!isDirected) {
            list[destinationIndex].add(source, 1);
        }
    }

    private int getIndex(T source) {
        for (int i = 0; i < vertex; i++) {
            if (list[i] == source || list[i].head.data.equals(source)) {
                return i;
            }
        }
       return -1;
    }

    public void degree(T source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[getIndex(source)].size);

        if (isDirected) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == source || list[i].get(j).equals(source)) {
                        totalIn++;
                    }
                }
                totalOut += list[getIndex(source)].size;
            }
            System.out.println("Indegree of vertex " + source + " : " + totalIn);
            System.out.println("Outdegree of vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
        }

    }

    public void removeEdge(T source, T destination) throws Exception {
        int sourceIndex = getIndex(source);
        int destinationIndex = getIndex(destination);

        if (sourceIndex == -1 || destinationIndex == -1) {
            throw new Exception("Nama daerah tidak ditemukan");
        }

        int index = -1;
        for (int i = 0; i < list[sourceIndex].size(); i++) {
            if (list[sourceIndex].get(i).equals(destination)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            list[sourceIndex].remove(index);
            if (!isDirected) {
                for (int i = 0; i < list[destinationIndex].size(); i++) {
                    if (list[destinationIndex].get(i).equals(source)) {
                        list[destinationIndex].remove(i);
                        break;
                    }
                }
            }
        }

    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph has been cleared");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0) {
                System.out.print("Vertex " + list[i].head.data + " is connected to: ");
                Node<T> currentNode = list[i].head.next;
                while (currentNode != null) {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.next;
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
