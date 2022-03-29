//public class largestelement {
//    public static void main(String[] args) {
//        int max = 0;
////        int n =5;
////        int arr[] ={10,5,20,8,4};
//        int arr[] ={4,4,4,4,4};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>arr[max]){
//                max = i;
//            }
//        }
//        System.out.print("The index of the largest element is: ");
//        System.out.println(max);
//
//    }
//}
public class largestelement {
    static  int getLargest(int arr[]){
    int  n = arr.length,i;
    int max = arr[0];
        for ( i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,14,49,47,455};
        System.out.println(getLargest(arr));
    }
}