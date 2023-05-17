package TugasDoubleLinkedList;

import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MyDoubleLinkedList<Film> mdll = new MyDoubleLinkedList<>();
        while (true) {
            System.out.println("========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");

            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble();
                    mdll.addFirst(new Film(id, judul,rating));

                }
                case 2 -> {
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble();
                    mdll.addLast(new Film(id, judul,rating));
                }
                case 3 -> {
                    System.out.print("Masukkan Data Film Indeks ke-");
                    int index = sc.nextInt();
                    System.out.print("ID Film: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble();
                    mdll.add(new Film(id, judul,rating), index);
                    System.out.println("Data Film ini akan masuk di indeks ke-" + index);
                }
                case 4 -> System.out.println((mdll.size() != 0) ? mdll.removeFirst().judul + " telah berhasil di hapus dari List Film" : "gagal  di hapus dari List Film karena List masih kosong");
                case 5 -> System.out.println((mdll.size() != 0) ? mdll.removeLast().judul + " telah berhasil di hapus dari List Film" : "gagal  di hapus dari List Film karena List masih kosong");
                case 6 -> {
                    System.out.println("Masukkan index mana yang ingin dihapus: ");
                    int index = sc.nextInt();
                    System.out.println((mdll.size() != 0) ? mdll.remove(index).judul + " telah berhasil di hapus dari List Film" : "gagal  di hapus dari List Film karena List masih kosong");
                }
                case 7 -> {
                    printFilms(mdll);
                }
                case 8 -> {
                    System.out.print("Masukkan Data yang ingin dicari: ");
                    int id = sc.nextInt();
                    Node<Film> result = searchByID(mdll, id);
                    if (result != null) {
                        System.out.println("Film found:");
                        System.out.println("Film ID: " + result.data.id);
                        System.out.println("Judul: " + result.data.judul);
                        System.out.println("Rating: " + result.data.rating);
                    } else {
                        System.out.println("ID Film not found");
                    }

                }
                case 9 -> {
                    sortByRating(mdll);
                    printFilms(mdll);
                }
                case 10 -> {
                    return;
                }
                default -> System.out.println("Number out of range");
            }
        }
    }
    public static void sortByRating(MyDoubleLinkedList<Film> mdll) {
        if (mdll.isEmpty() || mdll.size == 1) {
            return;
        }
        Node<Film> current = mdll.head;
        Node<Film> index;
        Film temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data.rating < index.data.rating) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }

            current = current.next;
        }
    }

    public static void printFilms(MyDoubleLinkedList<Film> data) {
        if (!data.isEmpty()) {
            Node<Film> current = data.head;
            System.out.println("| ID |\tJudul\t| Rating |");
            System.out.println("-------------------------");
            while (current != null) {
                System.out.println("| " + current.data.id + " |\t" + current.data.judul + "\t| " + current.data.rating + "\t|");
                current = current.next;
            }
            System.out.println("Total Films: " + data.size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public static Node<Film> searchByID(MyDoubleLinkedList<Film> list, int id) {
        Node<Film> current = list.head;
        while (current != null) {
            if (current.data.id == id) {
                return current;
            }
            current = current.next;
        }
        return null; // ID not found in the list
    }


}
