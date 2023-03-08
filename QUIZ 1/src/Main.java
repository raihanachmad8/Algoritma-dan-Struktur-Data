import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jumlah data Gorilla : ");
        int input = in.nextInt();

        Gorilla[] gorilla = new  Gorilla[input];
        System.out.println("\nMasukkan Data Gorilla :");
        System.out.println("========================");
        for (int i = 0; i < gorilla.length; i++) {
            System.out.println("Gorilla " + (i+1) + ": ");
            System.out.print("Masukkan Tinggi  : ");
            float tinggi = in.nextFloat();
            System.out.print("Masukkan Berat   : ");
            float berat = in.nextFloat();
            System.out.print("Masukkan umur    : ");
            int umur = in.nextInt();
            System.out.println("========================");
            gorilla[i] = new Gorilla(tinggi,berat,umur);

        }
        System.out.println("\n\nData List Gorilla");
        for (int i = 0; i < gorilla.length; i++) {
            System.out.println("\n===============================");
            System.out.println("Gorilla ke-" + (i+1));
            gorilla[i].tampilData();
        }
            System.out.println("===============================");

    }
}