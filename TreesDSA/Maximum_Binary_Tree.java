package TreesDSA;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Binary_Tree {
//    Using recusive way
    public static int getMax(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
        }
    }

//    Using iterative way with the help of the DFS
    public static int getMax1(Node root){
        if (root==null){
            return 0 ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        while (!q.isEmpty()){
            Node curr  =q.poll();
            if (max<curr.key){
                max = curr.key;
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(20);
        root.left.left =new Node(8);
        root.left.right =new Node(7);
        root.right = new Node(30);
        root.right.right =new Node(6);
        root.left.right.left =new Node(9);
        root.left.right.right =new Node(50);
        System.out.println(getMax(root));
        System.out.println(getMax1(root));
    }
}
