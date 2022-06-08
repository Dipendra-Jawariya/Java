package LinkedList;

import java.util.ArrayList;

public class ReverseLinkedList {
    public static Node reverseLinked(Node head){
        ArrayList<Integer> arr= new ArrayList<>();
        for (Node curr = head;curr!=null;curr =curr.next){
            arr.add(curr.data);
        }
        for (Node curr = head;curr!=null;curr=curr.next){
            curr.data = arr.remove(arr.size()-1);
        }
        for (Node curr = head;curr!=null;curr=curr.next){
            System.out.print (curr.data+" ");
        }
        return head;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
//        reverseLinked(head);
        head = reverse(head);
        for (Node curr = head;curr!=null;curr=curr.next){
            System.out.print (curr.data+" ");
        }
    }
}
