import java.util.Scanner;

public class problemJAVAch03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();
        str  = str.toLowerCase();
        System.out.println(str);
        str = str.replace(" ","_");
        System.out.println(str);


    }
}
