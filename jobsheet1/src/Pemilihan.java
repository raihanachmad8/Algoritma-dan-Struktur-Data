import java.util.Scanner;

public class Pemilihan {
    public Pemilihan() {
    }

    public static void main(String[] args) {
        Scanner achmadRaihan = new Scanner(System.in);
        float nilai01D = 0.0F;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilai01D = (float)((double)nilai01D + (double)achmadRaihan.nextFloat() * 0.2);
        System.out.print("Masukkan Nilai UTS: ");
        nilai01D = (float)((double)nilai01D + (double)achmadRaihan.nextFloat() * 0.35);
        System.out.print("Masukkan Nilai UAS: ");
        nilai01D = (float)((double)nilai01D + (double)achmadRaihan.nextFloat() * 0.45);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.printf("Nilai Akhir: %.1f\n", nilai01D);
        System.out.printf("Nilai Huruf: %s", convertNilai(nilai01D));
    }

    static String convertNilai(float N) {
        if (N > 80.0F && N <= 100.0F) {
            return "A";
        } else if (N > 73.0F && N <= 80.0F) {
            return "B+";
        } else if (N > 65.0F && N <= 73.0F) {
            return "B";
        } else if (N > 60.0F && N <= 65.0F) {
            return "C+";
        } else if (N > 50.0F && N <= 60.0F) {
            return "C";
        } else {
            return N > 39.0F && N <= 50.0F ? "D" : "E";
        }
    }
}
