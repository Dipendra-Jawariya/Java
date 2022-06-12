package LinkedList.ques;

public class DeleeTail_10 {
    public static Node delete(Node head){
        if (head==null){
            return head;
        }
        if (head.next ==null){
            return null;
        }
        Node curr =head;

        while(curr.next.next!=null){
            curr =curr.next;
        }
        curr.next =null;
        return head;
    }
    public static void printList(Node head){

        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(14);
        head.next.next = new Node(18);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(50);
//        head.next.next.next.next.next = new Node(98);
        head= delete(head);
        printList(head);
    }
}
