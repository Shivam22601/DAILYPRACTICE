// public class intersection {

//     static class ListNode {
//         int data;
//         ListNode next;

//         ListNode(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//         ListNode a = headA;
//         ListNode b = headB;

//         while (a != b) {

//             if (a == null) {
//                 a = headB;
//             } else {
//                 a = a.next;
//             }

//             if (b == null) {
//                 b = headA;
//             } else {
//                 b = b.next;
//             }
//         }

//         return a;
//     }

//     public static void main(String[] args) {

//         // Linked List A
//         ListNode headA = new ListNode(1);
//         headA.next = new ListNode(2);
//         headA.next.next = new ListNode(3);

//         // Linked List B
//         ListNode headB = new ListNode(4);
//         headB.next = new ListNode(5);

//         // Common intersection part
//         ListNode common = new ListNode(6);
//         common.next = new ListNode(7);

//         // Connect both lists
//         headA.next.next.next = common;
//         headB.next.next = common;

//         // Find intersection
//         ListNode result = getIntersectionNode(headA, headB);

//         if (result != null) {
//             System.out.println("Intersection at node: " + result.data);
//         } else {
//             System.out.println("No intersection found");
//         }
//     }
// }