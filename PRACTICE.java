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
public class PRACTICE{
    public int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int num : nums){
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        PRACTICE p = new PRACTICE();
        int result = p.maxSubArray(nums);
        System.out.println(result);
    }
}