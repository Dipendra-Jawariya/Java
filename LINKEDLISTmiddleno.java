public class LINKEDLISTmiddleno {
    public  static  void middleNumber(LNode head){
        int count =0;
        LNode curr;
        for (curr = head;curr!=null;curr = curr.next){
            count++;
        }
        curr=  head;
        for (int i = 0; i < count/2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public static void EfficientMiddle(LNode head){
        LNode slow =head,fast = head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        LNode head =new LNode(10);
        head.next = new LNode(20);
        head.next.next = new LNode(15);
        head.next.next.next = new LNode(30);
        head.next.next.next.next = new LNode(40);
        head.next.next.next.next.next = new LNode(50);
        head.next.next.next.next.next.next = new LNode(60);
//        middleNumber(head);
        EfficientMiddle(head);
    }
}
