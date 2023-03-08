public class Gorilla {
    float tinggi, berat;
    int umur;
    Gorilla (float t, float b, int u) {
        tinggi = t;
        berat = b;
        umur = u;
    }
    boolean isGorilla() {
        return berat > 146;
    }
    void tampilData() {
        System.out.printf("Tinggi Gorilla     : %.1f cm\n", tinggi );
        System.out.printf("Berat Gorilla      : %.1f kg\n", berat );
        System.out.printf("Berat Gorilla      : %d \n", umur );
        if (isGorilla()) {
            System.out.println("Ini Gorilla Asli");
        } else {
            System.out.println("Ini Bukan Gorilla");
        }
    }
}
