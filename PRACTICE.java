
import java.util.List;


// import java.lang.reflect.Array;

//Contains Duplicate
// import java.util.HashSet;
// public class PRACTICE{
//     public static boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             if (set.contains(num)) {
//                 return true; // Duplicate found
//             }
//             set.add(num);
//         }
//         return false; // No duplicates found
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5, 2};
//         System.out.println(containsDuplicate(nums));
//     }
// }

//intersection of two arrays
// import java.util.HashSet;
// public class PRACTICE{
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> set1 = new HashSet<>();
//         for (int num : nums1){
//             set1.add(num);
//         }
//         HashSet<Integer> result = new HashSet<>();
//         for(int num :nums2){
//             if(set1.contains(num)){
//                 result.add(num);
//             }
//         }
//         int[] ans = new int[result.size()];
//         int index = 0;
//         for(int val : result){
//             ans[index++] = val;
//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         int[] nums1 = {1, 2, 2, 1};
//         int[] nums2 = {2, 2};
//         PRACTICE p = new PRACTICE();
//         int[] result = p.intersection(nums1, nums2);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }


//Two sum
// import java.util.*;
// public class PRACTICE{
//     public int[] twoSum(int[] nums, int target){
//         int n =  nums.length;
//         for(int i = 0; i < n ; i++){
//             int remaining = target - nums[i];
//             int  j = i + 1;
//             while(j < n){
//                 if(nums[j] == remaining){
//                     return new int[]{i, j};
//                 }
//                 j++;
//             }
//         }
//             return new int[] {};
//    }

//    public static void main(String[] args) {
//     int[] nums = {2, 7, 11, 15};
//     int target = 9;
//     PRACTICE p = new PRACTICE();
//     int[] result = p.twoSum(nums, target);
//     System.out.println(Arrays.toString(result));
//    }
// }

// subarray sum equals k
// import java.util.HashMap;
// import java.util.Map;
// public class PRACTICE{
//     public int Subarray(int[] nums, int k){
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0,1);

//         int currsum = 0;
//         int count = 0;
//         for(int num : nums){
//             currsum += num;
//             if(map.containsKey(currsum - k)){
//                 count += map.get(currsum - k);
//             }
//             map.put(currsum, map.getOrDefault(currsum,0) + 1);
//         }
//         return count;
//     }

//     public static void main(String[] args){
//         int[] nums = {1, 2, 4,5,7,8,9,6,3,2,1};
//         int k = 6;
//         PRACTICE p = new PRACTICE();
//         int result = p.Subarray(nums, k);
//         System.out.println(result);
//     }
// }

// HASHMAP

// Two Sum , Longest consecuive integer,  first non - repeating chrachter, group anagrams.


