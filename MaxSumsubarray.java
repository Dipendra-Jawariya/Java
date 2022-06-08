import java.util.*;
public class MaxSumsubarray {
//    Time Limit Exceeded this solution is naive way to solve the problem
    public static int maxsum(int arr[]){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr=0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res =Math.max(res, curr);
            }
        }
        return res;
    }
    public  static int maxEfficient(int arr[]){
        int n = arr.length;
        int maxEnding[] = new int[n];
        maxEnding[0]=arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding[i] = Math.max(maxEnding[i-1]+arr[i],arr[i]);
        }
        int res = maxEnding[0];
        for (int i = 1; i < n; i++) {
            if (maxEnding[i]>res){
                res  = maxEnding[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={
                5,4,-1,7,8};
        System.out.println(maxsum(arr));
        System.out.println(maxEfficient(arr));

    }
}
