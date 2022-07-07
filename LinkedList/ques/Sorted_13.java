package LinkedList.ques;

public class Sorted_13 {
    public static boolean isSorted(Node head){
        Node curr = head;
        while(curr.next!=null){
            if (curr.data>curr.next.data){
                return false;
            }
            curr = curr.next;

        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(390);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
      boolean b  = isSorted(head);
        System.out.println(b);
    }
}
