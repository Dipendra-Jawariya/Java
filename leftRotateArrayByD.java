import java.util.Scanner;

public class leftRotateArrayByD {
    static  int leftRoteArrayfortwoElem(int arr[]){
        int n=arr.length;
      int temp = arr[0];
      int temp1 = arr[1];
      int j ;
            for (j = 2; j <n; j++) {

                arr[j-2]=arr[j];
            }
        arr[n-2]=temp;
        arr[n-1] = temp1;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        return 0;
    }

    static  void leftRotateByOne(int arr[]){
        int n=arr.length;
        int temp = arr[0];
        for (int i = 1; i <n ; i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    static void leftRoteArray(int arr[],int d){
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

//    Method 2 an MUCH BETTER SOLUTION //Here we are copying the first d element int the temparery array and then we
//    shift the element from the d indx to the last index nd comping the d elements to the last d indises
//    But this solution is having big O(d) extra space
    static  void leftRotateArraySECONDSOLUTION(int arr[],int d,int n){
        int[] temp=new int[d];;
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        for (int i=d;i<n;i++){
            arr[i-d]=arr[d];
        }
        for (int i = 0; i < d; i++) {
            arr[n+i-d]=temp[i];
        }
    }

//Method 3 with O(1) space as well as time complexity
    static void leftRotateArraySolutionThird(int arr[],int d){
        int n =arr.length;
        reverse(arr,0,d);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void  reverse(int arr[],int low,int high){
        int temp;
        while(low<high){
            temp = low;
            low  = high;
            high = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Enter the number by which you want to rotate the array");
        Scanner sc =new Scanner(System.in);
        int d = sc.nextInt();
        leftRoteArray(arr,d);
        int n =arr.length;
//        leftRotateArraySECONDSOLUTION( arr, d,n);
        leftRotateArraySolutionThird(arr,d);
//        leftRoteArrayfortwoElem(arr);
    }
}
