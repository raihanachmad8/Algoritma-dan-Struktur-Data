public class Node {
    private Node next, prev;
    private Truck data;

    public Node(Truck data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Truck getData() {
        return data;
    }

}
