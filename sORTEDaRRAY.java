public class sORTEDaRRAY {
    static  boolean sorted(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={58,152,550};
        System.out.println(sorted(arr));
    }
}
//Functions and methods both are block of code  which performs an operation takse input and give output
//But methods are called through object of the class and functions are directly called
