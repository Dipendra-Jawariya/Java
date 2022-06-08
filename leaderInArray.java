public class leaderInArray {
    static  void leader(int arr[]){  //Naive solution to find the leader in an array it can be further optimized and
//        reduce the time complexity
        int n = arr.length;
        int d=0;
        for (int i = 0; i < n; i++) {
            boolean flag =false;
            for (int j = i+1; j < n-1; j++) {
                if (arr[i]<=arr[j]){
                    flag = true;
                    break;
                    }
            }
            if (flag ==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
//    In this solution the last element is always the leader and the we travese the array from the last element and
//    print the leaders this can be change but this is efficient solution to print the leaders with Theta(n) solution but the
//    drawback here is it prints the leaders from the right to left if we want to print hte element in left to right then
//   we have to make an array of n and store the learders and reverse that array and print it
    static void leaderEfficient(int arr[]){
        int n =arr.length;
        int cur_ldr = arr[n-1];
        System.out.println(cur_ldr);
        System.out.println(cur_ldr);
        for (int i = n-2; i >=0; i--) {
            if (arr[i]>cur_ldr){
                cur_ldr = arr[i];
                System.out.print(cur_ldr+" ");
            }

        }
    }


    public static void main(String[] args) {
        int arr[] = {7,10,4,3,6,5,2};
        leader(arr);
        leaderEfficient(arr);
    }
}
