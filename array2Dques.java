import java.util.Scanner;

//takes a natrix as input from the user.Search for given
//number x and print the indices at which it occurs.
public class array2Dques {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();
        int cols=sc.nextInt();
        System.out.println("Enter the number to be found out the index in array:");
        int x = sc.nextInt();

        int[][] number = new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

//        Output of the particulat number
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                if (number[i][j]==x)
                    System.out.print("("+i+","+j+")");
            }
        }

    }
}
