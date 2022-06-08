import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Dipendra");
        int low=0;int high = str.length();
        System.out.println("Before the swaps:"+ str);
        String reverse="";
//        while (low<high-1){
//            char frontChar = str.charAt(low);
//            char backChar  = str.charAt(high);
//            str.setCharAt(frontChar,backChar);
//            str.setCharAt(backChar,frontChar);
//            low++;
//            high--;
//        }
        for (int i = high-1; i >=0; i--) {
            reverse = reverse +str.charAt(i);
        }
        System.out.println("After the swaps:"+ reverse);
    }
}
