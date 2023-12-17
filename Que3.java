// Given the LinkedList of sorted Array. Delete the all duplicates from the Array

public class Que3 {
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

    // Delete the duplicate element
    public void delete(){
        if(head == null || head.next == null){
            return;
        }
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return;
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
        Que3 llist = new Que3();
        llist.insert(10);
        llist.insert(10);
        llist.insert(20);
        llist.insert(30);
        llist.insert(30);
        llist.insert(30);

        llist.display();
        System.out.println();
        llist.delete();
        llist.display();
        System.out.println();
    }
}
