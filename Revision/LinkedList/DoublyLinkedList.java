package Revision.LinkedList;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data = d;
        prev=null;
        next = null;
    }
}
public class DoublyLinkedList {
    public static void printList(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1= new Node(20);
        Node temp2= new Node(30);
        head.next=temp1;
        temp1.next= temp2;
        temp1.prev = head;
        temp2.prev=temp1;
        printList(head);
    }
}
