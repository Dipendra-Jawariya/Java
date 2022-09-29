package TreesDSA;
public class BTtoDLL_19 {
    static Node prev = null;
    public static Node convert(Node root){
        if(root==null){
            return root;
        }
        Node head = convert(root.left);
        if(prev ==null){
            head= root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convert(root.right);
        return head;
    }
    public static void main(String[] args) {
        Node root  =new Node(10);
        root.left  = new Node(5);
        root.right = new Node(20);
        root.right.right =new Node(35);
        root.right.left =new Node(30);
        Node head = convert(root);
        printlist(head);
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }
}
