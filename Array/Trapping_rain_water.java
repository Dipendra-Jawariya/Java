package Array;

// 20 Trapping Rain Water
public class Trapping_rain_water {

    public static int getWater(int arr[]){
        int n = arr.length;
        int res =0;
        int lmax[] = new int[n];
        int rmax[]= new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }
        rmax[n-1] = arr[n-1];
        for (int i =n-2; i >=0; i--) {
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            res = res+ ( Math.max(lmax[i],rmax[i]) - arr[i]);
        }
        return res;
    }
    public static int NaiveWay(int arr[]){
        int n =arr.length;
        int res  =0;
        for (int i = 1; i <n-1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < n; j++) {
                lmax = Math.max(arr[j],lmax);
            }
            int rmax = arr[i];
            for (int j = 0; j < n; j++) {
                rmax = Math.max(arr[j],rmax);
            }
            res += (Math.min(lmax,rmax) - arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        int res  =NaiveWay(arr);
        System.out.println(res);
        System.out.println(getWater(arr));
    }
}
