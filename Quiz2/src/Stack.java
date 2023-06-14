public class Stack {
    Node top;

    public void push(Truck truck) {
        Node newNode = new Node(truck);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setPrev(top);
            top.setNext(newNode);
            top = newNode;
        }
    }

    public Truck pop() {
        if (top == null) {
            return null;
        }
        Node temp = top;
        top = top.getPrev();
        if (top != null) {
            top.setNext(null);
        }
        return temp.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node current = top;
        System.out.println("Wood Stack:");
        while (current != null) {
            System.out.println("Kayu truk " + current.getData().getId());
            current = current.getPrev();
        }
    }
}
