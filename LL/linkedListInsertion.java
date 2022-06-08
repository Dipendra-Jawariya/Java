package LL;

import java.nio.file.NotDirectoryException;

class Node{
    int data ;
    Node next;
    Node(int x){
        data = x;
        next =null;
    }
}


public class linkedListInsertion {
    public static  Node insertAtIndex(Node head,int pos,int data){
        Node temp = new Node(data);
        if (pos==1){        
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < pos - 2; i++) {
            if (curr!=null){
                curr = curr.next;
            }
        }
        temp.next = curr.next;
        curr = temp;

        return head;

    }
    public static Node printlist(Node head){
        if (head==null){
            return null;
        }
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        insertAtIndex(head,2,15);
        printlist(head);
    }
}
