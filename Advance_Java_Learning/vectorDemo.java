package Advance_Java_Learning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());

//        Add operation in the vector
        vector.add(10);
        //Collection represent a group of object and everything is stored in
//  form of object and it uses auto boxing
//        Size will bee doubled in vector automatically
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        vector.add(10.7);
        System.out.println(vector.get(0));
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        
//        We can also add capacity manually
        Vector v1 = new Vector(30);
        System.out.println("Initial capacity decided manually" +
                "");
        System.out.println(v1.capacity());
        System.out.println(v1.size());


        ArrayList arr = new ArrayList();
        arr.add(323);


        System.out.println("Using Enumeration for traversing the vector");
        Enumeration enu =vector.elements();
//        Object obj =(Object) enu.nextElement();


        while (enu.hasMoreElements()){
             System.out.println(enu.nextElement());
             //             System.out.println();
         }

    }
}
