public class frequencyInAnSortedArray {
    static void frequency(int arr[]){
        int n = arr.length;
        int num = arr[0];
        int counter = 1;
        for (int i =1; i < n; i++)
        {
            while ( i<n && num==arr[i]){
                counter++;
                i++;
            }
            if (i<n && num<arr[i]){
                System.out.println("the frequency of "+num+" is "+ counter);
                num=arr[i];
                counter=1;
            }
        }
//        int freq =1,i=1;
//        int n =arr.length;
//        while(i<n){
//            while (i<n && arr[i]==arr[i-1]){
//                freq++;
//                i++;
//            }
//            System.out.println(arr[i-1]+" "+ freq);
//            i++;
//            freq=1;
//        }
//        if (arr[n-1]!=arr[n-2] && n==1){
//            System.out.println(arr[n-1]+" "+ 1);
//        }
    }
    public static void main(String[] args) {
        int arr[] = {10,10,10,25,30,30,40,40};
        frequency(arr);
    }
}
