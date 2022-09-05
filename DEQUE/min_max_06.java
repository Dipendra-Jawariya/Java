package DEQUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//Design a data structure that supports all its operations in O(1) time
class MyDs{
    Deque<Integer> dq ;
    MyDs(){
        dq= new LinkedList<>();
    }
    void insertMin(int x){
        dq.offerFirst(x);
    }
    void insertMax(int x){
        dq.offerLast(x);
    }
    int getMin(){
        return dq.pollFirst();
    }
    int getMax(){
        return dq.pollLast();
    }
}
public class min_max_06 {
    public static void main(String[] args) {
        MyDs d = new MyDs();
        d.insertMin(5);
        d.insertMax(10);
        d.insertMin(3);
        d.insertMax(15);
        d.insertMin(2);
        System.out.println(d.getMin());
        System.out.println(d.getMax());
        d.insertMin(1);
        System.out.println(d.getMin());
        d.insertMax(20);
        System.out.println(d.getMax());
    }
}
