package Graph.Tugas;


public class DoubleLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(null, data, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(T data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            tail = tail.next = new Node<>(tail, data, null);
            size++;
        }
    }


    public void add(T data, int index) throws Exception {
        if (isEmpty() || index == 0) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == size) {
            addLast(data);
        } else {
            Node<T> current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            Node newNode = new Node(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node<T> tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public T removeFirst() throws Exception {
        Node<T> tmp = head;
        if (isEmpty()) {
            throw  new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        return tmp.data;
    }
    public T removeLast() throws Exception{
        if (isEmpty()) {
            throw  new Exception("Linked List masih kosong, tidak dapat dihapus");
        }
        Node<T> tmp = tail;
        if (head.next == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return tmp.data;
    }
    public T remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            return removeFirst();
        } else {
            Node<T> current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current == tail) {
                tail = tail.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            return current.data;
        }
    }

    public T getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public T getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return tail.data;
    }

    public T get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
