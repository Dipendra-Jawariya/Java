package Stack;

//Basic stack implmentation using Array

/*
* PROBLEM WITH THIS STACK IMPLEMENTATION
* 1. It does not handle underflow and overflow
* 2.No dynamic resizing*/
//


class MyStack{
    int arr[];
    int top;
    int cap;
    MyStack(int capacity){
        top=-1;
        cap=capacity;
        arr = new int[cap];
    }
    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop(){
        int res = arr[top];
        top--;
        return res;
    }
    boolean isEmpty(){
        return (top==-1);
    }
    int size(){
        return top+1;
    }
}
public class Stackdsa01 {
    public static void main(String[] args) {
     MyStack s = new MyStack(5);
//        s.isEmpty();
        System.out.println(s.isEmpty());
//        s.pop();    //undeflow the stack is empty and calling pop
        s.push(10);
        s.push(10);
        s.push(10);
    s.push(20);
    s.push(30);
    s.push(30);   //overflow the stack cap is full and pushing an item in it
        System.out.println(s.size());
        s.pop();
        System.out.println(s.size());
        s.push(20);
        s.isEmpty();


    }
}
