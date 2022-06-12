package LinkedList;

public class RemoveDuplicates {
    public static void removeDuplicates(Node head){
        if (head==null){
            return;
        }

        Node curr = head;
        while (curr.next!=null){
            if (curr.data ==curr.next.data){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(40);
        removeDuplicates(head);

    }
}
