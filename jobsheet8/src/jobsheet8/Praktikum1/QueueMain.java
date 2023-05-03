package jobsheet8.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pilih;
        System.out.print("masukkan kapasistas queue: ");
        n = sc.nextInt();

        Queue Q = new Queue(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.print("masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                }
                case 2 -> {
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                }
                case 3 -> Q.print();
                case 4 -> Q.peek();
                case 5 -> Q.clear();
                case 6 -> {
                    System.out.print("masukkan nilai yang ingin di cari: ");
                    int value = sc.nextInt();
                    Q.peekPosition(value);
                }
                case 7 -> {
                    System.out.print("masukkan index data yang ingin di cari: ");
                    int value = sc.nextInt();
                    Q.peekAt(value);
                }
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

    public static void menu() {
        System.out.println("masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("------------------------------------");
    }
}