// Two Sum 
// import java.util.*;
// import java.util.HashMap;
// public class PRACTICE{
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i = 0; i < nums.length; i++) {
//             int remaining = target - nums[i];
            
//             // check if complement already exists
//             if(map.containsKey(remaining)) {
//                 return new int[]{map.get(remaining), i};
//             }
            
//             // store current element
//             map.put(nums[i], i);
//         }
        
//         return new int[]{}; // edge case
//     }
//     public static void main(String[] args){
//         int[] nums = {2, 7, 11, 15,6,3};
//         int target = 9;
//         PRACTICE p = new PRACTICE();
//         int[] result = p.twoSum(nums, target);
//         System.out.println(Arrays.toString(result));
//     }   
// }

// Two sum by two pointers
// import java.util.Arrays;
// public class PRACTICE{
//     public int[] TwoSum(int[] nums, int target){
//         int n = nums.length;
//         for(int i = 0; i< n ; i++){
//             int remaining = target - nums[i];
//             int j = i + 1;
//             while(j < n){
//                 if(nums[j] == remaining){
//                     return new int[]{i, j};
//                 }
//                 j++;
//             }
//         }
//         return new int[] {};
//     }
//     public static void main(String[] args){
//         int[] nums = {2, 7, 11, 15,6,3};
//         int target = 9;
//         PRACTICE p = new PRACTICE();
//         int[] result = p.TwoSum(nums, target);
//         System.out.println(Arrays.toString(result));
//     }
// }


//max subarray
// public class PRACTICE{
//     public int maxSubArray(int[] nums){
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;

//         for(int num : nums){
//             currentSum += num;
//             maxSum = Math.max(maxSum, currentSum);
//             if(currentSum < 0){
//                 currentSum = 0;
//             }
//         }
//         return maxSum;
//     }

//     public static void main(String[] args){
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//         PRACTICE p = new PRACTICE();
//         int result = p.maxSubArray(nums);
//         System.out.println(result);
//     }
// }


// // two sum optimized approach withount creating extra space
// import java.util.Arrays;
// public class PRACTICE{
//     public int[] twoSum(int[] nums, int target){
//         Arrays.sort(nums);
//         int i = 0;
//         int j = nums.length - 1;
//         while(i < j){
//             int sum = nums[i] + nums[j];
//             if(sum == target){
//                 return new int[] {nums[i] , nums[j]};
//             }
//             else if(sum < target){
//                 i++;
//             }else{
//                 j--;
//             }
//         }
//         return new int[] {};
//     }
//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15,6,3};
//         int target = 9;
//         PRACTICE p = new PRACTICE();
//         int[] result = p.twoSum(nums, target);
//         System.out.print(Arrays.toString(result));
//     }
// }

// remove duplicates from sorted array
// import java.util.Arrays;
// public class PRACTICE{
//     public int removeDuplicate(int[] nums) {
//         if (nums.length == 0) return 0;

//         int i = 0; // slow pointer (unique elements)

//         for (int j = 1; j < nums.length; j++) { // fast pointer
//             if (nums[j] != nums[i]) {
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }

//         return i + 1; // number of unique elements
//     }
//     public static void main(String[] args) {
//          PRACTICE obj = new PRACTICE();
//         int[] nums = {1, 1, 2, 2, 3, 4, 4};
//         int k = obj.removeDuplicate(nums);
//         System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
//     }
// }

// squares of the sorted array
// import java.util.Arrays;
// public class PRACTICE{
//     public int[] squareSorted(int[] nums){
//         int i = 0;
//         int j = 0;
//         int[] arr = new int[nums.length];
//         while(i < nums.length){
//             arr[j] = nums[i] * nums[i];
//             i++;
//             j++;
//         }
//          Arrays.sort(arr);
//          return arr;
//     }
//     public static void main(String[] args) {
//         int[] nums = {-4,1,2,3,4,5};
//         PRACTICE obj = new PRACTICE();
//         int[] k = obj.squareSorted(nums);
//         System.out.println(Arrays.toString(k));
//     }
// }
// import java.util.Arrays;
// public class PRACTICE{
//     public int[] squareSorted(int[] nums){
//         int n = nums.length;
//         int[] result = new int[n];

//         int left = 0 ; 
//         int right = n-1;
//         int k = n-1;

//         while(left <= right)
//         {
//             int leftsq = nums[left] * nums[left];
//             int rightsq = nums[right] * nums[right];

//             if(leftsq > rightsq){
//                 result[k] = leftsq;
//                 left++;
//             }
//             else{
//                 result[k] = rightsq;
//                 right--;
//             }
//             k--;
//         }
//         return result;
//     }
//      public static void main(String[] args) {
//         int[] nums = {-4,-2,1,2,3,4,5};
//         PRACTICE obj = new PRACTICE();
//         int[] k = obj.squareSorted(nums);
//         System.out.println(Arrays.toString(k));
//     }
// }

// 3 sum closest
// import java.util.Arrays;
// public class PRACTICE{
//     public int threeSumClosest(int[] nums, int target){
//         Arrays.sort(nums);
//         int n = nums.length;
//         int diff = Integer.MAX_VALUE;

//         int res = 0;

