package TreesDSA;

import static TreesDSA.Height_OF_Tree.height;

// 17. Check for Balanced Tree
public class Check_Balanced_tree_17 {
    public static boolean isBalanced(Node root){
        if (root==null){
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(10);
//        root.left=new Node(5);
        root.right=new Node(30);
        root.right.left=new Node(15);
        root.right.right=new Node(20);

        System.out.print(isBalanced(root));
    }
}
