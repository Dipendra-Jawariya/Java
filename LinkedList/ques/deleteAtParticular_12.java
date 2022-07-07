package LinkedList.ques;

public class deleteAtParticular_12 {
    public  static Node deleteParticularNode(Node head,int pos){
        Node curr =head;
        for (int i = 0; i < pos - 2 && curr.next!=null; i++) {
            curr=curr.next;
        }
        curr.next = curr.next.next;
        return head;
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
        head =deleteParticularNode(head,6);
        printList(head);
    }
}
