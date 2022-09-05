package TreesDSA;

import java.util.LinkedList;
import java.util.Queue;

// 10.Level Order Traversal
public class Level_Order_traversal_10 {
    public static void printLevel(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.print(root.key+" ");
        while(q.isEmpty()==false){
            Node curr = q.poll();
            if (curr.left!=null){
                System.out.print(curr.left.key+" ");
                q.add(curr.left);
            }
            if(curr.right!=null){
                System.out.print(curr.right.key+" ");
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(20);
        root.left.left =new Node(8);
        root.left.right =new Node(7);
        root.right = new Node(30);
        root.right.right =new Node(6);
        root.left.right.left =new Node(9);
        root.left.right.right =new Node(15);
        printLevel(root);
    }
}
