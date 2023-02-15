import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        System.out.println("Rumus Menu");
        menu();

    }
    static void menu() {
        Scanner achmadRaihan = new Scanner(System.in);
        int input = 0;
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("0. Exit");
        System.out.print("Masukkan Pilihan Menu: ");
        input = achmadRaihan.nextInt();
        switch (input) {
            case 1 -> {
                float waktu = 0, jarak=0;
                System.out.print("Masukkan Waktu: ");
                waktu = achmadRaihan.nextFloat();
                System.out.print("Masukkan Jarak: ");
                jarak = achmadRaihan.nextFloat();
                kecepatan(jarak,waktu);
                menu();
            }
            case 2 -> {
                float waktu = 0, kecepatan=0;
                System.out.print("Masukkan Waktu: ");
                waktu = achmadRaihan.nextFloat();
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = achmadRaihan.nextFloat();
                jarak(kecepatan,waktu);
                menu();
            }
            case 3 -> {
                float jarak = 0, kecepatan=0;
                System.out.print("Masukkan Jarak: ");
                jarak = achmadRaihan.nextFloat();
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = achmadRaihan.nextFloat();
                waktu(jarak,kecepatan);
                menu();

            }
            case 0 -> {
                return;
            }
            default -> {
                System.out.println("\ninput incorrect\n");
                menu();
            }
        }

    }

     static void kecepatan(float jarak, float waktu){
         System.out.printf("Kecepatan : %s (m/s)\n", jarak/waktu);
     }
     static void jarak(float kecepatan, float waktu) {
         System.out.printf("Kecepatan : %s (m)\n", kecepatan*waktu);
    }
    static void waktu(float jarak, float kecepatan) {
        System.out.printf("Kecepatan : %s (s)\n", jarak/kecepatan);

    }
}
