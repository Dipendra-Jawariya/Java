package Doubly_Linked_List_gfg;

public class ReverseDoublyLInkedList {
    public static Node reverseDLL(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node prev =null, curr = head;
        while(curr!=null){
            prev = curr.prev;
            curr.prev = curr. next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
    public static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr= curr.next;
        }
        System.out.println();
    }

//    07. Delete the head of Doubly Linked List
    public static  Node delHead(Node head){
        if (head==null || head.next==null) {
            return null;
        }
//        Node prev =null;
//        prev=head.prev;
        head = head.next;
        head.prev = null;
        return head;
    }

//    08. Delete the last Node of Doubly Linked List
    public static  Node delLast(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node curr = head;
        while (curr.next.next!=null){
            curr = curr.next;
        }
        curr.next=null;
        return head;
    }
    public static  Node delLast2(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1=  new Node(20);
        Node temp2 =new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev=temp1;
        System.out.println("Linked list before Operation");
        display(head);
//        head = reverseDLL(head);
//        head =delHead(head);
        head =delLast2(head);
        System.out.println("Linked list after Operation");
        display(head);
//        head = InsertBegin(head,5);
//        head = InsertEnd(head,35);
    }
}
