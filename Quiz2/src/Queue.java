public class Queue {
    private DoubleLinkedLIst list;

    public Queue() {
        this.list = new DoubleLinkedLIst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(Truck truck) {
        list.addLast(truck);
    }

    public Truck dequeue() {
        return list.removeFirst();
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong.");
            return;
        }

        System.out.println("Truck Queue:");
        Node current = list.getHead();
        while (current != null) {
            System.out.println("Truck " + current.getData().getId());
            current = current.getNext();
        }
    }
}
