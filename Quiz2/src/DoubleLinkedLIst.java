public class DoubleLinkedLIst {
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    private Node head, tail;

    public DoubleLinkedLIst() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Truck truck) {
        Node newNode = new Node(truck);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public Truck removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node removedNode = head;
        head = head.getNext();

        if (head == null) {
            tail = null;
        } else {
            head.setPrev(null);
        }

        return removedNode.getData();
    }
}
