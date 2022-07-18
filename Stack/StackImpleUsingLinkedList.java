package Stack;
//Linked list handles both dynamic allocation and overflow as well as underflow
 class Node{
     int data;
     Node next;
     Node(int data){
         this.data = data;
         this.next = null;
     }
 }
 class MyStack1{
    Node head;
    int sz;
    MyStack1(){
        head = null;
        sz=0;
    }
    int size(){
     return sz;
    }
    boolean isEmpty(){
        return (head==null);
    }
    Node push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head=  temp;
        sz++;
        return head;
    }
    int pop(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head =head.next;
        sz--;
        return res;
    }
    int peek(){
        if(head==null){
            return  Integer.MAX_VALUE;
        }
        return head.data;
    }
 }
public class StackImpleUsingLinkedList {
//     public static MyStack1 traverse(Node my){
//         while (my.next==null){
//             System.out.println(my.data);
//             my = my.next;
//         }
//     }
    public static void main(String[] args) {
        MyStack1 my = new MyStack1();
        my.push(20);
        my.push(30);
        my.push(40);
        my.push(500);
        System.out.println(my.push(20));
        System.out.println(
                my.pop()
        );
        System.out.println(my);
        System.out.println(
                my.isEmpty()
        );
        System.out.println(
                my.peek()
        );
    }
}
