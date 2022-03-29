public class LeftRotateByOne {
    static int leftRotate(int arr[]){
        int n =arr.length;
        int temp =arr[0];
//        int temp1 =arr[1];

        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
//        arr[n-1]=temp1;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftRotate(arr);
    }
}
