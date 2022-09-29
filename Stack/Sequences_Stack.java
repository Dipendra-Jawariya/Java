package Stack;

import java.util.Stack;

// 946. Validate Stack Sequences
public class Sequences_Stack {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        s.push(pushed[0]);
        int j =0;
        int i=1;
        int counter =0 ;
        while(j<popped.length && counter!= popped.length  ){
            if(popped[j]==s.peek()){
                j++;
//                i--;
                s.pop();
                continue;
            }
                if(i< pushed.length){
                    s.push(pushed[i]);
                    i++;
                }
                counter++;

        }
        if(s.isEmpty()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int pushed[] = {1, 2, 3, 4, 5};
        int popped[] = {5,4,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
