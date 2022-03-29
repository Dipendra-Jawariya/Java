public class InsersionArray {
    static int insertion(int arr[],int n ,int x,int cap, int position){
       int index =position -1;
       for (int i =n-1;i>=index;i--) {
           arr[i + 1] = arr[i];
       }  arr[index]=x;
            return (n+1);
        }

    public static void main(String[] args) {
        int arr[] = new int[5],cap = 5,n=3;
        arr[0]=5;arr[1]=10;arr[2]=20;
        System.out.println("Before Insertion");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int position = 2;//position at which we have to insert the number
        int x = 8;//number which is going for input
        n = insertion(arr,n,x,cap,position);
        System.out.println("After Insertion");
       for(int i =0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
