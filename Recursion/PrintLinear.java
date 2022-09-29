package Recursion;

import javax.sound.midi.Soundbank;

//Print linear fron 1 to N
public class PrintLinear {
    public static void printNumber(int n){
        if(n<=0){
            return;
        }
//        System.out.println(n);
        System.out.println(n);
        printNumber(--n);
    }
    public static void main(String[] args) {
        int n =10;
            printNumber(n);
    }
}
