import java.util.Scanner;


public class SquareofNum {
    static int SquareRoot(int num,int n){
        if(n==0){
            return 1;
        }
        if (num==0){
            return 0;
        }
       return num * SquareRoot(num,n-1);
    }
    static int Squareroot(int num,int n ){
        if (n==0){
            return 1;
        }
        if (num==0){
            return 0;
        }
//        if n is even
        if(n%2==0){
            return Squareroot(num,n/2) * Squareroot(num,n/2);
        }else{
            return Squareroot(num,n/2) *Squareroot(num,n/2)* num;
        }
    }
    public static void main(String[] args) {
        int n=3 ;
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        SquareofNum obj = new SquareofNum();

//        int ans = obj.SquareRoot(num,n);
        int ans=Squareroot(num,n);
        System.out.println(ans);

    }
}
