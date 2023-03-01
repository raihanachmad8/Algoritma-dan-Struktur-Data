package Tugas1;

public class Kerucut {
    public double jari, sisiMiring;
    public Kerucut(double jari, double sisiMiring) {
        this.jari = jari;
        this.sisiMiring = sisiMiring;
    }
    public double hitungVolume() {
        return (3.14 * (jari * jari) * Math.sqrt((sisiMiring * sisiMiring) - (jari * jari))) / 3;
    }

    public double hitungLuasPermukaan() {
        return 3.14 * jari * (jari + sisiMiring);
    }
}
