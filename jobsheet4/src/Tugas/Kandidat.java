package Tugas;

public class Kandidat {
    String[] nama;
    int[] suara;

    int cariMayoritas(int[] suara, int awal, int akhir) {
        if (awal == akhir) {
            return suara[awal];
        }
        // Divide: membagi array menjadi dua bagian
        int tengah = (awal + akhir) / 2;
        int mayoritasKiri = cariMayoritas(suara, awal, tengah);
        int mayoritasKanan = cariMayoritas(suara, tengah + 1, akhir);

        if (mayoritasKiri == mayoritasKanan) {
            return mayoritasKiri;
        }

        // Conquer: Hitung masing - masing hasil dari kedua bagian
        int suaraMayoritasKiri = hitungSuara(suara, awal, akhir, mayoritasKiri);
        int suaraMayoritasKanan = hitungSuara(suara, awal, akhir, mayoritasKanan);

        // Combine: gabungkan hasil dari kedua bagian
        return suaraMayoritasKiri > suaraMayoritasKanan ? mayoritasKiri : mayoritasKanan;
    }

    private static int hitungSuara(int[] suara, int awal, int akhir, int kandidat) {
        int suaraKandidat = 0;

        for (int i = awal; i <= akhir; i++) {
            if (suara[i] == kandidat) {
                suaraKandidat++;
            }
        }

        return suaraKandidat;
    }

}
