import  java.util.Collections;

import static java.util.Collections.swap;

public class MOveZeroEnd {
    static void NaiveMOVINGZEROS(int arr[],int n){
        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                for (int j = i+1; j < n; j++) {
                    if (arr[j]!=0){
//                        swap(arr[i],arr[j]);
                        int temp;
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

//    private static void swap(int i, int i1) {
//        int temp;
//        temp=i;
//        i=i1;i1=temp;
//    }


        static void EfficientSolution(int arr[]){
        int n = arr.length;
        int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i]!=0){
                    int temp;
                    temp = arr[i];
                    arr[i]=arr[count];
                    arr[count]=temp;
                    count++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }

    public static void main(String[] args) {

        int arr[] = {10,0,5,8,0,0,4,3,1};
        int n  =arr.length;
        NaiveMOVINGZEROS(arr,n);
        System.out.println();
        EfficientSolution(arr);
    }
}
