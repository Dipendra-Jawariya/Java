package TreesDSA;
//16. Children Sum Property
public class Children_sum_property {
    static  boolean children_sum(Node root){
        if (root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return ((sum== root.key) && children_sum(root.left) && children_sum(root.right));

    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right = new Node(12);
        root.right.right = new Node(9);
        root.right.left = new Node(3);
        System.out.println(children_sum(root));


    }
}
