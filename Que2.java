// Enter the newNode at the given Position in LinkedList

public class Que2 {
    // Implementation of the LinkedList
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert the value at the End of the List

    public void insert(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // Implementation of the function for add the newNode at the specific position
    public void insertAtPosition(Node pointer, int data){
        if (pointer == null) {
            System.out.println("New Node is empty");
        }

        Node newNode = new Node(data);
        newNode.next = pointer.next;
        pointer.next = newNode;
        
    }

    // Display the LinkedList
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        return;
    }

    public static void main(String[] args) {
        Que2 llist = new Que2();
        llist.insert(11);
        llist.insert(22);
        llist.insert(33);
        llist.insert(44);
        llist.insert(55);

        llist.display();
        System.out.println();

        llist.insertAtPosition(llist.head.next, 10);
        llist.display();
    }
}