//         for(int i = 0; i<n-2; i++){
//             int left = i + 1;
//             int right = n - 1;
//             while(left < right){
//                 int sum = nums[i] + nums[left] + nums[right];
//                 int d = Math.abs(target - sum);
//                 if(d < diff){
//                     diff = d;
//                     res = sum;
//                 }
//                 if(sum == target){
//                     return sum;
//                 }else if(sum < target){
//                     left++;
//                 }else{
//                     right--;
//                 }
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         int[] nums = {-1,2,1,-4};
//         int target = 1;
//         PRACTICE obj = new PRACTICE();
//         int result = obj.threeSumClosest(nums, target);
//         System.out.println(result);
//     }
// }


// sort colors
// public class PRACTICE{
//     public void sortColors(int[] nums){
//         int low = 0;
//         int mid = 0;
//         int high = nums.length - 1;

//         while(mid <= high){
//             if(nums[mid] == 0){
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             }
//             else if(nums[mid] == 1){
//                 mid++;
//             }
//             else{
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
//     public static void main(String[] args){
//         int[] nums = {2,0,2,1,1,0};
//         PRACTICE obj = new PRACTICE();
//         obj.sortColors(nums);
//         for(int num : nums){
//             System.out.print(num + " ");
//         }
//     }
// }

// valid anagram
// public class PRACTICE{
//     public boolean isAnagram(String s, String t){
//         if(s.length() != t.length()){
//             return false;
//         }
//         int[] count = new int[26];
//         for(int i = 0; i < s.length(); i++){
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
//         for(int c : count){
//             if(c != 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         String s = "anagram";
//         String t = "nagaram";
//         PRACTICE obj = new PRACTICE();
//         boolean result = obj.isAnagram(s, t);
//         System.out.println(result);
//     }
// }

// min sub array len
// public class PRACTICE{
//        public int minSubArrayLen(int target, int[] nums) {
//         int n = nums.length;
//         int low = 0;
//         int sum = 0;
//         int minLen = Integer.MAX_VALUE;

//         for(int high = 0; high < n; high++){
//             sum += nums[high];
//             while(sum >= target){
//                  minLen = Math.min(minLen, high - low + 1);
//                 sum -= nums[low];
//                 low++;
//             }
//         }
//          if (minLen == Integer.MAX_VALUE) {
//               return 0;
//           } else {
//           return minLen;
//         }
//     }

//     public static void main(String[] args){
//         int target = 7;
//         int[] nums = {2,3,1,2,4,3};
//         PRACTICE obj = new PRACTICE();
//         int result = obj.minSubArrayLen(target, nums);
//         System.out.println(result);
//     }
// }

//longest substring without repeating charachter
// import java.util.Arrays;
// public class PRACTICE{
//     public int lengthOfLongestSubstring(String s) {
//     int[] lastSeen = new int[256];  // last index of each char
//     Arrays.fill(lastSeen, -1);
    
//     int left = 0, maxlen = 0;
//     for (int right = 0; right < s.length(); right++) {
//         if (lastSeen[s.charAt(right)] >= left) {
//             left = lastSeen[s.charAt(right)] + 1;  // Jump left pointer
//         }
//         lastSeen[s.charAt(right)] = right;
//         maxlen = Math.max(maxlen, right - left + 1);
//     }
//     return maxlen;
// }
//     public static void main(String[] args){
//         String s = "abcabcbb";
//         PRACTICE obj = new PRACTICE();
//         int result = obj.lengthOfLongestSubstring(s);
//         System.out.println(result);
//     }
// }

// longest repeating element replacement 
// public class PRACTICE{
//     public int characterReplacement(String s, int k) {
//     int[] freq = new int[26];           // Count of each uppercase letter
//     int left = 0, maxFreq = 0, maxLen = 0;

//     for (int right = 0; right < s.length(); right++) {
//         // Add current char
//         char c = s.charAt(right);
//         freq[c - 'A']++;

//         // Track highest frequency in window
//         maxFreq = Math.max(maxFreq, freq[c - 'A']);

//         // INVALID window: replacements needed > k
//         while ((right - left + 1) - maxFreq > k) {
//             freq[s.charAt(left) - 'A']--;
//             left++;
//         }

