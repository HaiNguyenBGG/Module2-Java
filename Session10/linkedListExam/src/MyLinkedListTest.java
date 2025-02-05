public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        System.out.println("Add to the beginning:");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        printList(list);

        System.out.println("\nAdd to the end:");
        list.addLast(40);
        list.addLast(50);
        printList(list);

        System.out.println("\nAdd to the middle:");
        list.add(2, 25);
        printList(list);

        System.out.println("\nElement at index 3: " + list.get(3));

        System.out.println("\nRemove element at index 4:");
        list.remove(4);
        printList(list);

        System.out.println("\nRemove element with value 25:");
        list.remove((Integer) 25);
        printList(list);

        System.out.println("\nContains 20? " + list.contains(20));
        System.out.println("Contains 100? " + list.contains(100));

        System.out.println("\nIndex of 10: " + list.indexOf(10));
        System.out.println("Index of 100: " + list.indexOf(100));

        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println("\nList size: " + list.size());

        System.out.println("\nCloned list:");
        MyLinkedList<Integer> clonedList = list.clone();
        printList(clonedList);

        System.out.println("\nClear the list:");
        list.clear();
        printList(list);
    }

    static private void printList(MyLinkedList<?> list) {
        Node<?> current = list.getFirstNode();
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
