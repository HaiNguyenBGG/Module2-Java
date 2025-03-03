public class Node<E> {
    private E data;
    Node<E>  next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
    public E getData() {
        return data;
    }
    public E setData(E data) {
        return this.data = data;
    }
}
