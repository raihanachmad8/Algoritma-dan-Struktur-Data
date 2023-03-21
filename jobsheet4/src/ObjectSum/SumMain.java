package ObjectSum;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jml = sc.nextInt();
        System.out.println("Program menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        Sum[] perusahaan = new Sum[jml];
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Perusahaan ke-" + (i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
            perusahaan[i] = new Sum(elm);

            System.out.println("============================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j+1) + " = ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("\nKeuntungan perusahaan ke-" + (i+1));
            System.out.println("============================================================");
            System.out.println("ALogaritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("============================================================");
            System.out.println("ALogaritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1));
            System.out.println("============================================================");
        }
    }
}
