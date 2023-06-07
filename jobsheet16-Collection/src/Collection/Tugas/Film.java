package Collection.Tugas;

import java.util.Scanner;
import java.util.Stack;

public class Film {
    int id, tahun;
    String judul, director;

    public Film(int id, String judul, int tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "ID Film=" + id +
                ", Judul Film='" + judul + '\'' +
                ", Tahun Tayang=" + tahun +
                ", Director='" + director + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Film> films = new Stack<>();
        films.push(new Film(1, "Spider-Man: No Way Home", 2021, "Jon Watts"));
        films.push(new Film(2, "Dr. Strange: The Madness of Multiverse", 2022, "Sam Raimi"));
        films.push(new Film(3, "Skyfall", 2012, "Sam Mendes"));
        films.push(new Film(4, "Aquaman", 2018, "James Wan"));
        films.push(new Film(5, "Dark Knight Rises", 2012, "Cristopher Nolan"));
        String pilih;
        while (true) {
            System.out.println("====================================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("====================================");
            System.out.println("\n1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextLine().trim();
            switch (pilih) {
                case "1" -> {
                    System.out.println("====================================");
                    System.out.print("Masukkan ID Film       : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Judul Film    : ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Tahun Tayang  : ");
                    int tahun = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Director      : ");
                    String director = sc.nextLine();
                    films.push(new Film(id, judul, tahun, director));
                }
                case "2" -> {System.out.println(films.pop());
                }
                case "3" -> {System.out.println(films.peek());
                }
                case "4" -> {
                    films.stream().forEach(film -> {
                        System.out.println("" + film.toString());
                    });
                }
                case "5" -> {
                    return;
                }
                default -> System.out.println("\nKeyword salah\n");
            }
        }
    }
}
