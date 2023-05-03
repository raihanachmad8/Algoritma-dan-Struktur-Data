package jobsheet8.Tugas;
public class Queue {
    int max,front,rear,size;
    Mahasiswa[] antrian;

    public Queue(int max) {
        this.max = max;
        Create();
    }
    public void Create() {
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void Enqueue(Mahasiswa antrian) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            this.antrian[rear] = antrian;
            size++;
        }
    }

    public int Dequeue() {
       int data = -1;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = front;
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].nim + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].nim + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("jumlah elemen = " + size);
        }
    }
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].nim + " " + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + antrian[rear].nama + " " + antrian[rear].nim + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nim) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (nim.equals(antrian[index].nim)) {
                    position = i;
                    System.out.println(i);
                    break;
                }
            }
            if (position == -1) {
                System.out.println("Data tidak ditemukan di dalam queue");
            } else {
                System.out.println("Data " + nim + " ditemukan pada posisi: " + position);
            }
        }
    }

    public void printMahasiswa(int posisi) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else if (posisi > size) {
            System.out.println("Posisi " + posisi + " di luar range queue");
        } else {
            int index = (front + posisi) % max;
            System.out.println("Data pada posisi " + posisi + " berisi : " + antrian[index].nama + " " + antrian[index].nim + " " + antrian[index].absen + " " + antrian[index].ipk);
        }
    }
}
