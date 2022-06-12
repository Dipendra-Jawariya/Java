package LinkedList.ques;

public class SortedListInsertion {
    public static Node insert(Node head,int data){
        Node newNode = new Node(data);
        Node curr = head;
        while( curr.next!=null && curr.next.data<data ){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(14);
        head.next.next = new Node(18);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(98);
        head= insert(head,100);

        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
    }
}
