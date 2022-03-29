public class deleteArray {
   static int deleteOperation(int arr[],int x,int n){
       int i =0;
       for (i=0;i<n;i++){
           if (arr[i]==x){
               break;
           }
       }
       if (i==n){
           return n;
       }
       for (int j =i;j<n-1;j++){
           arr[j]=arr[j+1];
       }
       return n-1;
   }
//This program will just delete the first occurence of the element
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6},x =20,n=5;

        System.out.println("Array Before Deleting");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = deleteOperation(arr,x,n);
        System.out.println("Array After Deleting");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