//         maxLen = Math.max(maxLen, right - left + 1);
//     }
//     return maxLen;
// }
//     public static void main(String[] args){
//         String s = "AABABBA";
//         int k = 1;
//         PRACTICE obj = new PRACTICE();
//         int result = obj.characterReplacement(s, k);
//         System.out.println(result);
//     }
// }

//maximum average subarray
// public class PRACTICE{
//     public double findmaxaveragesubarray(int[] nums, int k)
//     {
//          int low = 0;
//         int sum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int high = 0; high < nums.length; high++){
//             sum += nums[high];

//             // when window size becomes k
//             if(high - low + 1 == k){
//                 maxSum = Math.max(maxSum, sum);
//                 sum -= nums[low];
//                 low++;
//             }
//         }

//         return (double) maxSum / k;
//     }

//     public static void main(String[] args){
//         int[] nums = {1,12,-5,-6,50,3};
//         int k = 4;
//         PRACTICE obj = new PRACTICE();
//         double result = obj.findmaxaveragesubarray(nums, k);
//         System.out.println(result);
//     }
// }



// Linked List

// has cycle
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }
// public class PRACTICE{
//     public boolean hasCycle(ListNode head){
//         if(head == null || head.next == null){
//             return false;
//         }
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args){
//         ListNode head = new ListNode(3);
//         ListNode node2 = new ListNode(2);
//         ListNode node3 = new ListNode(0);
//         ListNode node4 = new ListNode(-4);

//         head.next = node2;
//         node2.next = node3;
//         node3.next = node4;
//         node4.next = node2; // creates a cycle

//         PRACTICE obj = new PRACTICE();
//         boolean result = obj.hasCycle(head);
//         System.out.println(result);
//     }
// }

// // merge two sorted lists
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }
// public class PRACTICE{
//     public ListNode mergetwoLists(ListNode l1, ListNode l2){
//         ListNode dummy = new ListNode(0);
//         ListNode tail = dummy;

//         while( l1 != null && l2 != null){
//             if(l1.val < l2.val){
//                 tail.next = l1;
//                 l1 = l1.next;
//             }
//             else{
//                 tail.next = l2;
//                 l2 = l2.next;
//             }
//             tail = tail.next;
//         }
//         return dummy.next;
//     }

//     public static void main(String[] args){
//         ListNode l1 = new ListNode(1);
//         l1.next = new ListNode(2);
//         l1.next.next = new ListNode(4);

//         ListNode l2 = new ListNode(1);
//         l2.next = new ListNode(3);
//         l2.next.next = new ListNode(4);

//         PRACTICE obj = new PRACTICE();
//         ListNode result = obj.mergetwoLists(l1, l2);

//         // Print merged list
//         while(result != null){
//             System.out.print(result.val + " ");
//             result = result.next;
//         }
//     }

// }

// centre node of the list

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// public class PRACTICE{
//     public ListNode middleNode(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         PRACTICE obj = new PRACTICE();
//         ListNode result = obj.middleNode(head);
//         System.out.println(result.val); 
//     }
// }

// remove element
// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(int x){
//         val = x;
//         next = null;
//     }
// }

// public class PRACTICE{
//     public ListNode removeElements(ListNode head, int val){
//         while(head != null && head.val == val){
//             head = head.next;
//         }

//         ListNode curr = head;
//         while(curr != null && curr.next != null){
//             if(curr.next.val == val){
//                 curr.next = curr.next.next;
//             }
//             else{
//                 curr = curr.next;
//             }
//         }
//         return head;
//     }

//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(6);
//         head.next.next.next = new ListNode(3);
//         head.next.next.next.next = new ListNode(4);
//         head.next.next.next.next.next = new ListNode(5);
//         head.next.next.next.next.next.next = new ListNode(6);

//         int val = 5;
//         PRACTICE obj = new PRACTICE();
//         ListNode result = obj.removeElements(head, val);

//         // Print modified list
//         while(result != null){
//             System.out.print(result.val + " ");
//             result = result.next;
//         }
//     }
// }


//fibonacci numbers

public class PRACTICE{
    public int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        int n = 10;
        PRACTICE obj = new PRACTICE();
        int result = obj.fib(n);
        System.out.println(result);
    }
}