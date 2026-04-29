class ListNode{
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
}
}

public class PRACTICE {

    public static boolean hascycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        

        System.out.print(hascycle(head));
        
    }

   
}