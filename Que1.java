// Here is given the LinkedList and a key value 'X' check the if the X is present or not in the List.

import java.util.*;
public class Que1{

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }


    // Insert the value at the End of the List

    public void insert(int newData){
        Node newNode = new Node(newData);

        if(head == null){
            head = new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // Check the value X is present or not

    public int checkKey(int x){
        Node temp = head;
        int flag = 0;
        while (temp != null) {
            if (temp.data == x) {
                flag = 1;
                return flag;
            }
            temp = temp.next;
        }
        return flag;
        
    }

    // Display the LinkedList
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        return;
    }
    
        
    

    public static void main(String[] args) {
        Que1 llist = new Que1();

        llist.insert(14);
        llist.insert(11);
        llist.insert(23);
        llist.insert(30);
        llist.insert(66);

        llist.display();
        System.out.println();

        System.out.println("Enter the Key Value : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int res = llist.checkKey(x);
        if (res == 0) {
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        sc.close();

    
    }
}