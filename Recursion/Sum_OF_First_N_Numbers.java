package Recursion;

public class Sum_OF_First_N_Numbers {
    public static int  sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfN(n-1);
    }
    public static void sumN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumN(i-1,sum+i);
    }
    public static void main(String[] args) {
        int n =50;
        System.out.println(sumOfN(n));
        sumN(n,0);

    }
}
