import java.util.Scanner;

public class Tugas2 {
    public Tugas2() {
    }

    public static void main(String[] args) {
        System.out.println("Rumus Menu");
        menu();
    }

    static void menu() {
        Scanner achmadRaihan = new Scanner(System.in);
        int input;
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Masukkan Pilihan Menu: ");
        input = achmadRaihan.nextInt();
        float jarak;
        float kecepatan;
        switch (input) {
            case 0:
                return;
            case 1:
                jarak = 0.0F;
                kecepatan = 0.0F;
                System.out.print("Masukkan Waktu: ");
                jarak = achmadRaihan.nextFloat();
                System.out.print("Masukkan Jarak: ");
                kecepatan = achmadRaihan.nextFloat();
                kecepatan(kecepatan, jarak);
                menu();
                break;
            case 2:
                jarak = 0.0F;
                kecepatan = 0.0F;
                System.out.print("Masukkan Waktu: ");
                jarak = achmadRaihan.nextFloat();
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = achmadRaihan.nextFloat();
                jarak(kecepatan, jarak);
                menu();
                break;
            case 3:
                jarak = 0.0F;
                kecepatan = 0.0F;
                System.out.print("Masukkan Jarak: ");
                jarak = achmadRaihan.nextFloat();
                System.out.print("Masukkan Kecepatan: ");
                kecepatan = achmadRaihan.nextFloat();
                waktu(jarak, kecepatan);
                menu();
                break;
            default:
                System.out.println("\ninput incorrect\n");
                menu();
        }

    }

    static void kecepatan(float jarak, float waktu) {
        System.out.printf("Kecepatan : %s (m/s)\n", jarak / waktu);
    }

    static void jarak(float kecepatan, float waktu) {
        System.out.printf("Kecepatan : %s (m)\n", kecepatan * waktu);
    }

    static void waktu(float jarak, float kecepatan) {
        System.out.printf("Kecepatan : %s (s)\n", jarak / kecepatan);
    }
}
