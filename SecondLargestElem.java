public class SecondLargestElem {
    static  int getLargest(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static  int SecondLargest(int arr[]){
        int largest = getLargest(arr);
        int res =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[largest]){
                if (res==-1){
                    res=i;
                }
                else if (arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={10,15,20,44};
        int SecondLargest =SecondLargest(arr);
        System.out.println(SecondLargest);
    }
}
