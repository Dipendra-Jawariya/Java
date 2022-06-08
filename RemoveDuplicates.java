//Remove the duplicates from the array and keep only the one copy of the element and keep the element as they appeat
// int the sorted order

public class RemoveDuplicates {
//    This solution requires O(n) time complexity and O(n) space complexity which is a naive solution
    static int removeTemp(int arr[],int n){
        int temp[]=new int[n];
        temp[0]=arr[0];
        int res =1;
        for (int i = 1; i < n; i++) {
//            if (temp[res-1]!=arr[i]){
//                temp[res]=arr[i];
//                res++;
//            }
        }
        for (int i = 0; i < n; i++) {
            arr[i]=temp[i];
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
        return  res;
    }
    static int removeDup(int arr[]){
        int n = arr.length;
        int res=1;
        for (int i = 1; i <n; i++) {
            if (arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 30, 30, 30};
        int n =arr.length;
//        int s =removeTemp(arr,n);
        int s =removeDup(arr);
        for(int i = 0; i < s; i++)

        {
            System.out.print(arr[i]+" ");
        }
    }
}
