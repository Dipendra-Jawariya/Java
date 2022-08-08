package Stack;

import java.util.Stack;

public class StockSpan_12 {

//    Naive Solution with time complexity O(n2)
    public static void stock_span(int arr[]){
        int n =arr.length;
        int temp[] =new int[n];
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i-1; j >=0 && arr[j]<=arr[i]; j--) {
                    count++;
            }
            System.out.print(count+" ");
        }
    }

//    efficient Solution
    public static void Effieicent(int arr[]){
        int n = arr.length;
        Stack<Integer> s = new Stack<Integer>();
        s.add(0);
        System.out.println(1+"");
        for (int i = 1; i < n; i++) {
            while (s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span = s.isEmpty()?i+1:i-s.peek();
            System.out.println(span+" ");
            s.push(i);
        }


    }
    public static void main(String[] args) {
        int arr[] = {60,10,20,40,35,30,50,70,65};
//        stock_span(arr);
        Effieicent(arr);
    }
}
