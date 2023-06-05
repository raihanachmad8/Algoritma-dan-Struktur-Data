package Graph.Tugas;

public class Graph<T> {
    int vertex;
    DoubleLinkedList<T>[] list;
    Node right;
    int index = 0;
    boolean isDirected; // variable to determine the type of graph

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList<>();
        }
        this.isDirected = isDirected;
    }

    public void addEdge(T source, T destination) {
//        int index = 0;
        boolean addStatus = false;
        for (int i = 0; i < index; i++) {
            if (list[i].head != null && list[i].head.data.equals(source)) {
                list[i].addLast(destination);
                addStatus = true;
                if (!isDirected) {
                    boolean destinationExists = false;
                    Node<T> currentNode = list[i].head.next;
                    while (currentNode != null) {
                        if (currentNode.data.equals(destination)) {
                            destinationExists = true;
                            break;
                        }
                        currentNode = currentNode.next;
                    }
                    if (!destinationExists) {
                        list[i].addLast(destination);
                    }
                }
                break;
            }
        }

        if (!addStatus) {
            DoubleLinkedList<T> newLinkedList = new DoubleLinkedList<>();
            newLinkedList.addFirst(source);
            newLinkedList.addLast(destination);

            list[index] = newLinkedList;

            if (!isDirected) {
                DoubleLinkedList<T> newLinkedList2 = new DoubleLinkedList<>();
                newLinkedList2.addFirst(destination);
                newLinkedList2.addLast(source);
                list[index + 1] = newLinkedList2;
            }
            index++;
        }


//        list[(int) source].addFirst(destination);
//        if (!isDirected) {
//            list[(int) destination].addFirst(source);
//        }
    }

    public void degree(T source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[(int) source].size);

        if (isDirected) {
            int totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size; j++) {
                    if (list[i].get(j) == source) {
                        totalIn++;
                    }
                }
                totalOut += list[(int) source].size;
            }
            System.out.println("Indegree of vertex " + source + " : " + totalIn);
            System.out.println("Outdegree of vertex " + source + " : " + totalOut);
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
