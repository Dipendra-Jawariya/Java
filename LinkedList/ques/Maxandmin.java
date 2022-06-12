package LinkedList.ques;
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class Maxandmin {
    public static int MaxMin(Node head){
        int max ,min;
        Node curr=head;
        max = curr.data;
        min = curr.data;
        while(curr!=null){
            if (curr.data>max){
                max = curr.data;
            }
            if (curr.data<min){
                min = curr.data;
            }
            curr=curr.next;
        }
        System.out.println(min +" "+ max);
        return max;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
         head.next = new Node(4);
         head.next.next = new Node(10);
         head.next.next.next = new Node(20);
         head.next.next.next.next = new Node(50);
         head.next.next.next.next.next = new Node(98);
        int max = MaxMin(head);
        System.out.println(max);
    }
}
