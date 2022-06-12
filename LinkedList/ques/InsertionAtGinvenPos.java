package LinkedList.ques;

public class InsertionAtGinvenPos {
    public static  Node InsertAtPos(Node head,int pos,int data){
        Node newNode  = new Node(data);
        Node curr = head;
        for (int i =1;i<pos  && curr.next!=null;i++){
            curr=curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head= new Node(2);
        head.next= new Node(4);
        head.next.next= new Node(6);
        head.next.next.next= new Node(7);
        head.next.next.next.next= new Node(5);
        head.next.next.next.next.next= new Node(1);
        head.next.next.next.next.next.next= new Node(0);
//        head.next.next.next.next.next.next.next= new Node(99);
        head= InsertAtPos(head ,10,99);
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
    }
}
