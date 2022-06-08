public class maxMUMDifference {
    void maxDiff(int arr[]){
        int n =arr.length;
        int diff =0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if ((arr[j]-arr[i])>diff){
                    diff = arr[j]-arr[i];
                }
            }
        }
        System.out.println(diff);
    }

    void efficient(int arr[]){
        int res = arr[1]-arr[0];
        int minval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            res = Math.max(res,arr[i]-minval);
            minval = Math.min(minval,arr[i]);

        }
        System.out.println(res);
    }


    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        maxMUMDifference Obj = new maxMUMDifference();
        Obj.efficient(arr);
    }
}
