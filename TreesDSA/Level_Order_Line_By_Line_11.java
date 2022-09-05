package TreesDSA;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Line_By_Line_11 {
//    Method 1
    public static void printLevelOrder(Node root){
        if (root ==null){
            return;
        }
        Queue<Node> q  = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr = q.poll();
            if (curr==null){
                System.out.println();
                q.add(null);
                continue;
                // Continue breaks the iteration and goes for the seeeecond iteration
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
                q.add(curr.right);
            }
        }
    }

//    Method 2
    public static void  printLevelOrderLineM2(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty()==false){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(20);
        root.left.left =new Node(8);
        root.left.right =new Node(7);
        root.right = new Node(30);
//        root.right.left =new Node(6);
        root.left.right.left =new Node(9);
        root.left.right.right =new Node(15);
        printLevelOrder(root);
        System.out.println();
        System.out.println("Method 2");
        printLevelOrderLineM2(root);
    }
}
