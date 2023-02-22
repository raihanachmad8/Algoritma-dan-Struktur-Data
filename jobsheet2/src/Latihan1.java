public class Latihan1 {

    public static void main(String[] args) {
        Buku book = new Buku("Secreet Life", "John Louis", "PT. XIOALI", 120000,4);
        System.out.println("Nama : " + book.nama);
        System.out.println("Pengarang : " + book.pengarang);
        System.out.println("Penerbit : " + book.penerbit);
        System.out.println("Harga Satuan : " + book.hargaSatuan);
        System.out.println("Jumlah : " + book.jumlah);

        System.out.println("Harga Awal : " + book.hitungHargaTotal());
        System.out.println("Harga setelah di Diskon : " + book.hitungHargaBayar());
    }

}

class Buku {
    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;
    Buku(String nm, String pg, String pt, int hs, int j) {
        nama = nm;
        pengarang = pg;
        penerbit = pt;
        hargaSatuan = hs;
        jumlah = j;
    }

    int hitungHargaTotal() {
        return jumlah * hargaSatuan;
    }
    int hitungDiskon() {
        if (hitungHargaTotal() > 100000) {
            return hitungHargaTotal() * 10 / 100;
        } else if (hitungHargaTotal() >= 50000) {
            return hitungHargaTotal() * 5 /100;
        }
        return 0;
    }
    int hitungHargaBayar() {
        return (hitungHargaTotal() - hitungDiskon());
    }
}
