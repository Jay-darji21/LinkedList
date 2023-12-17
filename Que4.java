// Given the LinkedList. Return true if it is palindrome or return false

public class Que4 {
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

    // Number of the elements
    int number() {
        int num = 0;
        Node temp = head;
        while (temp != null) {
            num++;
            temp = temp.next;
        }
        // System.out.println("Number : " + num);
        return num;
    }

    // Check if the the LinkedList is palindrome or not
    public void isPalindromic() {
        Node slow = head;
        Node fast = head;
        Node midNode = null;
        int number = number();

        // For even numbers

        if (number % 2 == 0) {
            while (fast != null && fast.next != null) {
            
                fast = fast.next.next;
                midNode = slow;
                slow = slow.next;
            }
            // System.out.println("Middle of the List : " + midNode.data);
            Node reverseHalf = reverse(midNode.next);
            boolean flag = compare(reverseHalf, head);
             if (flag == true) {
                 System.out.println("Is palindrome");
             }
            else {
                 System.out.println("Is not Palindrome");
             }
            
        } 
        // For odd numbers
        else {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;

                slow = slow.next;
            }
            // System.out.println("Middle of the List : " + slow.data);
             Node reverseSecondHalf = reverse(slow);
              boolean flag = compare(reverseSecondHalf, head);
             if (flag == true) {
                System.out.println("Is palindrome");
             } else {
             System.out.println("Is not Palindrome");
             }
        }
    }

    // Reverse the Half LinkedList

    private Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        return prev;
    }

    // Compare the two LinkedList

    boolean compare(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null ) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
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
        Que4 llist = new Que4();

        int arr[] = {1,2,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            llist.insert(arr[i]);
        }

        llist.display();
        System.out.println();
        llist.isPalindromic();
        

    }
}
