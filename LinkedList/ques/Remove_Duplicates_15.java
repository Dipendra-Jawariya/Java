package LinkedList.ques;
//15. Remove duplicate element from sorted Linked List
public class Remove_Duplicates_15 {
   public static Node removeDuplicates(Node head)
    {
        // Your code here
        if(head==null){
            return head;
        }
        Node curr =head;
        while(curr!=null  &&  curr.next!=null){
            if(curr.data==curr.next.data  ){ //i was not comparing the currents data with the
                // currents next data`
                curr.next =curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
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
        head.next.next = new Node(20);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(45);
        head.next.next.next.next.next = new Node(45);
        head=removeDuplicates(head);
        System.out.println("This is the perfect answer for the head of the linked list : ");
        printList(head);
    }
}
