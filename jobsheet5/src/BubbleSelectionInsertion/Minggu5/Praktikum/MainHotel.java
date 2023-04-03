package BubbleSelectionInsertion.Minggu5.Praktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService hotelService = new HotelService();
        Hotel h1 = new Hotel("Mawar", "Blitar", 500000, (byte) 3);
        Hotel h2 = new Hotel("Melati", "Bali", 800000, (byte) 5);
        Hotel h3 = new Hotel("RedDoorz", "Malang", 200000, (byte) 4);
        Hotel h4 = new Hotel("Savana", "Malang", 500000, (byte) 5);
        Hotel h5 = new Hotel("Everyday", "Malang", 250000, (byte) 4);

        hotelService.tambah(h1);
        hotelService.tambah(h2);
        hotelService.tambah(h3);
        hotelService.tambah(h4);
        hotelService.tambah(h5);

        while (true) {
            System.out.println("Data list hotel");
            System.out.println("1. Tampil Semua data");
            System.out.println("2. Sorting berdasarkan harga");
            System.out.println("3. Sorting berdasarkan bintang");
            System.out.println("0. keluar");
            System.out.print("Masukkan pilihan : ");
            String pilihan = sc.nextLine().trim();
            switch (pilihan) {
                case "1" -> {
                    hotelService.tampilAll();
                }
                case "2" -> {
                    hotelService.bubbleSort();
                    hotelService.tampilAll();
                }
                case "3" -> {
                    hotelService.selectionSort();
                    hotelService.tampilAll();
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Pilihan anda salah");
            }
        }

    }

}
