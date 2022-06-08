package LinkedList;
/*Find the nth node from the ened of the linked list*/
class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class nthNode15dsa {
    public static  void NthNode(Node head , int pos){
        int count = 0;
        if (head==null){
            return;
        }
        Node curr ;
        for (curr= head;curr!=null;curr = curr.next){
            count++;
        }
        curr =head;
        int res= count-pos;
        if (count<pos){
            return;
        }
        for (int i =0;i<res;i++){
            curr = curr.next;
        }

        System.out.println(curr.data);

    }
    public static void method2(Node head , int pos){
        if (head==null){
            return;
        }
        Node first = head;
        for (int i =0;i<pos;i++){
            if (first==null){
                return;
            }
            first = first.next;
        }
        Node second = head;
        while(first!=null){
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);

        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(40);
        method2(head,5);
    }
}
