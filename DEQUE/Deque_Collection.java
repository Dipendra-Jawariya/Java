package DEQUE;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_Collection {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
//        d.offerFirst(10);
//        d.offerLast(20);
//        d.offerFirst(5);
//        d.offerLast(15);
//        System.out.println(d.peekFirst());
//        System.out.println(d.peekLast());
//        d.pollFirst();
//        d.pollLast();
////        d.pollFirst();
////        d.pollLast();
//        System.out.println(d.peekFirst());
//        System.out.println(d.peekLast());

//        The above functions do not throw any kind of exceptions
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
//        d.removeFirst();
//        d.removeLast();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());


//        Traversing the Deque from first to last using iterator and foreach
        Iterator it = d.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        for (int x:d
             ) {
            System.out.print(x+" ");
        }
        System.out.println();



//        traversing the deque from last to first using iterator
        Iterator lit = d.descendingIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
        }
        System.out.println();
    }
}
