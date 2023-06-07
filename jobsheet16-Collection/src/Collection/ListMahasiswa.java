package Collection;

import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), (mhs1, mhs2) -> mhs1.nim.compareTo(mhs2.nim));
    }
    void sortAscending() {
        Comparator<Mahasiswa> c = Comparator.comparing(mahasiswas -> mahasiswas.nim);
        Collections.sort(mahasiswas, c);
    }
    void sortDescending() {
        Comparator<Mahasiswa> c = Comparator.comparing(mahasiswas -> mahasiswas.nim);
        Collections.sort(mahasiswas, c.reversed());
    }


    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
//        menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
//        menampilkan list mahasiswa
        lm.tampil();
//        update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2") );
        System.out.println();
        lm.tampil();
//        Sort Ascending
        System.out.println("Sort Ascending: ");
        lm.sortAscending();
        lm.tampil();
//        Sort Descending
        System.out.println("Sort Descending:");
        lm.sortDescending();
        lm.tampil();
    }
}
