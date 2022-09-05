package DEQUE;public class Circular_Tour {
//    public static void CircularTour(int petrol[],int dist[]){
//        int truckPetrol = 0;
//       int start = 0;
//       int i =0;
//       do {
//           int end =start;
//            if(petrol[i]<dist[i]){
//                start++;
////                return;
//            }
//            else{
//                truckPetrol += (petrol[i]-dist[i]);
//            }
//            if (start==end){
//                System.out.println();(start+1);
//            }
//            i++;
////           System.out.println(i+" ");
//            if (i==petrol.length){
//                i=0;
//            }
//        }while(i!=start);
//
//            System.out.println(start);
//
//    }

//    public static int CircularTour(int petrol[],int dist[]){
//        for (int start = 0; start < petrol.length; start++) {
//            int curr_start = 0;
//            int end = start;
//            curr_start +=(petrol[start]-dist[start]);
//            if(curr_start<0){
//                break;
//            }
//            end = (end+1)%petrol.length;
//            if (start==end){
//                return (start+1);
//            }
//        }
//        return -1;
//    }
    public static int circularTOUR(int petrol[],int dist[]){
        for (int start = 0; start < petrol.length; start++) {
                int curr_start = 0;
                int end = start;
                curr_start +=(petrol[start]-dist[start]);
                if(curr_start<0){
                    break;
                }
                end = (end+1)%petrol.length;
                if (start==end){
                    return (start+1);
                }
        }
        return -1;
    }
//    Efficient way of circular tour
    public static int CircularTour(int petrol[],int dist[]){
        int prev_petrol=0,curr_petrol=0;
        int start=0;
        int n = petrol.length;
        for (int i = 0; i < n; i++) {
           curr_petrol += (petrol[i]-dist[i]);
           if(curr_petrol<0){
               start = i+1;
               prev_petrol += curr_petrol;
               curr_petrol =0;
           }
        }
        return ((curr_petrol+prev_petrol)>0)?(start+1):-1;
    }
    public static void main(String[] args){
        int petrol[] ={4,8,7,4};
        int dist[] = {6,5,3,5};
        System.out.println( CircularTour(petrol,dist));
    }
}
