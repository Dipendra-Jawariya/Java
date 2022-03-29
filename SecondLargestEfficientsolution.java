public class SecondLargestEfficientsolution {
    public static int SecondLargest(int arr[]){
        int largest =0,res =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[largest]){
                res =largest;
                largest=i;
            }
            else if (arr[i]!=arr[largest]){
                if (res==-1 || arr[i]>arr[res]){
                    res =i;
                }
            }
        }
        return res;
    }
//    This is clearly theta  n solution and auxilary requirement is theta 1
//    And it finds the second largest in one travesal only
    public static void main(String[] args) {
        int arr[]={1,20,58,626,77};
        int SecondLargest =SecondLargest(arr);
        System.out.println(SecondLargest);
    }
}
