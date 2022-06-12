
//. Search In Linked List
        package LinkedList.ques;

public class SearchLinkedList {
    public static int search(Node head,int x){
        Node curr = head;
        while(curr!=null){
            if (curr.data==x){
                return 1 ;
            }
            else{
                curr = curr.next;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(4);
        head.next.next = new Node(10);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(98);
        System.out.println(search(head,10));
    }

}
