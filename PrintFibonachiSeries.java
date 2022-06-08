public class PrintFibonachiSeries {
    public static void printFib(int a ,int b, int n){
        if (n==0){
            return;
        }
    int fibonachi = a+b;
        System.out.print(fibonachi+" ");
        printFib(b,fibonachi,n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        printFib(a,b,n-2);
    }
}
