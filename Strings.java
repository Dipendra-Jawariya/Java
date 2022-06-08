import java.util.*;
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dipednra");
        System.out.println(sb);

        //Char at index
        System.out.println(sb.charAt(4));//THis will just print the character at the particular index

//        Set character at index
//        sb.setCharAt(1,'e'); //ub string builder we can just simply charnge any of the character with just one function
//         which saves a lot of time
//        System.out.println(sb);

//        Inserting in an stringwhich is not possible in string but can be done with the help of stringbuilder
//        sb.insert(0,'s');
//        System.out.println(sb);

//        Delete and item from the string
//        sb.delete(0,5);
//        System.out.println(sb);

//        Append operation on strings
        sb.append(" Jawariya ji"); // str = str +'Jawariya'
        sb.append(" k");
        sb.append(" j");
        System.out.println(sb.length());
    }
}
//String are immutable in java and in most of the programming languages
// so if we want to update or to change anything in string we have to store the whole string in a new string and
// then operate which is a quite hactic and time taking task to perform so we need a new string class to perform operation
// on string so we got STRING BUILDERS


//STRINGS ARE IMMUTABLE
