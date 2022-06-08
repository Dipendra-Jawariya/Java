public class sTOCKBuySell {
    static int maxProfit(int arr[], int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[j] > arr[i]) {
                    int cur_profit = arr[j] - arr[i] + maxProfit(arr, start, i - 1)
                            + maxProfit(arr, j + 1, end);
                    profit = Math.max(profit, cur_profit);
                }
            }
        }
        return profit;
    }

    static int EfficientMaxProfit(int arr[], int n) {
    int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[i-1]){
                profit +=(arr[i]-arr[i-1]);
            }
        }
        return profit;
}

    static  int efficient(int arr[]){
        int profit =0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                profit+= (arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr,0,arr.length));
        System.out.println(EfficientMaxProfit(arr,arr.length));
        int pro = efficient(arr);
        System.out.println(pro);
    }
}
