package Minggu7.TestSearching;

import Minggu7.MergeSortTest.MergeSorting;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        PencariMhs data = new PencariMhs(jumMhs);

        System.out.println("---------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------------");
            System.out.print("NIM \t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK \t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("---------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        boolean ulang = true;
        int posisi, cari = - 1;
        String cariNama;
        do {
            System.out.println("__________________________________");
            System.out.println("__________________________________");
            System.out.println("Pencarian Data Berdasarkan: ");
            System.out.println("1. NIM");
            System.out.println("2. Nama");
            System.out.print("Masukkan pilihan : ");

            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
                    System.out.print("NIM : ");
                    cari = s.nextInt();
                    System.out.println("menggunakan sequential Search");
                    posisi = data.FindSeqSearch(cari);
                    data.TampilPosisi(cari, posisi);
                    data.TampilData(cari, posisi);
                    ulang = false;
                }
                case 2 -> {
                    System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
                    System.out.print("Nama : ");
                    cariNama = sl.nextLine();
                    System.out.println("menggunakan sequential Search");
                    posisi = data.FindSeqSearchByName(cariNama);
                    cari = data.listMhs[posisi].nim;
                    data.TampilPosisi(cariNama, posisi);
                    data.TampilData(cariNama, posisi);
                    ulang = false;
                }
                default -> System.out.println("Pilihan yang anda masukkan salah");
            }
        } while (ulang);


        // Menginstansiasi object Merge Sorting dan melakukan sorting terhadap data mahasiswa
        System.out.println("Proses sorting menggunakan merge sorting");
        MergeSorting mSort = new MergeSorting();
        data.listMhs = mSort.mergeSortDataMhs(data);

        // Menambah kode untuk memanggil method binary search
        System.out.println("==================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1); // ASC
        //posisi = data.FindBinarySearchDesc(cari, 0, jumMhs - 1); // DESC
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}

