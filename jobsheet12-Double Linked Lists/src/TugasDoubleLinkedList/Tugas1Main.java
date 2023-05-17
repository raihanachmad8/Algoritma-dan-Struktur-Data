package TugasDoubleLinkedList;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MyDoubleLinkedList<Pasien> mdll = new MyDoubleLinkedList<>();
        while (true) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
            System.out.println("\tPENGANTRI VAKSIN EXTRA VAGANZA");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah Data penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan: ");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("--------------------------------------");
                    System.out.println("\tMasukkan Data Penerima Vaksin");
                    System.out.println("--------------------------------------");
                    System.out.print("Nomor Antrian : ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = sc.nextLine();
                    mdll.addLast(new Pasien(nomor, nama));

                }
                case 2 -> System.out.println((mdll.size() != 0) ? mdll.removeFirst().nama + " telah selesai di vaksinasi" : "Antrian masih kosong");

                case 3 -> {
                    printPasien(mdll);
                }
                case 4 -> {
                    System.out.println("Good bye :)");
                    return;
                }
                default -> System.out.println("Number out of range");
            }
        }

    }

    public static void printPasien(MyDoubleLinkedList data) {
        if (!data.isEmpty()) {
            Node<Pasien> current = data.head;
            System.out.println("| No. |\tNama\t|");
            System.out.println("--------------");
            while (current != null) {
                System.out.println("| " + current.data.no + " |\t" + current.data.nama + "\t|");
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + data.size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
