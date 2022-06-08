//In bubble sort we put the largest element at the end of the array by comparing every adjusent elements
class BubbleSort{
    void bubbleSort(int arr[])
    {
    int n =arr.length;
        for (int i = 0; i < n; i++) {
//            The first for loop will point to the first element
//             while the second will move to all over the array
            for (int j = 0; j < n-i-1; j++) {
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }

    void efficientBubbleSort(int arr[]){
        int n =arr.length;
        int i ,j,temp;
        boolean swapped = false;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swapped = true;
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//            If any element is not swapped and the array is already sorted
            if (swapped ==false){
                break;
            }
        }
    }



//Prints the array
void printArray(int arr[]){
    int n =arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

}


    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
//        ob.bubbleSort(arr);
        ob.efficientBubbleSort(arr);
        System.out.println("Sorted array will be");
        ob.printArray(arr);
    }
}
