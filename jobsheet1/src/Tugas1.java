public class Tugas1 {
    public static void main(String[] args) {
        String[] namaCustomer01D = { "Ani", "Budi", "Bina",  "Cita"};
        int[] beratPakaian01D = {4,15,6,11};
        System.out.println("Total Pendapatan Laundry : " + totalPendapatanLaundry(namaCustomer01D,beratPakaian01D));
    }
    static float totalPendapatanLaundry(String[] nama, int[] berat) {
        float income01D = 0, diskon01D = 0, result = 0;
        for (int i = 0; i < berat.length; i++) {
            diskon01D = 0;
            if (berat[i] >= 10) {
                diskon01D = .95f;
            }
            result = berat[i] * 4500 * ((diskon01D != 0) ? diskon01D : 1);
            income01D += result;
            System.out.printf("%s  -> %d x 4500 x %.2f = %s\n",nama[i], berat[i], diskon01D, result);

        }
        return income01D;
    }
}
