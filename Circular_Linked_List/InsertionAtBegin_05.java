package Circular_Linked_List;

public class InsertionAtBegin_05 {
    public static Node insertionAtBeginningEfficient(Node head,int x){
//        This solution takes O(1) time complexity for the solution
        Node temp  = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
        }
        return head;
    }
    public  static Node InsertionAtBegin(Node head,int x){
//        This soluton takes the whole iteration of the linked list to do insertion at the beginning
        Node temp = new Node(x);
        if(head==null){
           temp.next = temp;
        }
        else{
            Node curr = head;
            while(curr.next!=head){
                curr =curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
       return temp;
    }
    public  static  void itereationCircularList2(Node head){
        Node p = head;
        do {
            System.out.println(p.data);
            p = p.next;
        }while(p!=head);
    }
    public static Node InsertAtEND(Node head,int x){
        Node temp  = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while (curr.next!=head){
            curr= curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }
    public static  Node efficientInsertATEND(Node head,int x){
        Node temp = new Node(x);
        if(head ==null){
            temp.next=temp;
            return temp;
        }
        temp.next = head.next;
        head.next =temp;
        int t = head.data;
        head.data =temp.data;
        temp.data = t;
        return temp;
    }

    //08. Delete head of Circular linked list

    public static Node deleteHeadOfList(Node head){

        if (head == null){
            return null;
        }
        if (head.next == head){
            return null;
        }
        Node curr = head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=head.next;
//            head= head.next;

        return curr.next;
    }
    public  static Node deleteEfficient(Node head){
        if (head==null){
                return null;
            }
        if(head.next==head){
            return null;
        }
        head.data = head.next.data;
        head.next=  head.next.next;
        return head;
    }

//    09.Delete kth node from a Circular Linked List
    public  static Node delKTHNode(Node head,int k){
//        Numbere of nodes are greater or equal to k
        if(head==null){
            return null;
        }
        if(k==1){
           return deleteEfficient(head);
        }
        Node curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr =curr.next;
        }
        curr.next = curr.next.next;
        return head;


    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        int x = 1;
//        int val = head.data;
//        head =InsertionAtBegin(head,x);
//        head = insertionAtBeginningEfficient(head,x);
//        head =InsertAtEND(head,x);
//        head = efficientInsertATEND(head,x);
        System.out.println("Original List");
        itereationCircularList2(head);
        System.out.println("Modified List");

//        head = deleteHeadOfList(head);
//        head = deleteEfficient(head);
        head = delKTHNode(head,1);
         itereationCircularList2(head);
    }

}
