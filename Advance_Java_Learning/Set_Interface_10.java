package Advance_Java_Learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Hash set does not allow duplicacy and ordering unlike list allow duplicacy and insertion ordering

class Employee{
    int id ;
    String name,address;
    Employee(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void show(){
        System.out.print(id+" ");
        System.out.print(name+" ");
        System.out.print(address+" ");
    }
}


public class Set_Interface_10 {

    public static void main(String[] args) {
        Employee e1 = new Employee(100,"Dipendra","Kandiya Police Line");
        Employee e2 = new Employee(101,"Bhavishya","Indore");
        Employee e3 = new Employee(102,"piyush","Kandiya");
        Employee e4 = new Employee(102,"piyush","Kandiya");
        Set<Employee> h =new HashSet<Employee>();// we shoul make the object implementing class and reference of interface
//        hashMap internally takes key value pair
        h.add(e1);
        h.add(e2);
        h.add(e3);
        h.add(e4);
        System.out.println(h);

        Iterator<Employee> i  = h.iterator();
        while(h.iterator().hasNext()){
            Employee type = (Employee) i.next();
            type.show();
        }

//        h.add(123);
//        h.add(1234);
//        h.add(1235);
//        h.add(1236);
//        h.add(1237);
//        h.add(1238);
//        h.add(1238);
    }
}
