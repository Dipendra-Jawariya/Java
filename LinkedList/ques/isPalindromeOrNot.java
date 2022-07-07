package LinkedList.ques;
//Check if Linked List is a palindrome or not
public class isPalindromeOrNot {
    public static Node findMiddle(Node head){
        Node fast =head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        if (head==null){
            return head;
        }
        Node curr= head;
        Node prev  = null;
        while(curr!=null){
            Node next =curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
    public static boolean isPalindrom(Node head){
        if (head==null && head.next==null){
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHalf = reverse(middle.next);
        Node firstHalf = head;
        while(secondHalf!=null){
            if (firstHalf.data!=secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
//        head.next.next.next = new Node(10);
//        head.next.next.next.next = new Node(10);
//        head.next.next.next.next.next = new Node(45);
        boolean b =isPalindrom(head);
        System.out.println(b);

    }
}
