class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class reverselist{
    public ListNode reverselist(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String[] args){
         ListNode head = new ListNode(3);
        head.next = new ListNode(7);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(2);
        reverselist obj = new reverselist();
        ListNode reversedHead = obj.reverselist(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}