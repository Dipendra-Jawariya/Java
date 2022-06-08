// polymorphism is the ability of doing the same work with different types it is known as polymorphism there are two
// type
// of polymorphism 1. compile time polymorphism(function overloading) 2. runtime polymorphism(function overwriting)
//Function overloading = (Method overloading)  -- is a technique which allow you to have more than one function with
// the
// same function name but with different functionality. Method overloading can be possible on the following basis
// 1. the return type ofthe overloaded function
//2. the type of the parameters passed to the function
//3.The number of the parameters passed to the function
class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name , int age) {
        System.out.println(name + " " + age);
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Dipendra";
        s1.age = 20;
        s1.printInfo(s1.age);  //function with the same name is carrying out different functionalities
        s1.printInfo(s1.name,s1.age);
        s1.printInfo(s1.name);
    }
}
