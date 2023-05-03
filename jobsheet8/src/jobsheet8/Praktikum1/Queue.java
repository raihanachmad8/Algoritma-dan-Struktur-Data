package jobsheet8.Praktikum1;

public class Queue {
    int max;
    int size;
    int front;
    int rear;
    int[] Q;
    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
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

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i+1) % max;

            }
            System.out.println(Q[i] + " ");
            System.out.println("jumlah elemen = " + size);
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(int data) {
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
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
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

    public void peekPosition(int data) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (Q[index] == data) {
                    position = i;
                    break;
                }
            }
            if (position == -1) {
                System.out.println("Data tidak ditemukan di dalam queue");
            } else {
                System.out.println("Data " + data + " ditemukan pada posisi: " + position);
            }
        }
    }

    public void peekAt(int position) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else if (position > size) {
            System.out.println("Posisi " + position + " di luar range queue");
        } else {
            int index = (front + position) % max;
            System.out.println("Data pada posisi " + position + " berisi " + Q[index]);
        }
    }

}
