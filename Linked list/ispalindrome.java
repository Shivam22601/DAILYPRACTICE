// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }
// public class ispalindrome {
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(2);
//         head.next.next.next.next = new Node(1);

//         System.out.println(isPalindrome(head)); // Output: true
//     }

//     public static boolean isPalindrome(Node head) {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         // Step 1: Find the middle of the linked list
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Step 2: Reverse the second half of the linked list
//         Node secondHalfHead = reverseList(slow);

//         // Step 3: Compare the first half and the reversed second half
//         Node firstHalfHead = head;
//         while (secondHalfHead != null) {
//             if (firstHalfHead.data != secondHalfHead.data) {
//                 return false; // Not a palindrome
//             }
//             firstHalfHead = firstHalfHead.next;
//             secondHalfHead = secondHalfHead.next;
//         }

//         return true; // It's a palindrome
//     }

//     private static Node reverseList(Node head) {
//         Node prev = null;
//         Node current = head;

//         while (current != null) {
//             Node nextNode = current.next; // Store next node
//             current.next = prev; // Reverse the link
//             prev = current; // Move prev to current
//             current = nextNode; // Move to next node
//         }

//         return prev; // New head of the reversed list
//     }
   
// }