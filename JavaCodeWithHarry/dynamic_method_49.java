package JavaCodeWithHarry;
//Dynamic dispatch ?
//why do we use dynamic dispatch
class Phone{
    public void on(){
        System.out.println("Turning on phone....");
    }
    public void ShowTime(){
        System.out.println("Time is 8 pm");
    }

}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("TUrning on smartPhone....");
    }
    public void music(){
        System.out.println("Playing Music..");
    }
}
public class dynamic_method_49 {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        Whenever the is a new keyword in java the object will be created on the runtime
//        SmartPhone sobj =new SmartPhone();
//        obj.name();
        Phone obj = new SmartPhone(); //Yes it is allowed
//        Here the reference is of the super class and the object is of the subclass;
//        But we cannot refer to the subclass and make object of the superclass
//        SmartPhone  obj1 = new Phone();

        obj.ShowTime();
        obj.on();  //This will run t he method of the object not the refernce
//        obj.swagat();
//    obj.music(); Not allowed
    }
}
