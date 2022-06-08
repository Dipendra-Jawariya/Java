import java.util.*;
import java.io.*;
import java.lang.*;
public class MaximumDifference {
    static  void maxDiff(int arr[]){
        int n = arr.length;
       int res = arr[1]-arr[0];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                res = Math.max(res,arr[j]-arr[i]);
                 }
            }
        System.out.println(res);
        }


//        This is efficient solution to find the maximum difference  where j>i
//    The time complexity of this solution is THETA(n) and it requires THETA(1) auxilary space
    static  void maxDiffEfficient(int arr[]){
        int n = arr.length;
        int res = arr[1]-arr[0];
        int minVal =arr[0];
        for (int j = 0; j < n ; j++) {
            res = Math.max(res,arr[j]-minVal);
            minVal = Math.min(minVal,arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        maxDiff(arr);
        maxDiffEfficient(arr);
    }
}
