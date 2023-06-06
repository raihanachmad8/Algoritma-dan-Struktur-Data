package Graph.Tugas;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex: ");
        int vertexCount = scanner.nextInt();
        System.out.print("Masukkan direct/undirected [1|0]: ");
        int directed = scanner.nextInt();
        Graph<String> graph = new Graph<>(vertexCount, directed == 1);
        System.out.println("Masukkan data vertex:");
        for (int i = 0; i < vertexCount; i++) {
            String vertex = scanner.next();
            graph.addVertex(i, vertex);
        }
        System.out.print("Masukkan jumlah edge: ");
        int edgeCount = scanner.nextInt();

        System.out.println("Masukkan edge <source> <destination>:");
        for (int i = 0; i < edgeCount; i++) {
            String source = scanner.next();
            String destination = scanner.next();
            graph.addEdge(source, destination);
        }

        System.out.println("Graph awal:");
        graph.printGraph();

        System.out.print("Masukkan vertex untuk menampilkan derajat: ");
        String source = scanner.next();
        graph.degree(source);

        System.out.print("Masukkan edge yang ingin dihapus <source> <destination>: ");
        String removeSource = scanner.next();
        String removeDestination = scanner.next();
        graph.removeEdge(removeSource, removeDestination);

        System.out.println("Graph setelah penghapusan edge:");
        graph.printGraph();

        scanner.close();
    }
}
