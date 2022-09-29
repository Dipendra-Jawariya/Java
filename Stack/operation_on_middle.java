package Stack;

//Design a stack with operations on middle element
class DLLNode{
    DLLNode prev;
    DLLNode next;
    int data;
    DLLNode(int data){
        this.data = data;
    }
}
class StackWithMiddleOperation{
    DLLNode dummy;
    DLLNode head;
    DLLNode mid;
    int count;
    StackWithMiddleOperation(int count){
     dummy =  new DLLNode(0);
     head = dummy;
     mid = dummy;
     this.count = count;
    }
    void push(int data){
        DLLNode curr = new DLLNode(data);
        curr.next=null;
        curr.prev  =head;
        head.next = curr;
        head= curr;
        count++;
        if(count==1){
            mid = curr;
        }
        else if (count%2==0){
            mid=  mid.next;
        }
    }
    int pop(){
        if(count==0){
            return -1;
        }
        int x = head.data;
        head = head.prev;
        head.next = null;
        if (count%2==0){
            mid= mid.prev;
        }
        count--;
        return x;
    }
    int getMiddle(){
        if (count==0){
            return -1;
        }
        return mid.data;
    }

    void deleteMiddle(){
        if (count==0){
            return;
        }
        if(count==1){
            head = null;
            mid = null;
            mid.next = null;
        }
        else if (count==2){
            head =head.prev;
            mid=mid.prev;
            head.next=null;
        }
        else{
            mid.next.prev = mid.prev;
            mid.prev.next = mid.next.next;
            if (count%2==0){
                mid = mid.prev;
            }
            else {
                mid = mid.next;
            }
        }
        count--;
    }
}
public class operation_on_middle {
    public static void main(String[] args) {
//        StackWithMiddleOperation s = new StackWithMiddleOperation(0);
//        s.push(10);
////        System.out.println(s.getMiddle());
//        s.push(15);
////        System.out.println(s.getMiddle());
//        s.push(20);
//        s.push(5);
//        System.out.println(s.getMiddle());
//        s.pop();
//        System.out.println(s.getMiddle());
        StackWithMiddleOperation ms = new StackWithMiddleOperation(0);
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);
        System.out.println("Middle Element : "
                + ms.getMiddle());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                + ms.getMiddle());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                + ms.getMiddle());
        ms.deleteMiddle();
        System.out.println("New Middle Element : "
                + ms.getMiddle());
    }
}
