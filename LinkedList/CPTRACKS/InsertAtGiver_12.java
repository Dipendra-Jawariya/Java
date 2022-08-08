package LinkedList.CPTRACKS;


class Node{
        int data ;
        Node next;
        Node(int x){
        data = x;
        next =null;
        }
        }
public class InsertAtGiver_12 {
    public static Node insertAtGiven(Node head, int x,int data) {
        Node temp = new Node(data);

        if (x == 1) {
            temp.next=head;
            return temp;
        }
        Node curr = head;
        for (int i = 0; i <=x-2 ; i++) {
            curr=curr.next;
        }
        if (curr == null) {
            return temp;
        }
        temp.next= curr.next;
        curr.next= temp;
        return head;
    }
    public class Stack_getMIn_18 {
        public static void main(String[]args){
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
           head=  insertAtGiven(head,2,56);
            System.out.println(head);
        }
    }
}
