package BangunRuang;

public class Segitiga {
    public int alas, tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public float hitungLuas() {
        return alas * tinggi / 2;
    }
    public float hitungKeliling() {
        float sisiMiring = (float) Math.sqrt(alas*alas + tinggi*tinggi);
        return alas + tinggi + sisiMiring;
    }
}
