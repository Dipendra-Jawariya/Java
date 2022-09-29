package Recursion;

public class Print1ToN_BackTracking {
    public static void print1toN(int n ){
        if(n>=10){
            return;
        }
        print1toN(++n);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 0;
        print1toN(n);
    }
}
