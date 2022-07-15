package JavaCodeWithHarry.AbstractClasses;
abstract class parent{
    public parent(){
        System.out.println("I am the constructor of the base class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Morning");
    }
}
 abstract class child2 extends parent{
//    public void greet(){
//        System.out.println("I am not going to wish you");
//    }
    public void th(){
        System.out.println("I am good");
    }
}
public class AbstractioDemo {
    public static void main(String[] args) {
//We cannot create the object of the abstract class
//        Abstract classes are th just standard to make other classes
//        parent p = new parent() ;
        child c = new child();
        }
    }

