package TreesDSA;

import java.util.LinkedList;
import java.util.Queue;

// 13.Size of Binary Tree
public class Size_of_Binary_tree {
    public static int getSize(Node root){
        if(root==null){
            return 0;
        }
        return 1+getSize(root.left) + getSize(root.right);
    }
    public static int getSizeBFS(Node root){
        if (root ==null){
            return -1;
        }
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        int count=1;
        while (!q.isEmpty()){
            Node curr= q.poll();
            if(curr.left!=null){
                count++;
                q.add(curr.left);
            }
            if (curr.right!=null){
                count++;
                q.add(curr.right);
            }
            System.out.print(curr.key+" ");
        }
        System.out.println(count);
        return count;
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
        System.out.println(getSize(root));
        System.out.println(getSizeBFS(root));

    }
}
