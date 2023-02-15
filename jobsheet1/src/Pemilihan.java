import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner achmadRaihan = new Scanner(System.in);
        float nilai01D = 0;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilai01D += achmadRaihan.nextFloat() * 0.2;

        System.out.print("Masukkan Nilai UTS: ");
        nilai01D += achmadRaihan.nextFloat() * 0.35;
        System.out.print("Masukkan Nilai UAS: ");
        nilai01D += achmadRaihan.nextFloat() * 0.45;
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.printf("Nilai Akhir: %.1f\n", nilai01D);
        System.out.printf("Nilai Huruf: %s", convertNilai(nilai01D));
    }
    static String convertNilai(float N)
    {
        if (N > 80 && N <= 100) {
            return "A";
        } else if (N > 73 && N <= 80) {
            return "B+";
        } else if (N > 65 && N <= 73) {
            return "B";
        } else if (N > 60 && N <= 65) {
            return "C+";
        } else if (N > 50 && N <= 60) {
            return "C";
        } else if (N > 39 && N <= 50) {
            return "D";
        }
        return "E";
    }
}