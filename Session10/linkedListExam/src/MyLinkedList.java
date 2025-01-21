public class MyLinkedList<E> {
    private Node<E> head;
    int numNodes;

    public MyLinkedList() {
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        numNodes++;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        Node<E> removedNode = head;
        if (index == 0) {
            head = removedNode.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
        }
        numNodes--;
        return removedNode.getData();
    }

    public boolean remove(E e) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null) {
            if (current.getData().equals(e)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                numNodes--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node<E> current = head;
        while (current != null) {
            clone.addLast(current.getData());
            current = current.next;
        }
        return clone;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData().equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
    }

    public E getFirst() {
        return head.getData();
    }

    public E getLast() {
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.getData();
    }

    public Node<E> getFirstNode() {
        return head;
    }
}
