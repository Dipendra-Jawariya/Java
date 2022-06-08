public class SelectionSort {
    void NaiveSorting(int arr[]){
        int n = arr.length;
        int temp[] =  new int[n];
        for (int i = 0; i < n; i++) {
            int min_ind = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            temp[i] = arr[min_ind];
            arr[min_ind] =  Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            arr[i]= temp[i];
        }

    }

    void EfficientSorting(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_ind=i;
            for (int j = i; j < n; j++) {
                if (arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind] = temp;
        }
    }


    void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        SelectionSort object = new SelectionSort();
//        object.NaiveSorting(arr);
        object.EfficientSorting(arr);
        object.PrintArray(arr);

    }
}
