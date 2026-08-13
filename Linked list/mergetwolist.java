class ListNode{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class mergetwolist{
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        // Remaining nodes attach karo
        if(list1 != null) {
            temp.next = list1;
        }
        else {
            temp.next = list2;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        mergetwolist solution = new mergetwolist();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}