class LNode{
    int data;
    LNode next;
    LNode(int x){
        data = x;
        next = null;
    }
}

public class InsertionAtBeginning {
    public static LNode inserTion(LNode head, int x) {
        LNode temp = new LNode(x);
        temp.next = head;
//        System.out.println(temp.data);
        head = temp;
        return head;
    }
    public static LNode insertionAtEnd(LNode head,int x){
        LNode newNode = new LNode(x);
        LNode curr = head;
        if (head ==null){
            return  newNode;
        }
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
    public static void printList(LNode head){
        if (head==null){
            System.out.println("The list is empty");
        }
        LNode currentNode=head;
        while (currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
//        System.out.print("NULL");

    }
public static LNode deleteFirst(LNode head){
        if (head ==null){
            return null;
        }
        return head.next;
}
public static LNode deleteLast(LNode head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return null;
        }
        LNode curr = head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head
                ;
}

public static LNode insertionAtINdex(LNode head,int pos,int data){
        LNode temp = new LNode(data);
        if(pos==1){
            temp.next =head;
            return temp;
        }
        LNode curr = head;

//
    for (int i = 1; i <= pos-2  && curr!=null;  i++) {
        curr = curr.next;
    }
    if (curr==null){
        return head;
    }
    temp.next = curr.next;
    curr.next = temp;
    return  head;
}
    public static  void main(String[] args) {
        LNode head = null;
        head = inserTion(head, 30);
//        head = inserTion(head, 20);
//        head = inserTion(head, 10);
//        System.out.println(head.data);
//        printList(head);
//        insertionAtEnd(head,50);
////        System.out.println();
//        printList(head);
//        head =deleteFirst(head);
//        head = deleteLast(head);
//        System.out.println();
        printList(head);
        head =insertionAtINdex(head, 0,25);
        System.out.println("The list after insertion at particular index");
        printList(head);
//        LNode curr = head;
//        while (curr != null) {
//            System.out.println(curr.data);
//            curr = curr.next;
//        }
        }
    }

