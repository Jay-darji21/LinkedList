public class Que5 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    // Insertion at end
    public void insertionAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Display the LinkedList
    public void display(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        return;
    }
    public static void main(String[] args) {
        Que5 llist1 = new Que5();
        Que5 llist2 = new Que5();

        int arr1[] = {5,6,3};
        int arr2[] = {8,4,2};
        for(int i = 0 ; i<arr1.length ; i++){
            llist1.insertionAtEnd(arr1[i]);
            llist2.insertionAtEnd(arr2[i]);
        }

        llist1.display();
        System.out.println();
        llist2.display();
        System.out.println();

    }
}
