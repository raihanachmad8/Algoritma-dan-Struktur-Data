package PersegiPanjang;
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array Persegi Panjang: ");
        int panjang = in.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[panjang];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = in.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = in.nextInt();

        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }
}
