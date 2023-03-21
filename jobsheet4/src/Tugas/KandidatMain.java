package Tugas;

import java.util.Scanner;

public class KandidatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan junlah kandidat : ");
        int jmlKandidat = sc.nextInt();
        sc.nextLine();
        Kandidat kandidat = new Kandidat();
        kandidat.nama = new String[jmlKandidat];
        for (int i = 0; i < kandidat.nama.length; i++) {
            System.out.printf("Masukkan nama kandidat ke-%s : ",(i+1));
            kandidat.nama[i] = sc.nextLine();
        }
        System.out.print("\nMasukkan jumlah suara : ");
        int n = sc.nextInt();
        sc.nextLine();
        kandidat.suara = new int[n];
        System.out.printf("\nPilih kandidat number ke [1-%s]\n", kandidat.nama.length);
        for (int i = 0; i < kandidat.nama.length; i++) {
            System.out.printf("%s. %s\n", (i+1),kandidat.nama[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Masukkan pilihan ke-%s: ", (i+1));
            kandidat.suara[i] = sc.nextInt() - 1;
        }
        int indexMayoritas = kandidat.cariMayoritas(kandidat.suara,0, kandidat.suara.length -1);
        if (indexMayoritas > -1) {
            System.out.println("Mayoritas Kandidat : " + kandidat.nama[indexMayoritas]);
        } else {
            System.out.println("Tidak ada mayoritas untuk kandidat");
        }
    }
}
