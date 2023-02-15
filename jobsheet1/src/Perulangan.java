import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner achmadRaihan = new Scanner(System.in);
        long NIM01D = 0;
        System.out.print("Masukkan NIM: ");
        NIM01D = achmadRaihan.nextLong() % 100;
        System.out.println("==============================");
        System.out.println(day(NIM01D));
    }
    static String day(long nim) {
        String[] dayOfWeek01D = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        String result01D = "";
        if (nim <= 10) {
            nim += 10 - nim;
        }
        for (int i = 0; i < nim ; i++) {
            result01D += dayOfWeek01D[i % 7] + ", ";
        }
        return result01D;
    }
}
