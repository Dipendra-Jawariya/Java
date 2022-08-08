package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElem {
    public static void nextgreater(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                if (arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
                if (j==n-1){
                    flag=true;
                }
            }
            if (flag==true){
                System.out.print(-1+" ");
                flag = false;
            }
        }
        System.out.print(-1+" ");
    }
    public static void gfgNaive(int arr[],int n ){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j < n; j++) {
                if (arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==n){
                System.out.print(-1+" ");
            }
        }
    }

//    For the efficient approach of this problem we can just refer to the previous greator solution
    public static ArrayList<Integer> efficientNextGREATER(int arr[], int n ){
        ArrayList<Integer> v=new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.add(arr[n-1]);
        v.add(-1);
//        System.out.print("-1 ");
        for (int i=n-2;i>=0;i--){
            while(s.isEmpty()==false &&  s.peek()<=arr[i]){
                s.pop();
            }
            int res = s.isEmpty()?(-1):s.peek();
            v.add(res);
//            System.out.print(res+" ");
            s.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }
    public static void main(String[] args) {
        int arr[] = {5,15,10,8,6,12,9,18};
        int n = arr.length;
        nextgreater(arr,n);
        System.out.println();
//        effNextgreater(arr,n);
        gfgNaive(arr,n);
        System.out.println();
        efficientNextGREATER(arr,n);
        for (int x:efficientNextGREATER(arr,n)){
            System.out.print(x+" ");
        }
    }
}
