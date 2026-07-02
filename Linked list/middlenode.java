// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// public class middlenode{
//     public ListNode middleNode(ListNode head){
//         if(head == null)return null;
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;

//     }
//     public static void main(String[] args) {

//         ListNode head = new ListNode(3);
//         head.next = new ListNode(7);
//         head.next.next = new ListNode(5);
//         head.next.next.next = new ListNode(2);
//         // head.next.next.next.next = new ListNode(1);

//         middlenode obj = new middlenode();
//         ListNode middle = obj.middleNode(head);
//         System.out.println("Middle node value: " + middle.val);
//     }
// }