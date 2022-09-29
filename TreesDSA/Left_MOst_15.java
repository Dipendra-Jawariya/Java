package TreesDSA;

import java.util.LinkedList;
import java.util.Queue;

// 15.Print the left most of the binary tree
public class Left_MOst_15 {
//    Recursive Method
    static  int maxLevel = 0;
    public static void printLeftMost(Node root,int level){
        if (root==null){
            return;
        }
        if (maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel = level;
        }
        printLeftMost(root.left,level+1);
        printLeftMost(root.right,level+1);
    }
    static void printleftView(Node root){
        printLeftMost(root,1);;
    }

    public static void levelOrder(Node root){
        Queue<Node > q  =new LinkedList<>();
        q.add(root);
//        q.add(null);
        while(!q.isEmpty()){
            int count= q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if(i==0){
                    System.out.print(curr.key+ " ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(20);
        root.left.left =new Node(40);
        root.left.right =new Node(50);
        root.right = new Node(30);
        root.right.right =new Node(60);
//        root.left.right.left =new Node(9);
//        root.left.right.right =new Node(15);
        printleftView(root);
        System.out.println();
        levelOrder(root);
    }
}
