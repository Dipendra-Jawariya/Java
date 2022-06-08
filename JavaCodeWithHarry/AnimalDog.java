package JavaCodeWithHarry;

class Animal {
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    int legs;

}
class Dog extends Animal{
    String property;
    boolean bark =true;
      void getpropety(){
        System.out.println(property);
          System.out.println(bark);
    }

}
public class AnimalDog {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.setLegs(4);
        System.out.println(dg.getLegs());
        dg.property = "Smeels";
        dg.getpropety();
    }
}
