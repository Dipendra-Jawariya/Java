package JavaCodeWithHarry;

import javax.sound.midi.Soundbank;

class Base1{
    public  int x;
        Base1(){
            System.out.println("I am a constructor");
        }
        Base1(int a){
            System.out.println("I am a constructor with a value: "+ a);
        }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
//        super(0);
        System.out.println("I am a constructor of the derived class");
    }
    Derived1(int x,int y){
        super(0);
        System.out.println("i am a overloaded constructor of the derived class with the value as "+x+" "+y);
    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }


}

        class childOfderived extends Derived1{
            childOfderived(){
                System.out.println("This is the child of the derived class and grandchild child of base classs");
        }
        childOfderived(int x,int y ,int z){
                super(2,6);
            System.out.println("The overloaded constructor is "+x +" "+y +" "+ z);
        }
        }
public class contructors_in_Inheritance_46 {
    public static void main(String[] args) {
            Base1 b = new Base1();
//            Derived1 d = new Derived1(10,4);
        childOfderived c = new childOfderived(10,20,30);

    }
}
