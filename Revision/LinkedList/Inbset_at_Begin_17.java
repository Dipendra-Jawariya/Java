package Revision.LinkedList;

public class Inbset_at_Begin_17 {
    public static void printList(Node head){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static Node inserAtBegin(Node head,int x){
        Node temp = new Node(x);
        if (head==null){
            temp.prev=null;
            temp.next = head;
            return temp;
        }
        temp.next = head;
        head.prev= temp;
        return temp;
    }
    public static Node insertAtEnd(Node head ,int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr =head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1= new Node(20);
        Node node = new Node(30);
        Node temp2= node;
        head.next=temp1;
        temp1.next= temp2;
        temp1.prev = head;
        temp2.prev=temp1;


        head= inserAtBegin(head,5);
        head= insertAtEnd(head,50);
        printList(head);
        System.out.println("List after operation at begining");
//        head= reverseDoublyList(head)
        printList(head);
    }
}
