import java.io.PrintStream;

public class Tugas1 {
    public Tugas1() {
    }

    public static void main(String[] args) {
        String[] namaCustomer01D = new String[]{"Ani", "Budi", "Bina", "Cita"};
        int[] beratPakaian01D = new int[]{4, 15, 6, 11};
        PrintStream var10000 = System.out;
        float var10001 = totalPendapatanLaundry(namaCustomer01D, beratPakaian01D);
        var10000.println("Total Pendapatan Laundry : " + var10001);
    }

    static float totalPendapatanLaundry(String[] nama, int[] berat) {
        float income01D = 0.0F;
        float diskon01D = 0.0F;
        float result = 0.0F;

        for(int i = 0; i < berat.length; ++i) {
            diskon01D = 0.0F;
            if (berat[i] >= 10) {
                diskon01D = 0.95F;
            }

            result = (float)(berat[i] * 4500) * (diskon01D != 0.0F ? diskon01D : 1.0F);
            income01D += result;
            System.out.printf("%s  -> %d x 4500 x %.2f = %s\n", nama[i], berat[i], diskon01D, result);
        }

        return income01D;
    }
}
