package Graph.Tugas;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex: ");
        int vertexCount = scanner.nextInt();

        Graph<String> graph = new Graph<>(vertexCount, false);

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
        int source = scanner.nextInt();
//        graph.degree(source);

        System.out.print("Masukkan edge yang ingin dihapus <source> <destination>: ");
        int removeSource = scanner.nextInt();
        int removeDestination = scanner.nextInt();
        graph.removeEdge(removeSource, removeDestination);

        System.out.println("Graph setelah penghapusan edge:");
        graph.printGraph();

        scanner.close();
    }
}
