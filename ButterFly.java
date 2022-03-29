public class ButterFly {
    public static void main(String[] args) {
        int n = 5;
//        upper half
        for (int i = 1; i <= n; i++) {
//            1 part
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
//            Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
//            2nd half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
