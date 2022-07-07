package LinkedList.ques;

import java.util.ArrayList;

public class JoinLinkedList {
        public static Node mergeLinkedList(Node head,Node head1){
           Node p1 = head;
           Node p2 = head1;
           Node dummyNode = new Node(-1);
           Node p3 = dummyNode;
           while (p1!=null && p2!=null){
               if (p1.data<p2.data){
                   p3.next = p1;
                   p1 = p1.next;
               }
               else{
                   p3.next = p2;
                   p2 = p2.next;
               }
               p3=p3.next;
           }
               while(p1!=null){
                   p3.next = p1;
                   p1=p1.next;
                   p3=p3.next;
               }
               while(p2!=null){
                   p3.next = p2;
                   p2= p2.next;
                   p3=p3.next;
               }
           return dummyNode.next;
        }
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        Node head1 = new Node(1);
         head1.next = new Node(4);
        head = mergeLinkedList(head,head1);
        printList(head);
    }
}
