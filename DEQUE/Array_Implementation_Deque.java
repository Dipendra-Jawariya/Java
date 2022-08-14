package DEQUE;
//Deque implementation using Deque
class  Deque{
        int arr[];
        int cap,front,size;
        Deque(int c){
            cap =c;
            front=size=0;
//            rear=(cap-1);
            arr = new int[cap];
        }
        void insertFront(int x){
//            if(isEmpty()){
//                arr[front] = x;
//                return;
//            }
            if (isFull()){
                return;
            }
            front = (front+1)%cap;
            arr[front]  = x;
            size++;
        }
        void insertRear(int x){
            if (isFull()){
                return;
            }
//            rear=(rear+1)%cap;
//            arr[rear] = x;
            size++;
        }
        boolean isFull(){
            return size==cap;
        }
        boolean isEmpty(){
            return size==0;
        }
        int deleteFront(){
            if (isEmpty()){
                return -1;
            } int res = arr[front];
            front = (front+1)%cap;

            size--;
            return res;
        }
        void deleteRear(){
            if (isEmpty()){
                return;
            }
//            rear=(rear+1)%cap;
            size--;
        }

        int getFront(){
           return arr[front];
        }
        int getRear(){
//            return arr[rear];
            return -1;
        }
        int size(){
            return size;
        }

     }

//Simple Implementation
class Deque1{
    int arr[];
    int size,cap;
    Deque1(int cap){
        this.cap = cap;
        int size=0;
        arr= new int[cap];
    }
    boolean isFull(){
        return size==cap;
    }
    boolean isEmpty(){
        return size==0;
    }
    void insertRear(int x){
        if (isFull()){return;}
        arr[size]=x;
        size++;
    }
    void deleteRear(){
        if (isEmpty()){
            return;
        }
        size--;
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return size;
    }
    void insertFront(int x){
        if(isFull()){return;}
        for (int i = size-1; i >=0; i--) {
            arr[i+1] = arr[i];
        }
        size++;
    }
    void deleteFront(){
        if(isEmpty()){return;}
        for (int i = 0; i < size - 1; i++) {
            arr[i]=arr[i+1];
           }
        size--;
    }
    int getFront(){
        if (isEmpty()){return -1;}
        else return size;
    }


}
public class Array_Implementation_Deque {
    public static void main(String[] args) {
        Deque d = new Deque(5);
//        System.out.println(d.size);
        d.insertFront(10);
        d.insertFront(20);
        d.insertRear(30);
        System.out.println("Rear is"+d.getRear());
        System.out.println("Front is "+d.getFront());
        d.insertFront(40);
//        d.deleteFront();
//        d.insertRear(90);
        System.out.println("Front is "+d.getFront());
        System.out.println("Rear is"+d.getRear());
        System.out.println("size is "+d.size);


    }
}
