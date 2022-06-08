import org.w3c.dom.Node;

class Node1{
    int data;
    Node1 next;
    Node1(int x){
        data = x;
        next = null;
    }
}
public class SortedInsetionINLinkedLIst {
    public static Node1 SortedInsertion(Node1 head ,int x){
        Node1 temp =new Node1(x);
        if (head==null){
            return temp;
        }
        if (head.data>x){
            temp.next = head;
            return temp;
        }
        Node1 curr = head;
        while( curr.next!=null  && curr.next.data<x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
    public static void printList(Node1 head){
        while (head!=null){
            System.out.print(head.data+" ");
            head =head.next;
        }
    }
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head = new Node1(15);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        printList(head);
        System.out.println("List before insertion");
        head= SortedInsertion(head , 72);
        printList(head);

    }
}
