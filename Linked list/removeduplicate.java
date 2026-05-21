class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class removeduplicate{
     public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next!= null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        removeduplicate obj = new removeduplicate();
        ListNode result = obj.deleteDuplicates(head);

        // Print the resulting linked list
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}