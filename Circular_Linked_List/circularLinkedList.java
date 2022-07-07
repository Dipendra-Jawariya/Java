package Circular_Linked_List;
class Node{
    int data ;
    Node next;
    Node(int x){
        this.data =x;
        next =null;
    }
}


public class circularLinkedList {
    public static void iteration(Node head){
        if(head==null){
            return;
        }
        Node f = head;
//        int firstDatat = head.data;
        System.out.println(head.data);
        while(f.next.data!=head.data){
            System.out.println(f.next.data+" ");
            f = f.next;
        }
    }
    public  static  void itereationCircularList2(Node head){
        Node p = head;
        do {
            System.out.println(p.data);
            p = p.next;
        }while(p!=head);
    }
    public static void main(String[] args) {
            Node head =new Node(10);
            head.next= new Node(20);
            head.next.next= new Node(30);
            head.next.next.next = head;
        itereationCircularList2(head);
    }
}
