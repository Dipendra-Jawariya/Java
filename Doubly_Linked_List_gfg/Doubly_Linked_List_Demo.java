package Doubly_Linked_List_gfg;
class Node{
    int data ;
    Node prev;
    Node next;
    Node(int d){
        this.data = d;
        this.prev =null;
        this.next = null;
    }
}


public class Doubly_Linked_List_Demo {
//    04. Insert at the beginning of DLL
    public static Node InsertBegin(Node head, int data){
        Node temp = new Node(data);
//        if(head==null){
//            return temp;
//        }
        temp.next = head;
        if (head!=null){
            head.prev = temp;
        }
        return temp;
    }
//    05. Insert at the End of the DLL
    public static Node InsertEnd(Node head,int data){
        Node temp =new Node(data);
        if (head==null){
            return temp;
        }
        Node curr = head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

//    06.Reverse a Doubly Linked List


    public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1=  new Node(20);
    Node temp2 =new Node(30);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev=temp1;
    head = InsertBegin(head,5);
    head = InsertEnd(head,35);
    Node curr = head;
    while(curr!=null){
        System.out.print(curr.data +" ");
        curr= curr.next;
    }
    }
}
