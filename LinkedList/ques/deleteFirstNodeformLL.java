package LinkedList.ques;

public class deleteFirstNodeformLL {
    public static  Node deleteFirstNode(Node head){
        if (head==null && head.next==null){
            return  head;
        }
        else{
            return head.next;
        }
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
        head =deleteFirstNode(head);
        printList(head);

    }
}
