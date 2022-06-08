public class RecursionJAva {
    static void recursive(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        recursive(num-1);
    }
    static void NaturalSum(int i, int n, int sum){
        if (n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
        NaturalSum(i+1,n,sum);
    }


    public static void main(String[] args) {
        int num = 5;
//        recursive(num);
        NaturalSum(1,num,0);
    }
}
