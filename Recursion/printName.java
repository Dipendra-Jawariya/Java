package Recursion;

public class printName {
    public static void printN(String name,int count){
        if(count==0){
            return;
        }
        System.out.print(name);
        System.out.println();
        printN(name,--count);
    }
    public static void main(String[] args) {
        String name  = "Dipendra";
        printN(name,3);
    }
}
