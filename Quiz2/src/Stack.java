public class Stack {
    private int[] data;
    private int top;

    public Stack(int capacity) {
        this.data = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(Truck truck) {
        if (isFull()) {
            System.out.println("Stack penuh tidak dapat mengisi truck tidak dapat mengisi kayu.");
            return;
        }

        data[++top] = truck.getId();
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
            return;
        }
        System.out.println("Wood Stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println("Wood dari truck  " + data[i]);
        }

    }
}
