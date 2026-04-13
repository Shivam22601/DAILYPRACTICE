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
import java.util.*;
public class PRACTICE{
    public int[] twoSum(int[] nums, int target){
        int n =  nums.length;
        for(int i = 0; i < n ; i++){
            int remaining = target - nums[i];
            int  j = i + 1;
            while(j < n){
                if(nums[j] == remaining){
                    return new int[]{i, j};
                }
                j++;
            }
        }
            return new int[] {};
   }

   public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    PRACTICE p = new PRACTICE();
    int[] result = p.twoSum(nums, target);
    System.out.println(Arrays.toString(result));
   }
}