package Tugas.Tugas1;

import Praktikum1.Pakaian;
import Praktikum1.Stack;

import java.util.Scanner;

public class Tugas1Main {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);
        char pilih;

        do {
            System.out.println("\nSilakan pilih operasi pada stack:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Minimum harga");
            System.out.println("6. Selesai");

            System.out.print("Pilihan: ");
            pilih = sc.next().charAt(0);
            sc.nextLine();

            switch(pilih) {
                case '1' -> {
                    System.out.print("\nJenis : ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk  : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();

                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                }
                case '2' -> stk.pop();
                case '3' -> stk.peek();
                case '4' -> stk.print();
                case '5' -> stk.getMin();
                case '6' -> System.out.println("\nProgram selesai.");
                default -> System.out.println("\nInput tidak valid!");
            }
        } while (pilih != '5');
    }
}
