package Minggu7.TestSearching;

public class PencariMhs {
    public Mahasiswa[] listMhs;
    int idx;

    public PencariMhs(int jumlahMhs) {
        this.listMhs = new Mahasiswa[jumlahMhs];
    }
    // Menambahkan method tambah()
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------");
        }
    }
    int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim == cari && posisi == -1) {
                posisi = i;
            } else if (listMhs[i].nim == cari && posisi != -1) {
                System.err.println("Peringantan terdapat data nim yang sama!!");
            }
        }
        return posisi;
    }

    int FindSeqSearchByName(String name) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nama == name && posisi == -1) {
                posisi = i;
            } else if (listMhs[i].nama == name && posisi != -1) {
                System.err.println("Peringantan terdapat data nama yang sama!!");
            }
        }
        return posisi;
    }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK \t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK \t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    //  Menambah method baru FindBinarySearch()
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return mid;
            } else if(listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari,mid + 1, right);
            }
        }
        return -1;
    }
    // Pencarian Desc
    public int FindBinarySearchDesc(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listMhs[mid].nim) {
                return mid;
            } else if (listMhs[mid].nim < cari) {
                return FindBinarySearchDesc(cari, left, mid - 1);
            } else {
                return FindBinarySearchDesc(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
