//In java string are class these are not any primitive data type in java  but in java string have speciial support
//so we can use them as primitive data type
import  java.util.Scanner;
public class StringTutorial {
    public static void main(String[] args) {
//        String name = new String("Dipendra");
//        String dipendra = new String("THis is a new program for string in java"); //this is how a string is instanciated
//        System.out.println(dipendra);
//        System.out.println(name);
//        String dtr = "xyz"; // this is how java provide us to use and to initiate the string
//        Strings are immutable and it cannot be changed
//
//        System.out.println(dtr);
//        int a =9;
//        float b =455.66f;
//        System.out.printf("The value of a is %d and the value of b is %f",a,b);
//        System.out.println(" ");
//        System.out.format("The value of a is %d and the value of b is %f",a,b);
//        %d is a formate specifier


//        Taking input from the user
        Scanner sc = new Scanner(System.in);
//        String st = sc.next(); //for string input we use the next()
//        next will just takIne the first word as input if you want to take the line as input in the string
//        We have to use the nextLine()
        String dip = sc.nextLine(); //for the whole line as string input
        System.out.println("In put of the next line string");
//        System.out.println(st);
        System.out.println(dip);

    }
}
