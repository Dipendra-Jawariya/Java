package Stack;

import java.util.Stack;

public class Previous_smaller {
    public  static void prevSmaller(int arr[]){
        int n = arr.length;
        Stack<Integer> s= new Stack<>();
        s.add(arr[0]);
        System.out.print(-1+" ");
        for (int i = 1; i < n; i++) {
            while(!s.isEmpty() && arr[i]<=s.peek()){
                s.pop();
            }
            int res  = (s.isEmpty())?-1:s.peek();
            System.out.print(res+" ");
            s.push(arr[i]);
        }
    }
    public static void nextSmaller(int arr[]){
        int n =arr.length;
        Stack<Integer> s =new Stack<>();
        s.add(arr[n-1]);
        int dist[]= new int[n];
        dist[n-1] = arr[n-1];
        System.out.print(dist[n-1]+" ");
//        System.out.print(0+" ");
        for (int i = n-2; i >=0 ; i--) {
            while(!s.isEmpty() && arr[i]<=s.peek()){
                s.pop();
            }
            int res = (s.isEmpty())?0:s.peek();
             dist[i] = arr[i]-res;
            System.out.print(dist[i]+" ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,4,6,2,3};
//        prevSmaller(arr);
//        -1 4 4 5 8 8 -1 3
        System.out.println();
        nextSmaller(arr);
    }
}
