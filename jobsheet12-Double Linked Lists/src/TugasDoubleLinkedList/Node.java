package TugasDoubleLinkedList;

public class Node<T> {
    T data;
    Node<T> prev, next;

    public Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
