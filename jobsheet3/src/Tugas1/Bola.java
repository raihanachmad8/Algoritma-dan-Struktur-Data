package Tugas1;

public class Bola {
    public double jari;

    public Bola(double jariJari) {
        this.jari = jariJari;
    }
    public double hitungVolume() {
        return (4 * 3.14 * (jari * jari * jari))/3 ;
    }
    public double hitungLuasPermukaan() {
        return 4 * 3.14 * jari * jari;
    }
}
