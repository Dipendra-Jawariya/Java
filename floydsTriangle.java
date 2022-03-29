public class floydsTriangle {
    public static void main(String[] args) {
        int num =10;
        int i ;
        int couter=1;
        for (i=1;i<=num;i++){
            for (int j =1;j<=i;j++){
                System.out.print(couter+" ");
                couter++;
            }
            System.out.println();
        }
    }
}
