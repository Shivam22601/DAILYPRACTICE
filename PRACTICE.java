// Stack
import java.util.Stack;
// public class PRACTICE{
//       public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
        
//         for (char ch : s.toCharArray()) {
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty()) return false;
                
//                 char top = stack.pop();
                
//                 if ((ch == ')' && top != '(') ||
//                     (ch == '}' && top != '{') ||
//                     (ch == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }
        
//         return stack.isEmpty();
//     }

//     public static void main(String[] args){
//         String s = "({[]})";
//         PRACTICE obj = new PRACTICE();
//         boolean result = obj.isValid(s);
//         System.out.println("Is the string valid? " + result);
//     }
// }

//next greater element
import java.util.HashMap;
import java.util.*;
public class PRACTICE{
    public int[] nextGreaterelement(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums2.length; i++){
            int current = nums2[i];
            while(!stack.isEmpty() && current > stack.peek()){
                map.put(stack.pop(), current);
            }
            stack.push(current);
        }
        while(stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }

    public static void main(String[] args){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        PRACTICE obj = new PRACTICE();
        int[] result = obj.nextGreaterelement(nums1, nums2);
        System.out.print("Next greater elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}