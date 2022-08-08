package Stack;

import java.util.Stack;

class MYstack {
    Stack<Integer> ms;
    Stack<Integer> as;

    MYstack() {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x) {
        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x);
            return;
        }
        ms.push(x);
        if (as.peek() >= ms.peek()) {
            as.push(x);
        }
    }

    int pop() {
        if (ms.peek() == as.peek()) {
            as.pop();
        }
        return ms.pop();
    }

    int top() {
        return ms.peek();

    }

    int getMin() {
        return as.peek();
    }
}
public class StkMInElem_18 {
    public static void main(String[] args) {
        MYstack s=new MYstack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();
        System.out.print(" Minimum Element from Stack: " + s.getMin() );
    }

}
