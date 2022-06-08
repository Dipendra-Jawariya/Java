import java.net.CacheRequest;

public class Recursion {
    public static int CalculateFactorial(int n ){
        if (n==1 || n==0){
            return 1;

        }
        int fact_num = CalculateFactorial(n-1);
        int fac = n* fact_num;
        return n* CalculateFactorial(n-1);
    }

    public static void main(String[] args) {
    int n=10;
    int var = CalculateFactorial(n);
        System.out.println(var);
    }
}
