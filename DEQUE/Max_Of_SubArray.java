package DEQUE;

import java.util.Deque;
import java.util.LinkedList;

public class Max_Of_SubArray {
    static void printMaxK(int arr[], int k){
        int n =arr.length;
        for (int i = 0; i < n - k + 1; i++) {
            int mx = arr[i];
            for (int j = i+1; j < i + k; j++) {
                mx = Math.max(arr[j],mx);
            }
            System.out.print(mx+" ");

        }
    }

//    Using Deque
    static void printMaxKElem(int arr[],int k){
        int n =arr.length;
        Deque<Integer> dq= new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peek()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i = k; i < n; i++) {
            System.out.print(arr[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeFirst();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);
    }
    public static void main(String[] args) {
        int arr[] = {10,8,5,12,15,17,6};
        printMaxK(arr,3);
        System.out.println();
        printMaxKElem(arr,3);
    }
}
