
public class Main {
    public static void main(String[] args) {
        DoublyLinkedListCustom list = new DoublyLinkedListCustom();

        list.addFirst(1);
        list.addLast(3);
        list.addAtIndex(1, 2);

        list.updateValueAt(1, 5);  // Update the value at index 1 to 5

        list.printList();  // Output: 1 5 3

        list.printListBackwards();  // Output: 3 5 1

        System.out.println("Size of list: " + list.getSize());  // Output: 3

        System.out.println("Element at index 1: " + list.get(1));  // Output: 5

        Node firstNode = list.removeFirst();
        if (firstNode != null) {
            System.out.println("Removed first element: " + firstNode.getValue());  // Output: 1
        }

        Node lastNode = list.removeLast();
        if (lastNode != null) {
            System.out.println("Removed last element: " + lastNode.getValue());  // Output: 3
        }

        list.printList();  // Output: 5

        System.out.println("Is list empty? " + list.isEmpty());  // Output: false

        list.clear();
        System.out.println("Size of list after clearing: " + list.getSize());  // Output: 0
        System.out.println("Is list empty after clearing? " + list.isEmpty());  // Output: true
    }
}