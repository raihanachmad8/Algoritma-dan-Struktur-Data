package BubbleSelectionInsertion.Minggu5.Praktikum;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int index;

    void tambah(Hotel h) {
        if (index < rooms.length) {
            rooms[index] = h;
            index++;
        }  else {
            System.out.println("Data sudah penuh!!!");
        }
    }
    void tampilAll() {
        for (Hotel h : rooms) {
            System.out.println("------------------------------");
            System.out.println("Nama        = " + h.nama);
            System.out.println("Kota        = " + h.kota);
            System.out.println("Harga       = " + h.harga);
            System.out.println("Bintang     = " + h.bintang);

        }
    }

    void  bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length ; j++) {
                if (rooms[j].bintang < rooms[idxMin].bintang ) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }

    }
}
