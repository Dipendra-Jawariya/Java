package TreesDSA;
//09. Print node at k distance
public class Print_Node_at_K_DIST {
    public static void printDist(Node root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.key+" ");
        }
        else{
            printDist(root.left,k-1);
            printDist(root.right,k-1);
        }
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(20);
        root.left.left =new Node(40);
        root.left.right =new Node(50);
        root.right = new Node(30);
        root.right.right =new Node(70);
        root.right.right.right =new Node(80);
        printDist(root ,3);
    }

}
