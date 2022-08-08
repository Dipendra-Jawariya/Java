package LinkedList;

public class RecursiveLinkedList {
//    09 Insert at the end
    public static Node insertAtEnd(Node head,int x){
        if(head==null){
            return null;
        }
        Node temp = new Node(x);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    public static void recursiveDisplay(Node head){
        if (head==null){
            return ;
        }
        System.out.print(head.data+" ");
        recursiveDisplay(head.next);
    }
    public static void printNodes(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
//        recursiveDisplay(head);
        head=insertAtEnd(head,67);
        printNodes(head);
    }
}
