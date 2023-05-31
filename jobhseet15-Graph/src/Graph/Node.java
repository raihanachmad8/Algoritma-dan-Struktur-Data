package Graph;

public class Node {
    int data;
    Node next, prev;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
