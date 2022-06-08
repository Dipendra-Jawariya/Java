//Abstraction is hiding the unnecessary details & showing the  only the essential parts/functionalities to the user
//abstract class Animal {
//    abstract void walk();  //abstract method of abstracted class
//    public void eats(){ //it can have constructors and static methods also.
//        System.out.println("Animal eats");
//    }
////    Contructor of the animal
//    Animal(){
//        System.out.println("You are creating a new Animal");
//    }
//}
//
//class Horse extends  Animal{
//    Horse(){
//        System.out.println("created a horse");
//    }
//
//    public  void walk (){
//        System.out.println("Walks on four legs");
//    }
//}
//class Chickens extends  Animal{
//        public void walk(){
//            System.out.println("Walks on two legs");
//        }
//
//}
interface Animal{
    public void walk();
}
class Horse implements  Animal{
    public  void walk(){
        System.out.println("walks on 4 legs");
    }

}

public class Abstraction {

    public static void main(String[] args) {
    Horse horse  = new Horse();
//  Animal Animal = new Animal(); // an abstract class cannot be instanciated
//        Animal.walk();
    horse.walk();
//    horse.eats();
    }
}
