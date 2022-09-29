package Stack;

import java.util.Stack;

//Find if an expression has duplicate parenthesis or not
public class Stack_DSA_SHEET {
    public static boolean findDuplicateparenthesis(String str){
        Stack<Character> s = new Stack<>();
        for (char c: str.toCharArray()){
            if(c==')'){
                char top = s.pop();
                int elementInside = 0;
                while(top!='('){
                    elementInside++;
                    top = s.pop();
                }
                if (elementInside<1){
                    return  true;
                }
            }else {
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {


       // String str = "((a+b)+((c+d)))";
        String str = "((a+b)+(c+d)) ";

        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }
    }
}
