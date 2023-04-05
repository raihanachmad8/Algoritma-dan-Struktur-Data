package Tugas.Tugas2;

public class Tugas2Main {
    public static void main(String[] args) {
        StackMyStruk ss = new StackMyStruk(8);

        // Memasukkan data struk belanja Dewi ke dalam stack
        ss.push(new MyStruk("001", "2022-02-01", 5, 100000));
        ss.push(new MyStruk("002", "2022-02-08", 3, 50000));
        ss.push(new MyStruk("003", "2022-02-15", 2, 40000));
        ss.push(new MyStruk("004", "2022-02-22", 4, 80000));
        ss.push(new MyStruk("005", "2022-03-01", 6, 120000));
        ss.push(new MyStruk("006", "2022-03-08", 3, 60000));
        ss.push(new MyStruk("007", "2022-03-15", 4, 80000));
        ss.push(new MyStruk("008", "2022-03-22", 2, 40000));

        // Menampilkan data struk belanja yang masih tersimpan di dalam stack
        System.out.println("Data struk belanja yang masih tersimpan di dalam stack:");
        ss.print();

        // Mengambil 5 struk belanja dari stack untuk ditukarkan dengan voucher
        System.out.println("Mengambil 5 struk belanja dari stack untuk ditukarkan dengan voucher:");
        for (int i = 0; i < 5; i++) {
            ss.pop();
        }

        // Menampilkan data struk belanja yang masih tersimpan di dalam stack setelah 5 struk diambil
        System.out.println("Data struk belanja yang masih tersimpan di dalam stack setelah 5 struk diambil:");
        ss.print();
    }
}
