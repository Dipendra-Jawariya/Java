public class ReverseArrayJAva {
    static int reverseArray(int arr[]){
        int low =0,high=arr.length-1;
        while (low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        return 0 ;
    }


    public static void main(String[] args) {
        int arr[]={10,5,22,33,88};
        reverseArray(arr);
//        EfficientSwap(arr);
    }
}
