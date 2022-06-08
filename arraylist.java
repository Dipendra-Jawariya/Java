import java.util.ArrayList;


import  java.util.*;
import java.lang.reflect.Array;
    public class arraylist {
        public static void main(String[] args) {
            ArrayList<Integer> myArrayList = new ArrayList<>();
            ArrayList<Integer> myArrayList1 = new ArrayList<>();
            myArrayList1.add(12);
            myArrayList1.add(14);
            myArrayList1.add(121);
myArrayList.addAll(myArrayList1);
            myArrayList.add(6);
            myArrayList.add(4);
            myArrayList.add(3);
            myArrayList.add(2);
            myArrayList.add(1);
            myArrayList.remove(2);
            myArrayList.add(1,10);
            for (int i = 0; i < myArrayList.size(); i++) {
                System.out.println(myArrayList.get(i));
            }
            System.out.println("After sorting");
            Collections.sort(myArrayList);
            System.out.println(myArrayList);
    }

}
