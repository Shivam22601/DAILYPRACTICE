
import java.lang.reflect.Array;

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


// two sum optimized approach withount creating extra space
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

//remove duplicates from sorted list
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
import java.util.Arrays;
public class PRACTICE{
    public int[] squareSorted(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        int left = 0 ; 
        int right = n-1;
        int k = n-1;

        while(left <= right)
        {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq > rightsq){
                result[k] = leftsq;
                left++;
            }
            else{
                result[k] = rightsq;
                right--;
            }
            k--;
        }
        return result;
    }
     public static void main(String[] args) {
        int[] nums = {-4,-2,1,2,3,4,5};
        PRACTICE obj = new PRACTICE();
        int[] k = obj.squareSorted(nums);
        System.out.println(Arrays.toString(k));
    }
}