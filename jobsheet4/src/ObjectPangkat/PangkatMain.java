package ObjectPangkat;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("====================================");
        System.out.println("\t\tMenu Hitung Pankat");
        System.out.println("====================================");
        System.out.println("1. Menggunakan Brute Force");
        System.out.println("2. Menggunakan Divide and Conquer");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.println("============================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Faktorial dari nilai " + png[i].nilai + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                System.out.println("============================================================");
            }
            case 2 -> {
                System.out.println("============================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Faktorial dari nilai " + png[i].nilai + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                System.out.println("============================================================");
            }
            default -> {
                System.out.println("Pilihan input salah");
            }
        }
    }


}
