package LinkedList.ques;
//Find the nth node from the end +delete the nth node
public class nthNodeFromEnd {
    public static  Node removeNthFromEnd(Node head, int n) {
        int len =0;
        for(Node curr =head;curr!=null;curr=curr.next){
            len++;
        }
        if(len<n){
            return null;
        }
        Node curr =head;
        for(int i =0;i<(len-n);i++){
            curr = curr.next;
        }
        curr.next =curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(45);
        head.next.next.next.next.next = new Node(45);
         head=removeNthFromEnd(head,2);
        Node ucrr = head;
        while(ucrr!=null){
            System.out.print(ucrr.data+" ");
            ucrr =ucrr.next;
        }
    }
}
