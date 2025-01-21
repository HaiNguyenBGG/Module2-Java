
class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);

        list.add(2, 50);
        list.add(3, 60);

        list.print();
    }
}