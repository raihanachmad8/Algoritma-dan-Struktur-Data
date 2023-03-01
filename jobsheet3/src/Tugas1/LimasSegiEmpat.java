package Tugas1;

public class LimasSegiEmpat {
    public double alas, tinggi;
    public LimasSegiEmpat( double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return  (alas * alas) * tinggi /3;
    }

    public double hitungLuasPermukaan() {
        double sisiMiring = Math.sqrt(((alas/2) * (alas/2)) + (tinggi * tinggi));
        return ((alas * alas) + (4 * (0.5 * alas * sisiMiring)));

    }
}
