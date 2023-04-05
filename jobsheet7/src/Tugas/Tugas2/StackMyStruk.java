package Tugas.Tugas2;

public class StackMyStruk {
    int size, top;
    MyStruk[] data;

    public StackMyStruk(int size) {
        this.size = size;
        data = new MyStruk[size];
        top = -1;
    }
    public boolean isEmpty() {
        return this.top < 0;
    }

    public boolean isFull() {
        return top > data.length;
    }
    public void push(MyStruk stk) {
        if (!isFull()) {
            top++;
            data[top] = stk;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            MyStruk x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tglPembelian + " " + x.jmlBarang + " " + x.total);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen teratas: " + data[top].noTransaksi + " " + data[top].tglPembelian + " " + data[top].jmlBarang + " " + data[top].total);
    }
    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0 ; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tglPembelian + " " + data[i].jmlBarang + " " + data[i].total);
        }
        System.out.println();
    }
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0 ; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }

    }
}
