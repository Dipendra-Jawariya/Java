package QueueDSA;

/*Naive approach of Queue emplemantation using array*/
//Implementation of Queue using array
//class Queue{
//    int arr[];
//    int cap;
//    int size ;
//    Queue(int c){
//        this.cap = c;
//        this.size=0;
//        arr= new int[cap];
//    }
//    void enque(int x){
//        if(isFull()){return;}
//        arr[size]=x;
//        size++;
//    }
//    void deque(){
//        if(isEmpty()){return;}
//        for (int i = 0; i < size-1; i++) {
//            arr[i]  =arr[i+1];
//        }
//        size--;
//    }
//    int getFront(){
//        if(isEmpty()){
//            return -1;
//        }
//        return arr[0];
//    }
//    int getRear()
//    {
//        if(isEmpty()){
//            return -1;
//        }
//        return arr[size-1];
//    }
//    boolean isEmpty(){
//        return (size==0);
//    }
//    boolean isFull(){
//        return  (cap==size);
//    }
//    int size(){
//        return size;
//    }
//}
/*Efficient */
class QQueue{
    int arr[];
    int cap;
    int size ;
    int front;
    QQueue(int c){
        this.cap = c;
        this.size=0;
        arr= new int[cap];
        front=0;
    }
    void enque(int x){
        if(isFull()){return;}
        front = (front+1)%cap;
        arr[front]=x;
        size++;
    }
    void deque(){
        if(isEmpty()){return;}

        size--;
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }
    int getRear()
    {
        if(isEmpty()){
            return -1;
        }
        return arr[size-1];
    }
    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return  (cap==size);
    }
    int size(){
        return size;
    }
}

public class Array_Impleementation_03 {
    public static void main(String[] args) {
        QQueue q = new QQueue(5);
    q.enque(10);
    q.enque(20);
    q.enque(30);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
     System.out.println(q.size());
     System.out.println(q.isEmpty());
    System.out.println(q.isFull());
    q.deque();
        System.out.println(q.size());

        System.out.println(q.getFront());
        System.out.println(q.getRear());

    }
}
