public class NumbePattern {
    public static void main(String[] args) {
        int num= 5;
        for (int i=1;i<=num;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //FOR inverted pyramid
        for (int i=num;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        Another way to do this
        System.out.println();
        for (int i =1;i<=num;i++){
             for (int j =1;j<=num-i+1;j++){
                 System.out.print(j);
             }
            System.out.println(" ");
        }
    }
}
