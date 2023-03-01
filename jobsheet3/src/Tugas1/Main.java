package Tugas1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kerucut[] myKerucut = new Kerucut[2];
        Bola[] myBola = new Bola[2];
        LimasSegiEmpat[] myLimas = new LimasSegiEmpat[2];

        for (int i = 0; i < myKerucut.length; i++) {
            System.out.println("Nilai Kerucut ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            double jari = in.nextDouble();
            System.out.print("Masukkan sisi Miring: ");
            double sisiMiring = in.nextDouble();
            myKerucut[i] = new Kerucut(jari,sisiMiring);
            System.out.println("=====================");
            System.out.println("Nilai Bola ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            double jariJari = in.nextDouble();
            myBola[i] = new Bola(jariJari);
            System.out.println("=====================");
            System.out.println("Nilai Limas Segi Empat sama sisi ke-" + (i+1));
            System.out.print("Masukkan alas: ");
            double alas = in.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = in.nextDouble();
            myLimas[i] = new LimasSegiEmpat(alas,tinggi);
            System.out.println();
        }
        System.out.println("Hasil");
        for (int i = 0; i < myKerucut.length; i++) {
            System.out.printf("Nilai Kerucut ke-%d dengan jari-jari %.2f, dan sisi Miring %.2f :\n",(i+1), myKerucut[i].jari, myKerucut[i].sisiMiring);
            System.out.printf("volume = %.2f \n", myKerucut[i].hitungVolume());
            System.out.printf("luas permukaan = %.2f \n", myKerucut[i].hitungLuasPermukaan());
            System.out.println("================================");
            System.out.printf("Nilai Bola ke-%d dengan jari-jari %.2f :\n",(i+1), myBola[i].jari);
            System.out.printf("volume = %.2f \n", myBola[i].hitungVolume());
            System.out.printf("luas permukaan = %.2f \n", myBola[i].hitungLuasPermukaan());
            System.out.println("================================");
            System.out.printf("Nilai Limas Segi Empat ke-%d dengan alas %.2f dan tinggi %.2f :\n",(i+1),myLimas[i].alas, myLimas[i].tinggi);
            System.out.printf("volume = %.2f \n", myLimas[i].hitungVolume());
            System.out.printf("luas permukaan = %.2f \n", myLimas[i].hitungLuasPermukaan());
            System.out.println();
        }
    }
}
