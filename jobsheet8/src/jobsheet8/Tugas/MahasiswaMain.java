package jobsheet8.Tugas;
import jobsheet8.Praktikum2.Penumpang;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pilih;
        System.out.print("masukkan kapasistas queue: ");
        n = sc.nextInt();

        Queue mhs = new Queue(n);

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1 -> {
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    mhs.Enqueue(m);
                }
                case 2 -> {
                    int dataKeluar = mhs.Dequeue();
                    if (dataKeluar != -1) {
                        System.out.println("Data yang pada index " + dataKeluar + " berhasil dikeluarkan");
                    }
                }
                case 3 -> mhs.print();
                case 4 -> mhs.peek();
                case 5 -> mhs.peekRear();
                case 6 -> {
                    System.out.print("masukkan nim yang ingin di cari: ");
                    String value = sc.nextLine();
                    mhs.peekPosition(value);
                }
                case 7 -> {

                    System.out.print("masukkan index data yang ingin di cari: ");
                    int value = sc.nextInt();
                    mhs.printMahasiswa(value);
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
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Mahasiswa");
        System.out.println("------------------------------------");
    }
}
