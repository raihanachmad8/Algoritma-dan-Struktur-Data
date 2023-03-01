package Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = in.nextInt();
        in.nextLine();
        Mahasiswa[] daftarMhs = new Mahasiswa[jumlahMhs];
        System.out.println("Data Mahasiswa");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            String nama = in.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = in.nextLine();

            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = in.nextLine();

            System.out.print("Masukkan IPK: ");
            double ipk = in.nextDouble();
            in.nextLine();


            daftarMhs[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        in.close();

        System.out.println("\nList Data Mahasiswa");
        System.out.println("=========================");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            daftarMhs[i].tampilInfo();
            System.out.println("=========================");
        }

    }
}
