package QueueDSA;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class ListQueue{
    Node front,rear;
    int size;
    ListQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    void enque(int x){
        size++;
        Node temp = new Node(x);
        if(front==null){
            front=rear= temp;
        }
        rear.next=temp;
        rear=temp;
    }
    void deque(){
        size--;
        if(front==null ||front.next==null){
        return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
}
    int size(){
    return size;
    }
    int getFront(){
        if(front==null){
            return -1;
        }
        return front.data;
    }
    int getRear(){
        return rear.data;
    }
}
public class LinkedList_Implementation {
    public static void main(String[] args) {
    ListQueue q = new ListQueue();
    q.enque(10);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.size());
        q.enque(30);
        q.enque(40);
        q.enque(50);
        System.out.println(q.getRear());
        q.deque();



    }
}

