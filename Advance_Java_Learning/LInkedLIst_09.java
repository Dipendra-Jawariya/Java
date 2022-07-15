package Advance_Java_Learning;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedLIst_09 {
    public static void main(String[] args) {
       LinkedList l = new LinkedList();
        System.out.println(l);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);


        System.out.println("Traversal of the linkedlist by Iterator");
        Iterator itr = l.iterator();
        System.out.println(itr);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("traversal by listIterator");
        ListIterator ltr = l.listIterator();
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        System.out.println("Reverse traversal by ListIterator");
        while(ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }
    }
}
