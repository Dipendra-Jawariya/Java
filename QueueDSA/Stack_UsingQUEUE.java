package QueueDSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//07.implement stack using queue
//class Stack{
//   static Queue<Integer> q1 = new LinkedList<Integer>();
//   static Queue<Integer> q2 = new LinkedList<Integer>();
//
//   static int size;
//   Stack(){
//       size=0;
//   }
//   int top(){return q1.peek();}
//    int pop(){return q1.remove();}
//    int size(){
//       return q1.size();
//    }
//   void push(int x){
//       size++;
//       while(!q1.isEmpty()){
//           q2.add(q1.top());
//           q1.pop();
//       }
//   }
//
//
//}
//Reversing the stack
public class Stack_UsingQUEUE {
    static void Print(Queue<Integer> queue)
    {
        for(Integer x: queue)
            System.out.print(x + " ");
    }
    static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.add(queue.remove());

        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reverseQueue(queue);
        Print( queue);
    }
}
