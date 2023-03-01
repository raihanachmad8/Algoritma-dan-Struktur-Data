import java.util.Scanner;

public class Perulangan {
    public Perulangan() {
    }

    public static void main(String[] args) {
        Scanner achmadRaihan = new Scanner(System.in);
        long NIM01D = 0L;
        System.out.print("Masukkan NIM: ");
        NIM01D = achmadRaihan.nextLong() % 100L;
        System.out.println("==============================");
        System.out.println(day(NIM01D));
    }

    static String day(long nim) {
        String[] dayOfWeek01D = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        String result01D = "";
        if (nim <= 10L) {
            nim += 10L - nim;
        }

        for(int i = 0; (long)i < nim; ++i) {
            result01D = result01D + dayOfWeek01D[i % 7] + ", ";
        }

        return result01D;
    }
}
