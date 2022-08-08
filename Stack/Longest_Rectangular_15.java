package Stack;

import java.util.Stack;

// 15. Largest rectangular area in a Histogram
public class Longest_Rectangular_15 {
//    Nauve Solution
    public static int NaiveLongest_Area(int arr[],int n){
        int res=0;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j =i-1; j >=0; j--) {
                if (arr[j]>=arr[i]){
                    curr+=arr[i];
                }
                else{
                    break;
                }
            }
            for (int j = i+1; j < n; j++) {
                if(arr[j]>=arr[i]){
                    curr+=arr[i];
                }
                else{
                    break;
                }
            }
            res = Math.max(curr,res);
        }
        return res;
    }

//    Efficient Solution
    public static int efficeintSol(int arr[],int n){
        Stack<Integer> s  =new Stack<>();
        int res = 0;
        int tp;
        int curr;
        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && s.peek()>=arr[i]){
                 tp = s.pop();
                curr=arr[tp]*(s.isEmpty()?i:s.peek());
                res = Math.max(curr,res);
            }
            s.push(i);
        }
        while(s.isEmpty()){
            tp=s.pop();
            curr=  arr[tp]* (s.isEmpty()?n:(n-s.peek()-1));
            res = Math.max(curr,res);
        }
        return res;
    }

//Better Solution
    public static int EffiLongest_Area(int arr[],int n){
        int res  =0;
        int ps[] = new int[n];
        int ns[] = new int[n];

        Stack<Integer> s = new Stack<>();
        int prev[] =new int[n];
        s.add(0);
        for (int i = 0; i < n; i++) {
            while(s.isEmpty()==false && arr[s.pop()]>=arr[i]){
                s.pop();
            }
            int pse = s.isEmpty()?-1:s.peek();
            ps[i] = pse;
            s.add(i);
        }
        while(s.isEmpty()==false){
            s.pop();
        }
        s.push(n-1);
        for (int i=n-1; i >=0; i++) {
            while (s.isEmpty()==false && arr[s.peek()]>arr[i]){
                s.pop();
            }
            int nse = s.isEmpty()?n:s.peek();
            ns[i]=nse;
            s.add(i);
        }
        for (int  i =0;i<n;i++){
            int curr =arr[i];
            curr+=(i-ps[i]-1) *arr[i];
            curr+=(i-ns[i]-1) *arr[i];
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,1,5,6};
        int n = arr.length;
//       int res = NaiveLongest_Area(arr,n);
//       int res1 = EffiLongest_Area(arr,n);
        System.out.print("The largest rectangular are in a Histogram is: ");
//        System.out.print(res1);
        System.out.println();
        System.out.println("this is the result of the my solution");
        System.out.println(efficeintSol(arr,n));
    }
}
