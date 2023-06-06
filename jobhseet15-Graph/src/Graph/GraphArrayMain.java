package Graph;

import java.util.Scanner;

public class GraphArrayMain {
    public static void main(String[] args) {
        int v, e, count = 1;
        String to = null, from = null;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try {
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            graph = new graphArray(v);

            System.out.println("Masukkan data : ");
            for (int i = 1; i <= v; i++) {
                String data = sc.next();
                graph.addVertex(i, data);
            }

            System.out.println("Masukkan jumlah edge: ");
            e = sc.nextInt();

            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.next();
                from = sc.next();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(graph.getList(i) + "\t");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(graph.getList(i) + "\t\t");
                for (int j = 1; j <= v ; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
