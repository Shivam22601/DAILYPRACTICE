// class ListNode{
//      int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }
// public class hascycle{
//     public boolean hascycle(ListNode head) {
//         if (head == null || head.next == null) return false;

//         ListNode slow = head, fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {

//         ListNode head = new ListNode(3);
//         head.next = new ListNode(7);
//         head.next.next = new ListNode(5);
//         head.next.next.next = new ListNode(2);
//         // head.next.next.next.next = new ListNode(1);

//         // Creating cycle
//         head.next.next.next.next = head; // Creates a cycle

//         hascycle obj = new hascycle();
//         boolean result = obj.hascycle(head);
//         System.out.println("Does the linked list have a cycle? " + result);
//     }
// }