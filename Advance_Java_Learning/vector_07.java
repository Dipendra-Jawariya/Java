package Advance_Java_Learning;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class vector_07 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.add(20);
        v1.addElement(45);
        Iterator lIterator = v1.iterator();
        while(lIterator.hasNext()){
            System.out.println(lIterator.next());
        }

        Stack s  =new Stack();
        s.push("One");
        s.push("Two");
        s.push("Three");
        s.push(23);
        System.out.println(s.pop());
        System.out.println(s.peek());
//    while (s.)
//        s.pop();
//        s.pop();
//        s.pop();
//        s.pop();


//        LINKED LIST-

    }
}
