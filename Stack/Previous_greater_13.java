package Stack;

import java.util.Stack;


// 13.Previous Greater Elmenet
public class Previous_greater_13 {
    public static void PrevGreaterElem(int arr[],int n ){
        Stack<Integer> s = new Stack<>();
        s.add(0);
        System.out.print("-1"+" ");
        for(int i = 1; i < n; i++) {
           while(s.isEmpty()==false && arr[i]>=arr[s.peek()]){
               s.pop();
           }
           int res = s.isEmpty()?-1:arr[s.peek()];
            System.out.print(res+" ");
            s.add(i);
        }
    }
    public static void prevGreater(int arr[],int n){
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        System.out.println(-1+" ");
        for (int i = 1; i < n; i++) {
            while(s.isEmpty()==false && arr[i]>=s.peek()){
                s.pop();
            }
            int res = s.isEmpty()?-1:s.peek();
            System.out.println(res);
            s.add(arr[i]);
        }
    }

    public static void NaiveSolution(int arr[],int n ){
        for (int i = 0; i < n; i++) {
            int j ;
            for(j=i-1;j>=0;j--){
                if (arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1){
                System.out.print(-1+" ");
            }
        }
    }


    public static void main(String[] args) {
            int arr[] = {15,10,18,12,4,6,2,8};
            int n = arr.length;
            PrevGreaterElem(arr,n);
        System.out.println(" ");
//            NaiveSolution(arr,n);
        prevGreater(arr,n);
//              NaivePrevGreater(arr,n);
    }
}
