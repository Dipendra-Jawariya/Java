public class ques {
public static int maxint(double arr[]){
    double max = arr[0];
    int indexOfMax=0;
    for (int i = 0; i < arr.length; i++) {
        if(max<arr[i]){
            max = arr[i];
            indexOfMax = i;
        }
    }
    return indexOfMax;
}
    public static void main(String[] args) {
        int x=5,y;
        y=++x + x++ + --x;
        System.out.println(x+" " + y);
//        int arr[] =new int[5];
//        System.out.println("arr[0]:"+arr[0]);
        double arr[] = {1,5,5,5,5,1};
       ;
        System.out.println( maxint(arr));
    }
}
